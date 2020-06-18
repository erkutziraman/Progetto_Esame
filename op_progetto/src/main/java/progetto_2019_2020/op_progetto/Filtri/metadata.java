package progetto_2019_2020.op_progetto.Filtri;

import java.util.*;

import progetto_2019_2020.op_progetto.Preleva_Informazioni.GetLabs;
import progetto_2019_2020.op_progetto.Preleva_Informazioni.Tweet;
import progetto_2019_2020.op_progetto.Preleva_Informazioni.TweetIncludes;
import progetto_2019_2020.op_progetto.Preleva_Informazioni.TweetMetadata;

/**
 * Questa classe è stata impostata in questo modo nello scopo di poter ben
 * sistemare il risultato finale metadata
 */
public class metadata {
    private Vector<TweetMetadata> tweetmetadata = new Vector<TweetMetadata>();
    private GetLabs lab = new GetLabs();
    private Vector<Tweet> str;
    private Vector<TweetIncludes> str2;

    /**
     * Questo metodo prende i Vettori "str" e "str2" che sono stati aggiornati
     * dentro GetLabs, creando un altro oggetto "tweetmetadata" con dei campi più
     * specificati, scorriamo i due vettore(str, str2) e aggiorniamo i dati in
     * maniera più pulita dentro tweetmetadata
     * 
     * @return tweetmetadata
     */
    public Vector<TweetMetadata> leggimetadata() {
        this.str = lab.Labs2();
        this.str2 = lab.getTweetincludes();
        String created_at = "";
        String text = "";
        String place_id = "";
        String country = "";
        String location = "";
        for (int i = 0; i < str.size(); i++) {
            created_at = str.get(i).getCreated_at();
            text = str.get(i).getText();
            place_id = str.get(i).getPlace_id();
            for (int j = 0; j < str2.size(); j++) {
                if (str2.get(j).getId().equals(place_id)) {
                    country = str2.get(j).getCountry();
                    location = str2.get(j).getLocation();
                }
            }
            TweetMetadata Metadata = new TweetMetadata(created_at, text, place_id, country, location);
            this.tweetmetadata.add(Metadata);
        }
        return tweetmetadata;
    }

    /**
     * 
     * @return Restituisce la struttura json creato per metadata.
     */
    public Vector<TweetMetadata> getTweetmetadata() {
        return tweetmetadata;
    }

    /**
     * Imposta la struttura json creato per metadata.
     * 
     * @param tweetmetadata
     */
    public void setTweetmetadata(Vector<TweetMetadata> tweetmetadata) {
        this.tweetmetadata = tweetmetadata;
    }

    /**
     * 
     * @return Restituisce la struttura Tweet.
     */
    public Vector<Tweet> getStr() {
        return str;
    }

    /**
     * Imposta la struttura Tweet.
     * 
     * @param str
     */
    public void setStr(Vector<Tweet> str) {
        this.str = str;
    }

}
