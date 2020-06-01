package Conn_Server;
import java.net.*;
import java.io.*;
/**
 * La classe per fare la connessione API con le ricerche.
 * @author ERKUT ZIRAMAN
 */
public class ConnessioneAPI {
    URLConnection connessione;
    String data;
    String line;
    String a;
    boolean valido;
    String url_ricerche = "";
    int i=0;
    InputStreamReader inR;
    BufferedReader buf;
    InputStream in;
    String url;
    String ricerche_tweet[] = { "Love", "Life","Sunrise", "Food", "Restaurant", "Discovery", "News", "tbt",
            "univpm", "France", "Italy", "Holland", "Tourism", "Travel", "Rome", "Portugal", "England", "Iceland",
            "China", "Poland" };
    public ConnessioneAPI() {
        data = "";
        line = "";
        url = "https://wd4hfxnxxa.execute-api.us-east-2.amazonaws.com/dev/api/1.1/search/tweet";
    }

    public String dati_api() {
       boolean validazione=false;
        try {
            connessione = new URL(url_ricerche).openConnection();
            connessione.addRequestProperty("User-Agent",
                    "Mozilla/5.0 (Macintosh; U; Intel Mac OS X 10.4; en-US; rv:1.9.2.2) Gecko/20100316 Firefox/3.6.2");
            in = connessione.getInputStream();
            inR = new InputStreamReader(in);
            buf = new BufferedReader(inR);
            try {
                if(i==19){
                    while ((line = buf.readLine()) != null) {
                        this.data+=line;
                    }
                }else{
                while ((line = buf.readLine()) != null) {
                    this.data+=line+",";
                }
            }
            } finally {
                in.close();
            }
        } catch (IOException e) {
            validazione=true;
            valido=validazione;
            e.printStackTrace();

        }
        return data;
    }
/**
 * Costruisce il file Json che contiene tutti i tweet.
 * @return Una stringa che contiene tutti i tweet.
 */
    public String ids() {
        String s="";
        for ( i = 0; i < 20 && valido!=true; i++) {
            this.url_ricerche = url  + "?q=%23" + ricerche_tweet[i] + "&count=100";
            s=dati_api();
        }
        if(i==20) s="["+s+"]";
        //System.out.println(s);
        if (valido == true) {
            LeggifileJSON file_json = new LeggifileJSON();
            s="";
            s=file_json.data_file();
        }
        try {
            File file=new File("Conn_Server\\twitter1.json");
            BufferedWriter output=new BufferedWriter(new FileWriter(file));
            output.write(s);
            output.close();
        } catch (IOException e) {
            e.printStackTrace();
        }

        return s;
    }
}