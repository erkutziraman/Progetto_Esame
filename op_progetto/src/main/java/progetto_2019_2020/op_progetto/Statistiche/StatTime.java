package progetto_2019_2020.op_progetto.Statistiche;

import java.util.Vector;

import progetto_2019_2020.op_progetto.Preleva_Informazioni.TweetMetadata;

public class StatTime {
    int c;
    Vector<TweetMetadata> tweet_time=new Vector<TweetMetadata>();
    public Vector<TweetMetadata> get_tweet_time(String a,Vector<TweetMetadata> t){
     //    metadata mt=new metadata();
        for(int i=0;i<t.size();i++){
            if( t.get(i).getCreated_at().substring(11, 13).equals(a)){
                TweetMetadata data= t.get(i);
                tweet_time.add(data);
                c++;
            }
        }
        return tweet_time;
    }

    public int getc (){
        return c;
    }
}