/**
 * classe impostata per dare i dati che sono stati fatti filtrati sulla localizzazione specificato
 */

package progetto_2019_2020.op_progetto.Filtri;

import java.util.Vector;

import progetto_2019_2020.op_progetto.Preleva_Informazioni.TweetMetadata;

public class FiltriLocation {
  private Vector<TweetMetadata> tweet_location=new Vector<TweetMetadata>();

    /**
     * meccanismo For che seleziona i tweet con location identiche 
     * @param a
     * @param s
     * @return tweet_location
     */
    public Vector<TweetMetadata> get_tweet_location(String a,Vector<TweetMetadata> s){
        for(int i=0;i<s.size();i++){
            if(s.get(i).getPlace_id().equals(a)){
                TweetMetadata data= s.get(i);
                tweet_location.add(data);
            }
        }
        return tweet_location;
    }
}