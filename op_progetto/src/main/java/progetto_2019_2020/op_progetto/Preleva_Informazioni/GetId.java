/**
 * Classe impostata per prelevare gli Id che rappresentano i tweet
 * @return un vettore di Id della classe Vector.
 * @author Toyem Ryan
 */

package progetto_2019_2020.op_progetto.Preleva_Informazioni;

import java.util.HashSet;
import org.json.simple.parser.*;
import progetto_2019_2020.op_progetto.Lettura.*;
import org.json.simple.JSONObject;
import org.json.simple.JSONArray;

public class GetId {

    private LeggiAPIStringa bb = new LeggiAPIStringa();
    private HashSet<String> mtr = new HashSet<String>();
    private JSONParser parser = new JSONParser();
    private JSONArray obj = null;
    private JSONObject secondo = null;
    private JSONArray jsonarr_1 = null;

    /**
     * metodo impostata per prelevare gli Id dei tweet per poter farlo bisogno avere
     * una buona conoscenza della dei file JSON e sopprattutto abbiamo usufruito dei
     * metodi di parsing della libreria org.json questo ci ritorna un hashset di ID
     * 
     * @return mtr
     */
    public HashSet<String> Tweet_id() {

        try {
            obj = (JSONArray) parser.parse(bb.leggi());
        } catch (Exception e) {
            System.out.println("probema di parsing");
            e.printStackTrace();
        }
        for (int i = 0; i < obj.size(); i++) {
            secondo = (JSONObject) obj.get(i);
            try {
                jsonarr_1 = (JSONArray) secondo.get("statuses");
            } catch (Exception e) {
                System.out.println("statutes non è stata trovata");

            }
            /**
             * <strong> Ciclo For che fa la verifica dentro i tweet che sono stati parsati e
             * preleva ID di place e lo agguinge dentro il vettore mtr </strong>
             * 
             */
            for (int j = 0; j < jsonarr_1.size(); j++) {
                JSONObject jsonobj_1 = (JSONObject) jsonarr_1.get(j);
                JSONObject jsonobj_2 = (JSONObject) jsonobj_1.get("place");
                if (jsonobj_2 != null) {
                    mtr.add(String.valueOf(jsonobj_1.get("id")));
                }
            }
        }

        return mtr;
    }
}