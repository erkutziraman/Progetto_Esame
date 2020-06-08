package progetto_2019_2020.op_progetto.Statistiche;

import java.util.Vector;

import progetto_2019_2020.op_progetto.Preleva_Informazioni.TweetMetadata;

public class StatLocation {
   Vector<TweetMetadata> tweet_location=new Vector<TweetMetadata>();
    public Vector<TweetMetadata> get_tweet_location(String a,Vector<TweetMetadata>s){
     //   metadata mt=new metadata();
        for(int i=0;i<s.size();i++){
            if(s.get(i).getPlace_id().equals(a)){
                TweetMetadata data= s.get(i);
                tweet_location.add(data);
            }
        }
        return tweet_location;
    }
}