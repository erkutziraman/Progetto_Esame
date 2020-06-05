/**
 * Classe che prende i dati dal file JSON salvato nel caso in cui non 
 * si riesce a connettere al server.
 * @author TOYEM RYAN
 */

package progetto_2019_2020.Lettura;

import java.io.*;

public class LeggifileJSON extends LeggiStringa {
    String api;

    public LeggifileJSON() {
        api = "Conn_Server\\twitter1.json";
        file = new File(api);
    }
    public String data_file() {
        try {
            buf = new BufferedReader(new FileReader(file));
            data = string_letta();
            buf.close();
        } catch (FileNotFoundException e) {
            e.printStackTrace();  
            }catch (IOException e1) {
                e1.printStackTrace();
            }
        return data;
    }
}
