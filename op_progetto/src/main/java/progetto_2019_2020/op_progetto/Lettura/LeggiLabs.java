/**
 * classe impostata specialmente per chiedere la connessione alla seconda API(API search) in diamo gli id raccolti 
 * dando questi Id API search ci restituisce i dati dentro "a" con i campi specificati
 * 
 * gestendo il fatto che se non c'è connessione 
 */

package progetto_2019_2020.op_progetto.Lettura;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.util.*;
import progetto_2019_2020.op_progetto.Conn_Server.ConnessioneIds;

import progetto_2019_2020.op_progetto.Preleva_Informazioni.*;

public class LeggiLabs extends LeggiStringa {
    private HashSet<String> mtr2 = new HashSet<String>();
    private ConnessioneIds connessione = new ConnessioneIds();
    private String a = "";

    /**
     * metodo impostata per gestire il meccanismo di lettura con diverse chiamate
     * tutto ciò che viene raccolto dall'API search viene prima registro dentro la
     * stringa "a" e poi registro nel file supporto twitter2.json
     * 
     * gestione del caso di connessione che impedisce la scrittura dentro twitter2
     * in caso di non connessione alla rete internet
     * 
     * @return "a" nei due casi
     */
    public void LetturaLabs() {
        GetId IdsSearch = new GetId();
        mtr2 = IdsSearch.Tweet_id();
        Iterator<String> iter = mtr2.iterator();
        while (iter.hasNext()) {
            String id = iter.next();
            connessione.Prendiinformazione(id);
        }
        connessione.dati_api(connessione.getUrl());
        try {
            in = connessione.getConnessione().getInputStream();
            inR = new InputStreamReader(in);
            buf = new BufferedReader(inR);
            try {
                a = string_letta();
            } finally {
                in.close();
            }
        } catch (IOException e) {
            e.printStackTrace();
        }

        File file = new File("twitter2.json");

        if (a != "") {
            try {
                PrintWriter output = new PrintWriter(new BufferedWriter(new FileWriter(file)));
                output.println(a);
                output.close();
            } catch (IOException e) {
                e.printStackTrace();
            }

        }

    }

    public String getA() {
        return a;
    }

    public void setA(String a) {
        this.a = a;
    }
}