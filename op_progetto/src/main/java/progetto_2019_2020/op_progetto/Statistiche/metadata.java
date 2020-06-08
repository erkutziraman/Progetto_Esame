package progetto_2019_2020.op_progetto.Statistiche;

import java.util.*;

import progetto_2019_2020.op_progetto.Preleva_Informazioni.GetLabs;
import progetto_2019_2020.op_progetto.Preleva_Informazioni.Tweet;
import progetto_2019_2020.op_progetto.Preleva_Informazioni.TweetIncludes;
import progetto_2019_2020.op_progetto.Preleva_Informazioni.TweetMetadata;

public class metadata {
    Vector<TweetMetadata> tweetmetadata = new Vector<TweetMetadata>();
    GetLabs lab = new GetLabs();
    Vector<Tweet> str;
    Vector<TweetIncludes> str2;

    public metadata() {
        this.str = lab.Labs2();
        this.str2 = lab.getTweetincludes();
    }

    public Vector<TweetMetadata> leggimetadata() {
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
            tweetmetadata.add(Metadata);
        }
        
        return tweetmetadata;
    }

    public Vector<TweetMetadata> getTweetmetadata() {
        return tweetmetadata;
    }

    public void setTweetmetadata(Vector<TweetMetadata> tweetmetadata) {
        this.tweetmetadata = tweetmetadata;
    }

}
