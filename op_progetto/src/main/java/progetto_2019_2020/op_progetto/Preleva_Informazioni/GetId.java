/**
 * Classe impostata per prelevare gli Id
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

    protected LeggiAPIStringa bb = new LeggiAPIStringa();
    protected HashSet<String> mtr = new HashSet<String>();
    protected JSONParser parser = new JSONParser();
    protected JSONArray obj = null;
    protected JSONObject secondo = null;
    protected JSONArray jsonarr_1 = null;

    public HashSet<String> Tweet_id() {

        try {
            obj = (JSONArray) parser.parse(bb.leggi());
        } catch (Exception e) {
            System.out.println("probem de parsing");
            e.printStackTrace();
        }
        for (int i = 0; i < obj.size(); i++) {
            secondo = (JSONObject) obj.get(i);
            try {
                jsonarr_1 = (JSONArray) secondo.get("statuses");
            } catch (Exception e) {
                System.out.println("statutes n'est pas trouver");

            }
            /**
             * <strong> Ciclo For che fa la verifica di place costruisce il vettore mtr
             * verificando se ci sono gia gli id identici dentro il vettore mtr.
             */
            for (int j = 0; j < jsonarr_1.size(); j++) {
                JSONObject jsonobj_1 = (JSONObject) jsonarr_1.get(j);
                JSONObject jsonobj_2 = (JSONObject) jsonobj_1.get("place");
                if (jsonobj_2 != null /*&& !mtr.contains((String.valueOf(jsonobj_1.get("id"))))*/) {
                    mtr.add(String.valueOf(jsonobj_1.get("id")));
                }
            }
        }
        //System.out.println("voir la classe VEttore " + mtr);
        //System.out.println("la dimension de l'array est " + mtr.size());
        return mtr;
    }
}