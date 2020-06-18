package progetto_2019_2020.op_progetto.Conn_Server;

/**
 * La classe per effettuare delle ricerche su twitter.Abbiamo definito per
 * default delle ricerche con uno Hashtag (#).
 */
public class ConnessioneSearch extends ConnessioneAPI {
   private String ricerche_tweet[] = { "Love", "Life", "Sunrise", "Food", "Restaurant", "Discovery", "News", "tbt",
         "univpm", "France", "Italy", "Holland", "Tourism", "Travel", "Rome", "Portugal", "England", "Iceland", "China",
         "Poland" };

   /**
    * Il metodo che passa gli ids a ConnessioneAPI.
    * 
    * @param s
    */
   public void Ids(String s) {
      dati_api(s);
   }

   /**
    * 
    * @return Restituisce le ricerche su twitter.
    */
   public String[] getRicerche_tweet() {
      return ricerche_tweet;
   }

   /**
    * Imposta le ricerche su twitter.
    * 
    * @param ricerche_tweet
    */
   public void setRicerche_tweet(String[] ricerche_tweet) {
      this.ricerche_tweet = ricerche_tweet;
   }

}
