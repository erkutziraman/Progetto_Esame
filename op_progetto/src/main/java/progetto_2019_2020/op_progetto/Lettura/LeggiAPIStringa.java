/**
 * classe impostata specialmente per chiedere la connessione al'API ma sopprattutto scrivendo i dati dentro il file twitter1
 * gestendo il fatto che se non c'è connessione 
 */
package progetto_2019_2020.op_progetto.Lettura;

import java.io.*;
import progetto_2019_2020.op_progetto.Conn_Server.ConnessioneSearch;

public class LeggiAPIStringa extends LeggiStringa {
    private String a = "";
    private String url = "";
    private int i = 0;

    /**
     * gestione del meccanismo di lettura con diverse chiamate
     * 
     * tutto ciò che viene raccolto dall'API viene prima registro dentro la stringa
     * a e poi registro nel file supporto twitter1.json
     * 
     * gestione del caso di connessione che impedisce la scrittura dentro twitter1
     * in caso di non connessione alla rete internet
     * 
     * @return a nei due casi
     */
     public String leggi() {
        boolean validazione = false;
        ConnessioneSearch connessione = new ConnessioneSearch();

        for (i = 0; i < 20 && connessione.isValido() != true; i++) {
            try {
                url = connessione.getUrl() + "?q=%23" + connessione.getRicerche_tweet()[i] + "&count=100";
                connessione.Ids(url);
                in = connessione.getConnessione().getInputStream();
                inR = new InputStreamReader(in);
                buf = new BufferedReader(inR);
                try {
                    if (i == 19) {
                        a = string_letta();
                    } else {
                        a = leggi_virgola();
                    }
                } finally {
                    in.close();
                }
            } catch (IOException e) {
                validazione = true;
                connessione.setValido(validazione);
                e.printStackTrace();
            }
        }
        if (i == 20) {
            a = "[" + a + "]";
        }
        if (connessione.isValido() != false) {
            LeggifileJSON lettura_file = new LeggifileJSON();
            a = lettura_file.data_file();
        }
        if (connessione.isValido() != true) {
            try {
                File file = new File("twitter1.json");
                PrintWriter output = new PrintWriter(new BufferedWriter(new FileWriter(file)));
                output.println(a);
                output.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }

        return a;
    }

    /**
     * lettura del flux venendo dal metodo leggi agguingendo la virgola dopo ogni
     * oggetto JSON
     * 
     * @return data
     */
    private String leggi_virgola() {
        try {
            while ((line = buf.readLine()) != null) {
                data += line + ",";
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
        return data;
    }
}
