package progetto_2019_2020.Conn_Server;
public class ConnessioneIds extends ConnessioneAPI {
    String url;
    public void  Prendiinformazione(String id){
        url_2=url_2+id;
        url=url_2+"&expansions=geo.place_id&place.fields=country,geo&tweet.fields=created_at";
        url_2=url_2+",";
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }
}