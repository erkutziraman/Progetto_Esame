/**
 * Classe che prende i dati dal file JSON salvato nel caso in cui non 
 * si riesce a connettere al server.
 * @author TOYEM RYAN
 */

package progetto_2019_2020.op_progetto.Lettura;


import java.io.*;

public class LeggifileJSON extends LeggiStringa {
    String api;

    public LeggifileJSON() {
        api = "twitter1.json"; // C:\\Users\\erkut\\Desktop\\Progetto\\op_progetto\\src\\main\\java\\progetto_2019_2020\\
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

    public String getApi() {
        return api;
    }

    public void setApi(String api) {
        this.api = api;
    }
}
