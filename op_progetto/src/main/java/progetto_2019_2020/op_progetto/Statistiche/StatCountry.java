package progetto_2019_2020.op_progetto.Statistiche;

import java.util.Vector;

import progetto_2019_2020.op_progetto.Preleva_Informazioni.TweetMetadata;

public class StatCountry {

    Vector<TweetMetadata> tweet_Country=new Vector<TweetMetadata>();
    public Vector<TweetMetadata> get_tweet_Country(String a,Vector<TweetMetadata> c){
     //    metadata mt=new metadata();
        for(int i=0;i<c.size();i++){
            if(c.get(i).getCountry().equals(a)){
                TweetMetadata data= c.get(i);
                tweet_Country.add(data);
            }
        }
        return tweet_Country;
    }
    
}