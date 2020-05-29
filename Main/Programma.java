package Main;
import Conn_Server.*;

public class Programma {
    public static void main(String[] args) {
        String url= "https://wd4hfxnxxa.execute-api.us-east-2.amazonaws.com/dev/user/1.1/statuses/retweets_of_me.json";
        ConnessioneAPI connessione = new ConnessioneAPI(url);
        System.out.println(connessione.dati_api());

    }
}