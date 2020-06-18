package progetto_2019_2020.op_progetto.Filtri;

import java.util.Vector;

import progetto_2019_2020.op_progetto.Preleva_Informazioni.TweetMetadata;

/**
 * La classe impostata per dare i dati che sono stati filtrati sulla
 * localizzazione specificata
 */
public class FiltriLocation {
    private Vector<TweetMetadata> tweet_location = new Vector<TweetMetadata>();

    /**
     * Il meccanismo For che seleziona i tweet con location identiche.
     * 
     * @param a
     * @param s
     * @return Restituisce tutti i tweet scritti in un location dato.
     */
    public Vector<TweetMetadata> get_tweet_location(String a, Vector<TweetMetadata> s) {
        for (int i = 0; i < s.size(); i++) {
            if (s.get(i).getPlace_id().equals(a)) {
                TweetMetadata data = s.get(i);
                tweet_location.add(data);
            }
        }
        return tweet_location;
    }
}