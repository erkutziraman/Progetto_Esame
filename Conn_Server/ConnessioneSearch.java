/**
 * classe che da gli informazioni sulla ricerca dal server 
 */

package Conn_Server;

public class ConnessioneSearch extends ConnessioneAPI {
   String ricerche_tweet[] = { "Love", "Life", "Sunrise", "Food", "Restaurant", "Discovery", "News", "tbt", "univpm",
         "France", "Italy", "Holland", "Tourism", "Travel", "Rome", "Portugal", "England", "Iceland", "China",
         "Poland" };

   public void Ids(String s) {
      dati_api(s);
   }

   public String[] getRicerche_tweet() {
      return ricerche_tweet;
   }

   public void setRicerche_tweet(String[] ricerche_tweet) {
      this.ricerche_tweet = ricerche_tweet;
   }

}
