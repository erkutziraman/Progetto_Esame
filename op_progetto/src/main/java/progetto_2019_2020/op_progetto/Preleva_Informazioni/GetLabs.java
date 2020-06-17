/**
 * classe codificata per leggere i dati da twitter(dati venendo da labs)
 * il parsing ci permette di prelevare e inserire i dati specificati dentro gli oggetti
 * per poter essere usato meglio
 */

package progetto_2019_2020.op_progetto.Preleva_Informazioni;

import java.io.File;
import java.io.FileReader;
import java.util.Vector;

import org.json.simple.parser.*;
import progetto_2019_2020.op_progetto.Lettura.*;
import org.json.simple.JSONObject;
import org.json.simple.JSONArray;

public class GetLabs {
    protected LeggiLabs Labs = new LeggiLabs();
    protected Vector<Tweet> tweet = new Vector<Tweet>();
    public Vector<TweetIncludes> tweetincludes = new Vector<TweetIncludes>();
    protected JSONParser parser = new JSONParser();
    protected JSONObject obj = null;
    protected JSONArray data = null;
    protected JSONObject includes = null;
    File file = new File("twitter2.json");

    /**
     * metodo impostato per effetuare il parsing dei dati contenuti dentro
     * twitter2.json con dei metodi in riferimento alla struttura del JSON
     * preleviamo gli informazioni specificati in realtà qui stiamo aggiornando due
     * Vettore della classe Vector "tweetincludes" e "tweet" questa classe ci
     * restituisce tweet, per tweetincludes avremmo bisogno del metodo
     * getTweetincludes
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

    public void setTweetincludes(Vector<TweetIncludes> tweetincludes) {
        this.tweetincludes = tweetincludes;
    }

    public Vector<Tweet> getTweet() {
        return tweet;
    }

    public void setTweet(Vector<Tweet> tweet) {
        this.tweet = tweet;
    }

}
