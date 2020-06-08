package progetto_2019_2020.op_progetto.Preleva_Informazioni;

import java.util.Vector;

import org.json.simple.parser.*;
import progetto_2019_2020.op_progetto.Lettura.*;
import org.json.simple.JSONObject;
import org.json.simple.JSONArray;

public class GetLabs {
    protected LeggiLabs Labs = new LeggiLabs();
    protected Vector<Tweet> tweet = new Vector<Tweet>();
    protected Vector<TweetIncludes> tweetincludes = new Vector<TweetIncludes>();
    protected JSONParser parser = new JSONParser();
    protected JSONObject obj = null;
    protected JSONArray data = null;
    protected JSONObject includes = null;

    public Vector<Tweet> Labs2() {

        try {
            obj = (JSONObject) parser.parse(Labs.LetturaLabs());
        } catch (Exception e) {
            System.out.println("probem de parsing");
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
                Tweet tweet_lab = new Tweet(created_at,text,place_id);
                tweet.add(tweet_lab);
                }
                for(int j=0;j<places.size();j++){
                    JSONObject places_value = (JSONObject) places.get(j);
                    String country = (String.valueOf(places_value.get("country")));
                    String location = (String.valueOf(places_value.get("full_name")));
                    String id = (String.valueOf(places_value.get("id")));
                    TweetIncludes tweet_lab_includes =new TweetIncludes(country, id, location);
                    tweetincludes.add(tweet_lab_includes);
    
                } 
                }catch (Exception e) {
                System.out.println("L'objet n'est pas trouver");
            }
     //   System.out.print("voir la classe VEttore " + tweet);
       // System.out.print("voir la classe VEttore " + tweetincludes);
      //  System.out.println("la dimension de l'array est " + tweet.size());
       // System.out.println("la dimension de l'array est " + tweetincludes.size());

        return tweet;
    }

}
