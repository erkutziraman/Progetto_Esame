package progetto_2019_2020.op_progetto.Filtri;

import java.util.Vector;

import progetto_2019_2020.op_progetto.Preleva_Informazioni.TweetMetadata;

/**
 * La classe che effettua i filtri su Country presenti nei tweet.
 */
public class FiltriCountry {

    private Vector<TweetMetadata> tweet_Country = new Vector<TweetMetadata>();

    /**
     * Meccanismo For che seleziona i tweet dei paesi identici
     * 
     * @param a
     * @param c
     * @return Restituisce tutti i tweet scritti in un paese dato.
     */
    public Vector<TweetMetadata> get_tweet_Country(String a, Vector<TweetMetadata> c) {

        for (int i = 0; i < c.size(); i++) {
            if (c.get(i).getCountry().equals(a)) {
                TweetMetadata data = c.get(i);
                tweet_Country.add(data);
            }
        }
        return tweet_Country;
    }

}