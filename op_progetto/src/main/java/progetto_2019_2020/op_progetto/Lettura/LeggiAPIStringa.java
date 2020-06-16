/**
 * classe impostata specialmente per fare la connessione al'API 
 * gestendo il fatto che se non c'è connessione andiamo a prendere gli informazioni sul file salvato
 */
package progetto_2019_2020.op_progetto.Lettura;
import java.io.*;

import progetto_2019_2020.op_progetto.Conn_Server.ConnessioneSearch;


public class LeggiAPIStringa extends LeggiStringa {
    String a="";
    String url="";
    int i=0;

         /**
         * gestione del meccanismo di lettura con diverse chiamate 
         * gestione del caso di connessione che impedisce la lettura sia dal server che dal file salvato
         * @return a nei due casi
         */
    public String leggi() {
        boolean validazione = false;
        ConnessioneSearch connessione = new ConnessioneSearch();

        for (i=0; i < 20 && connessione.isValido() != true; i++) {
            try{
            url = connessione.getUrl()+ ".json?q=%23" + connessione.getRicerche_tweet()[i] + "&count=100";
            connessione.Ids(url);
            in = connessione.getConnessione().getInputStream();
            inR=new InputStreamReader(in);
            buf=new BufferedReader(inR);
            try{
                if(i==19){
                    a= string_letta();
                }else{
                   a= leggi_virgola();
                }
            }finally{
                in.close();
            }} catch (IOException e) {
                validazione=true;
                connessione.setValido(validazione);
                e.printStackTrace();
            }
    }
    if (i==20){
        a="[" + a + "]";
    }
    if(connessione.isValido()!=false){
        LeggifileJSON lettura_file=new LeggifileJSON();
        a = lettura_file.data_file();
    }
        if(connessione.isValido()!=true){
         try {
        File file=new File("twitter1.json"); // C:\\Users\\HP\\Desktop\\progetto PO\\op_progetto\\src\\main\\java\\progetto_2019_2020\\op_progetto\\
        PrintWriter output=new PrintWriter(new BufferedWriter(new FileWriter(file)));
        output.println(a);
        output.close();
    } catch (IOException e) {
        e.printStackTrace();
    }    
    }
   

return a;
}

/**
 * lettura del flux venendo dal metodo leggi agguingendo la virgola
 * @return data
 */
public String leggi_virgola(){
    try {
        while ((line=buf.readLine()) != null) {
            data += line + ",";
        }
    } catch (IOException e) {
        e.printStackTrace();
    }
    return data;
}
}
