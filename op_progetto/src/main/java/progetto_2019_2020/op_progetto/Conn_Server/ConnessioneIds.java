package progetto_2019_2020.op_progetto.Conn_Server;

public class ConnessioneIds extends ConnessioneAPI {
    private String url;

    /**
     * Ad ogni ciclo che il metodo leggiLabs fa questa classe prende come parametro
     * un Id e 
     * lo agguinge dentro url_2(creata nella super classe) 
     * lo agguinge dentro url con una stringa particolata(stiamdo costituendo url della ricerca labs) 
     * ultima comanda che si fa dentro url_2 serve a mettere la virgola dietro
     * ogni ID necessaria per effetuare le richieste
     * 
     * @param id
     */
    public void Prendiinformazione(String id) {
        url_2 = url_2 + id;
        url = url_2 + "&expansions=geo.place_id&place.fields=country,geo&tweet.fields=created_at";
        url_2 = url_2 + ",";
    }

    /**
     * @return url
     */
    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }
}