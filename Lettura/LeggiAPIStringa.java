/**
 * classe impostata specialmente per fare la connessione al'API 
 * gestendo il fatto che se non c'è connessione andiamo a prendere gli informazioni sul file salvato
 */
package Lettura;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.*;

import Conn_Server.ConnessioneSearch;

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
            url = connessione.getUrl()+ "?q=%23" + connessione.getRicerche_tweet()[i] + "&count=100";
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
    if(connessione.isValido()==true){
        LeggifileJSON lettura_file=new LeggifileJSON();
       a = lettura_file.data_file();
    }
    try {
        File file=new File("Conn_Server\\twitter1.json");
        BufferedWriter output=new BufferedWriter(new FileWriter(file));
        output.write(a);
        output.close();
    } catch (IOException e) {
        e.printStackTrace();
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
