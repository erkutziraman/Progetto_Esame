/**
 * classe impostata per dare i dati che sono stati fatti filtrati sul paese specificato
 */
package progetto_2019_2020.op_progetto.Filtri;

import java.util.Vector;

import progetto_2019_2020.op_progetto.Preleva_Informazioni.TweetMetadata;

public class FiltriCountry {

    Vector<TweetMetadata> tweet_Country=new Vector<TweetMetadata>();

    /**
     * meccanismo For che seleziona i tweet i paesi identici 
     * @param a
     * @param c
     * @return tweet_country
     */
    public Vector<TweetMetadata> get_tweet_Country(String a,Vector<TweetMetadata> c){
     
        for(int i=0;i<c.size();i++){
            if(c.get(i).getCountry().equals(a)){
                TweetMetadata data= c.get(i);
                tweet_Country.add(data);
            }
        }
        return tweet_Country;
    }
    
}