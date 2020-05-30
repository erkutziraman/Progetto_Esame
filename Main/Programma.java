package Main;
import Stampa.*;
import Conn_Server.*;

public class Programma {
    public static void main(String[] args) {
        String url = "https://wd4hfxnxxa.execute-api.us-east-2.amazonaws.com/dev/api/1.1/search/tweets.json";
        String api = "Conn_Server\\twitter1.json";
        ConnessioneAPI connessione = new ConnessioneAPI(url);
        Output stampa=new Output();
        stampa.stampa_oggetti(connessione.dati_api());
        if (connessione.dati_api() == "0") {
            LeggifileJSON file_json = new LeggifileJSON(api);
        stampa.stampa_oggetti(file_json.data_file());
        }

    }
}