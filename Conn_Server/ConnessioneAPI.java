
/**
 * ConnessioneAPI
 * @author ERKUT ZIRAMAN
 */
package Conn_Server;

import java.net.*;
import java.io.*;

public class ConnessioneAPI {
    URLConnection connessione;
    String data;
    String line;
    InputStreamReader inR;
    BufferedReader buf;
    InputStream in;
    String url;

    /**
     * Costruttore Connessione API che prende come parametro un url
     */
    
    public ConnessioneAPI(String url) {
        data = "";
        line = "";
        this.url = url;
    }
/**
 * Metodo che scarica dati dal server API
 * @return data in formato Json
 */
    public String dati_api(){
        try {
        connessione = new URL(url).openConnection();
        connessione.addRequestProperty("User-Agent","Mozilla/5.0 (Macintosh; U; Intel Mac OS X 10.4; en-US; rv:1.9.2.2) Gecko/20100316 Firefox/3.6.2");
        in = connessione.getInputStream();
        inR = new InputStreamReader(in);
        buf = new BufferedReader(inR);
        try {   
            while ((line = buf.readLine()) != null) {
                data += line;

            }
            }finally {
                        in.close();
                    } 
                }catch (IOException e) {
                        e.printStackTrace();
        }
        return data;
}
}