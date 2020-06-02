/**
 * Classe impostata per prelevare gli Id
 * @return un vettore di Id della classe Vector.
 * @author Toyem Ryan
 */

package Preleva_Ids;

import java.util.Vector;
import org.json.simple.parser.*;
import Conn_Server.ConnessioneAPI;
import org.json.simple.JSONObject;
import org.json.simple.JSONArray;

public class GetId {

<<<<<<< HEAD
    ConnessioneAPI bb = new ConnessioneAPI();
    Vector<String> mtr = new Vector<String>();
    JSONArray obj = null;
    JSONParser parser = new JSONParser();

    public Vector<String> Tweet_id() {
=======
    protected ConnessioneAPI bb = new ConnessioneAPI();
    protected Vector<String> mtr = new Vector<String>();
    protected JSONParser parser = new JSONParser();
    protected JSONArray obj = null;
    protected JSONObject secondo = null;
    protected JSONArray jsonarr_1 = null;

    public Vector<String> Tweet_id() {

>>>>>>> bfb049129f8b1c20bfcca3467de1bf5d69c36a89
        try {
            obj = (JSONArray) parser.parse(bb.ids());
        } catch (Exception e) {
            System.out.println("probem de parsing");
            e.printStackTrace();
        }
<<<<<<< HEAD
        JSONObject secondo = null;
        JSONArray jsonarr_1 = null;
=======

>>>>>>> bfb049129f8b1c20bfcca3467de1bf5d69c36a89
        for (int i = 0; i < obj.size(); i++) {
            secondo = (JSONObject) obj.get(i);
            try {
                jsonarr_1 = (JSONArray) secondo.get("statuses");
            } catch (Exception e) {
                System.out.println("statutes n'est pas trouver");

            }
            /**
             * <strong> Ciclo For che fa la verifica di place costruisce il vettore mtr
<<<<<<< HEAD
             * verificando se ci sono gia gli id dentro mtr.
=======
             * verificando se ci sono gia gli id identici dentro il vettore mtr.
>>>>>>> bfb049129f8b1c20bfcca3467de1bf5d69c36a89
             */
            for (int j = 0; j < jsonarr_1.size(); j++) {
                JSONObject jsonobj_1 = (JSONObject) jsonarr_1.get(j);
                JSONObject jsonobj_2 = (JSONObject) jsonobj_1.get("place");
                if (jsonobj_2 != null && !mtr.contains((String.valueOf(jsonobj_1.get("id"))))) {
                    mtr.add(String.valueOf(jsonobj_1.get("id")));
                }
            }
        }
        System.out.println("voir la classe VEttore " + mtr);
        System.out.println("la dimension de l'array est " + mtr.size());
        return mtr;
    }
}