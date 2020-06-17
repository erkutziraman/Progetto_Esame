/**
 * classe impostata per dare la statistica sull'Ora selezionato
 */

package progetto_2019_2020.op_progetto.Statistiche;

import java.util.Vector;
import progetto_2019_2020.op_progetto.Preleva_Informazioni.TweetMetadata;

public class StatOra {

   private int b;
    
   /**
     * meccanismo For che incrementa "t", ad ogni validazione della condizione
     * e momerizza il numero finale dentro "b"
     * la condizione in questo caso è l'ugualianza dell'Ora
     * @param a
     * @param s
     */
     public void get_StatFiltriOra(String a,Vector<TweetMetadata> s){
     
     int t = 0 ;
     for(int i=0;i<s.size();i++){
        if( s.get(i).getCreated_at().substring(11, 13).equals(a)){
                 t++;
               this.b=t;
             }
         }
     }
 
 /**
 * Risultato finale nel tipo statmain impostata sotto forma di stampa
 * @return statmain
 */
     public Statmain risultato(){
         String description = "Questa statistica ci restituisce il numero di tweet che sono stati postati nell'intervalle d'Ora selezionato" ;
         int risultato = b;
         Statmain statmain = new Statmain(description, risultato);
         return statmain;
     }
    
}