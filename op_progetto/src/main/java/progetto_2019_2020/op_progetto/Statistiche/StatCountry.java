package progetto_2019_2020.op_progetto.Statistiche;

import java.util.Vector;
import progetto_2019_2020.op_progetto.Preleva_Informazioni.TweetMetadata;

public class StatCountry {

    int b;
    String c = "";

    public void get_StatFiltriCountry(String a, Vector<TweetMetadata> s) {

        int t = 0;
        for (int i = 0; i < s.size(); i++) {
            if (s.get(i).getCountry().equals(a)) {
                t++;
                this.b = t;
            }
        }
    }

    public Statmain risultato() {
        String description = "Questa statistica ci restituisce il numero di tweet che sono stati postati nel paese selezionato";
        int risultato = b;
        Statmain statmain = new Statmain(description, risultato);
        return statmain;
    }

}