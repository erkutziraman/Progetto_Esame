package Preleva_Informazioni;

import java.util.HashSet;
//import java.util.Vector;

import org.json.simple.parser.*;
import Lettura.*;
import org.json.simple.JSONObject;
import org.json.simple.JSONArray;

public class GetLabs {
    protected LeggiLabs Labs = new LeggiLabs();
    protected HashSet<Tweet> tweet = new HashSet<Tweet>();
    protected JSONParser parser = new JSONParser();
    protected JSONObject obj = null;
    protected JSONArray data = null;
    protected JSONObject includes = null;

    public HashSet<Tweet> Labs2() {

        try {
            obj = (JSONObject) parser.parse(Labs.LetturaLabs());
        } catch (Exception e) {
            System.out.println("probem de parsing");
            e.printStackTrace();
        }
        data = (JSONArray) obj.get("data");
        includes=(JSONObject) obj.get("includes");
        JSONArray places=(JSONArray) includes.get("places");
        for (int i = 0; i < data.size(); i++) {
            try {
                JSONObject data_value=(JSONObject)data.get(i);
                JSONObject places_value=(JSONObject)places.get(i);
               // JSONObject created_at=(JSONObject)data_value.get("created_at");
               String created_at=(String.valueOf(data_value.get("created_at")));
              //  JSONObject id=//(JSONObject)data_value.get("id");
                String id=(String.valueOf(data_value.get("id")));
              //  JSONObject text=(JSONObject)data_value.get("text");
              String text=(String.valueOf(data_value.get("text")));
               // JSONObject country=(JSONObject)places_value.get("country");
               String country=(String.valueOf(places_value.get("country")));
               // JSONObject location=(JSONObject)places_value.get("full_name");
               String location=(String.valueOf(places_value.get("full_name")));
               // JSONObject place_id=(JSONObject)places_value.get("id");
                String place_id=(String.valueOf(places_value.get("id")));
                Tweet tweet_lab = new Tweet(created_at,id,text,country,location,place_id);
                tweet.add(tweet_lab);
            } catch (Exception e) {
                System.out.println("L'objet n'est pas trouver");

            }
        }
        System.out.println("voir la classe VEttore " + tweet);
        System.out.println("la dimension de l'array est " + tweet.size());
        return tweet;
     }
        
    }
