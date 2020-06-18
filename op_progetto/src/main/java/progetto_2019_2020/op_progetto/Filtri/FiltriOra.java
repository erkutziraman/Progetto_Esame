package progetto_2019_2020.op_progetto.Filtri;

import java.util.Vector;

import progetto_2019_2020.op_progetto.Preleva_Informazioni.TweetMetadata;

/**
 * La classe impostata per dare i dati che sono stati filtrati sull'Ora
 * specificato.
 */
public class FiltriOra {
    private Vector<TweetMetadata> tweet_time = new Vector<TweetMetadata>();

    /**
     * Il meccanismo For che seleziona i tweet con le Ore identiche.
     * 
     * @param a
     * @param t
     * @return Restituisce tutti i tweet che sono scritti in un ora dato.
     */
    public Vector<TweetMetadata> get_tweet_time(String a, Vector<TweetMetadata> t) {

        for (int i = 0; i < t.size(); i++) {
            if (t.get(i).getCreated_at().substring(11, 13).equals(a)) {
                TweetMetadata data = t.get(i);
                tweet_time.add(data);
            }
        }
        return tweet_time;
    }

    /**
     * 
     * @param a
     * @param t
     * @return Restituisce tutti i tweet da un ora dato in poi.
     */
    public Vector<TweetMetadata> get_tweet_greater(String a, Vector<TweetMetadata> t) {
        int x = Integer.parseInt(a);
        int y;
        for (int i = 0; i < t.size(); i++) {
            y = Integer.parseInt(t.get(i).getCreated_at().substring(11, 13));
            if (x <= y) {
                TweetMetadata data = t.get(i);
                tweet_time.add(data);

            }
        }
        return tweet_time;
    }

    /**
     * 
     * @param a
     * @param t
     * @return Restituisce tutti i tweet prima di un ora dato.
     */
    public Vector<TweetMetadata> get_tweet_smaller(String a, Vector<TweetMetadata> t) {
        int x = Integer.parseInt(a);
        int y;
        for (int i = 0; i < t.size(); i++) {
            y = Integer.parseInt(t.get(i).getCreated_at().substring(11, 13));
            if (x > y) {
                TweetMetadata data = t.get(i);
                tweet_time.add(data);

            }
        }
        return tweet_time;
    }
}