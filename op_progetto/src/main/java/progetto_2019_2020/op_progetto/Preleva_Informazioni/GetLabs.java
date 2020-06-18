
package progetto_2019_2020.op_progetto.Preleva_Informazioni;

import java.io.File;
import java.io.FileReader;
import java.util.Vector;

import org.json.simple.parser.*;
import progetto_2019_2020.op_progetto.Lettura.*;
import org.json.simple.JSONObject;
import org.json.simple.JSONArray;

/**
 * La classe codificata per leggere i dati dal file supporto "twitter2" il
 * parsing ci permette di prelevare e inserire i dati specificati dentro gli
 * oggetti per poter essere usato meglio
 */
public class GetLabs {
    protected LeggiLabs Labs = new LeggiLabs();
    private Vector<Tweet> tweet = new Vector<Tweet>();
    private Vector<TweetIncludes> tweetincludes = new Vector<TweetIncludes>();
    private JSONParser parser = new JSONParser();
    private JSONObject obj = null;
    private JSONArray data = null;
    private JSONObject includes = null;
    private File file = new File("twitter2.json");

    /**
     * Questo metodo è stato impostato per effetuare il parsing dei dati contenuti
     * dentro twitter2.json. con la libreria org.json tiriamo fuori dei campi(dati
     * contenuti dentro twitter2) che ci servono.
     * 
     * qui stiamo aggiornando due Vettori della classe Vector "tweetincludes" e
     * "tweet"
     * 
     * @return tweet
     */
    public Vector<Tweet> Labs2() {

        try {
            obj = (JSONObject) parser.parse(new FileReader(file));
        } catch (Exception e) {
            System.out.println("probema di parsing");
            e.printStackTrace();
        }
        data = (JSONArray) obj.get("data");
        includes = (JSONObject) obj.get("includes");
        JSONArray places = (JSONArray) includes.get("places");

        try {
            for (int i = 0; i < data.size(); i++) {
                JSONObject data_value = (JSONObject) data.get(i);
                JSONObject geo = (JSONObject) data_value.get("geo");
                String created_at = (String.valueOf(data_value.get("created_at")));
                String text = (String.valueOf(data_value.get("text")));
                String place_id = (String.valueOf(geo.get("place_id")));
                Tweet tweet_lab = new Tweet(created_at, text, place_id);
                tweet.add(tweet_lab);
            }
            for (int j = 0; j < places.size(); j++) {
                JSONObject places_value = (JSONObject) places.get(j);
                String country = (String.valueOf(places_value.get("country")));
                String location = (String.valueOf(places_value.get("full_name")));
                String id = (String.valueOf(places_value.get("id")));
                TweetIncludes tweet_lab_includes = new TweetIncludes(country, id, location);
                tweetincludes.add(tweet_lab_includes);

            }
        } catch (Exception e) {
            System.out.println("L'oggetto non è stata trovata");
        }

        return tweet;
    }

    /**
     * @return tweetincludes
     */
    public Vector<TweetIncludes> getTweetincludes() {
        return tweetincludes;
    }

    /**
     * @param tweetincludes
     */
    public void setTweetincludes(Vector<TweetIncludes> tweetincludes) {
        this.tweetincludes = tweetincludes;
    }

    /**
     * @return tweet
     */
    public Vector<Tweet> getTweet() {
        return tweet;
    }

    /**
     * @param tweet
     */
    public void setTweet(Vector<Tweet> tweet) {
        this.tweet = tweet;
    }

}
