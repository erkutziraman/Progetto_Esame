package progetto_2019_2020.op_progetto.Conn_Server;

/**
 * Classe che fa la connessione con gli id a Labs.
 */
public class ConnessioneIds extends ConnessioneAPI {
    private String url;

    /**
     * Prepara url Twitter Labs inserendo gli id per la connessione.
     * 
     * @param id
     */
    public void Prendiinformazione(String id) {
        url_2 = url_2 + id;
        url = url_2 + "&expansions=geo.place_id&place.fields=country,geo&tweet.fields=created_at";
        url_2 = url_2 + ",";
    }

    /**
     * @return Ci restituisce url per la connessione a Labs.
     */
    public String getUrl() {
        return url;
    }

    /**
     * Imposta url per la connessione a Labs.
     * 
     * @param url
     */
    public void setUrl(String url) {
        this.url = url;
    }
}