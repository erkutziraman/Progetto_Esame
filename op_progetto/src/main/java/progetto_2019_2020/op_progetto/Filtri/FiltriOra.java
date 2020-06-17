/**
 * classe impostata per dare i dati che sono stati filtrati sull'Ora specificato
 */

package progetto_2019_2020.op_progetto.Filtri;

import java.util.Vector;

import progetto_2019_2020.op_progetto.Preleva_Informazioni.TweetMetadata;

public class FiltriOra {
    private int c;
   private Vector<TweetMetadata> tweet_time=new Vector<TweetMetadata>();

 /**
     * meccanismo For che seleziona i tweet con le Ore identiche
     * @param a
     * @param t
     * @return tweet_location
     */
    public Vector<TweetMetadata> get_tweet_time(String a,Vector<TweetMetadata> t){
     
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