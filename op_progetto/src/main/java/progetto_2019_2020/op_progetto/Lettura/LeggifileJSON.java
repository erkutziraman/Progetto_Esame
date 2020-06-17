/**
 * Tutti i dati essendo stati registrati dentro twitter1.json dopo la prima connessione al API
 * questa classe effetua la lettura dal file twitter1 
 * @author TOYEM RYAN
 */

package progetto_2019_2020.op_progetto.Lettura;

import java.io.*;

public class LeggifileJSON extends LeggiStringa {
    private String api;

    public LeggifileJSON() {
        api = "twitter1.json";
        file = new File(api);
    }

    /**
     * questo metodo effetua la lettura dal file twitter1 e ci restituisce una
     * Stringa
     * 
     * @return data
     */
    public String data_file() {
        try {
            buf = new BufferedReader(new FileReader(file));
            data = string_letta();
            buf.close();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e1) {
            e1.printStackTrace();
        }
        return data;
    }

    public String getApi() {
        return api;
    }

    public void setApi(String api) {
        this.api = api;
    }
}
