package Conn_Server;

import java.net.*;
import java.io.*;

/**
 * La classe per fare la connessione API con le ricerche.
 * 
 * @author ERKUT ZIRAMAN
 */
public class ConnessioneAPI{
    URLConnection connessione;
    String url;
    boolean valido=false;
    int i=0;
    public ConnessioneAPI() {
        url = "https://wd4hfxnxxa.execute-api.us-east-2.amazonaws.com/dev/api/1.1/search/tweets.json";
    }
    public void dati_api(String a) {
          try{
            connessione = new URL(a).openConnection();
            connessione.addRequestProperty("User-Agent",
                    "Mozilla/5.0 (Macintosh; U; Intel Mac OS X 10.4; en-US; rv:1.9.2.2) Gecko/20100316 Firefox/3.6.2");
                    
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public URLConnection getConnessione() {
        return connessione;
    }

    public void setConnessione(URLConnection connessione) {
        this.connessione = connessione;
    }

    public boolean isValido() {
        return valido;
    }

    public void setValido(boolean valido) {
        this.valido = valido;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }
}