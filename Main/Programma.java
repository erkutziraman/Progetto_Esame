package Main;

import Conn_Server.*;

public class Programma {
    public static void main(String[] args) {
        String url = "https://wd4hfxnxxa.execute-api.us-east-2.amazonaws.com/dev/user/1.1/statuses/retweets_of_me.json";
        String api = "C:\\Users\\HP\\Desktop\\progetto PO\\Conn_Server\\twitter1.json";
        ConnessioneAPI connessione = new ConnessioneAPI(url);

        System.out.println(connessione.dati_api());
        if (connessione.dati_api() == "0") {
            LeggifileJSON file_json = new LeggifileJSON(api);
            System.out.println(file_json.data_file());
        }

    }
}