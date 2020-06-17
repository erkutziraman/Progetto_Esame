/**
 * Classe per fare la connessione l'API con le ricerche.
 * l'abbiamo impostata per essere chiamata effettuando le connessioni con i URL specificati cui sopra
 * 
 * @author ERKUT ZIRAMAN
 */

package progetto_2019_2020.op_progetto.Conn_Server;

import java.net.*;
import java.io.*;

public class ConnessioneAPI {
    private URLConnection connessione;
    protected String url;
    protected String url_2;
    private boolean valido = false;
    protected int i = 0;

    public ConnessioneAPI() {
        url = "https://wd4hfxnxxa.execute-api.us-east-2.amazonaws.com/dev/api/1.1/search/tweets.json";
        url_2 = "https://wd4hfxnxxa.execute-api.us-east-2.amazonaws.com/dev/api/labs/2/tweets?ids=";
    }

    /**
     * metodo che fa la connessione e la verifica con IO exception al server 
     * 
     * @exception IO
     * @param a
     */
    public void dati_api(String a) {
        try {
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

    public String getUrl_2() {
        return url_2;
    }

    public void setUrl_2(String url_2) {
        this.url_2 = url_2;
    }
}
