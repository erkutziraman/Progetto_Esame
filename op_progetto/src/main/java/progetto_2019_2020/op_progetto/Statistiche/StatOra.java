package progetto_2019_2020.op_progetto.Statistiche;

import java.util.Vector;
import progetto_2019_2020.op_progetto.Preleva_Informazioni.TweetMetadata;

public class StatOra {

    int b;
    String c = "";
 
     public void get_StatFiltriOra(String a,Vector<TweetMetadata> s){
     
     int t = 0 ;
     for(int i=0;i<s.size();i++){
        if( s.get(i).getCreated_at().substring(11, 13).equals(a)){
                 t++;
               this.b=t;
             }
         }
     }
 
     public Statmain risultato(){
         String description = "Questa statistica ci restituisce il numero di tweet che sono stati postati nell'intervalle d'Ora selezionato" ;
         int risultato = b;
         Statmain statmain = new Statmain(description, risultato);
         return statmain;
     }
    
}