/**
 * Classe che prende i dati dal file JSON salvato nel caso in cui non 
 * si riesce a connettere al server.
 * @author TOYEM RYAN
 */

package Conn_Server;

import java.io.*;

public class LeggifileJSON {
    File file;
    String api;

    /**
     * IL costruttore senza parametri.
     */
    public LeggifileJSON() {
        api = "Conn_Server\\twitter1.json";
        this.file = new File(api);
    }

    /**
     * Il metodo che riceve il file Json salvato.<i>file</i>
     * 
     * @return Una Stringa in formato Json.
     * @throws Lancia eccezione se non trova il file.
     */
    public String data_file() {
        String line = "";
        String data = "";
        try {
            BufferedReader reader = new BufferedReader(new FileReader(file));
            while ((line = reader.readLine()) != null) {
                data += line;
            }
            reader.close();
        } catch (IOException e) {
            System.out.println("ERRORE di I/O");
            System.out.println(e);
        }
        return data;
    }
}
