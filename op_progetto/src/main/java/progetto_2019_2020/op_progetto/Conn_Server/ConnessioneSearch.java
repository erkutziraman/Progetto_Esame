/**
 * Per effeture le richieste abbiamo definito per default le parole chiave che si devono inserire per avere i risultati
 * è come se facessi delle ricerche con uno Hashtag (#) su twitter 
 */

package progetto_2019_2020.op_progetto.Conn_Server;

public class ConnessioneSearch extends ConnessioneAPI {
  private String ricerche_tweet[] = { "Love", "Life", "Sunrise", "Food", "Restaurant", "Discovery", "News", "tbt", "univpm",
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
