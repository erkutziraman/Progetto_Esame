/**
 * classe che prende i dati dal file JSON salvato nel caso in cui non 
 * si riesce a connettere al server
 * @author TOYEM RYAN
 */

package Conn_Server;

import java.io.File;
import java.io.FileReader;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.BufferedReader;

/**
 * <strong> Nel caso in cui i dati non possono essere presi nel API</strong>
 * 
 */

public class LeggifileJSON {
    File file;
    BufferedReader bufferedReader;
    String line;
    String data;

    public LeggifileJSON(String file) {
        this.file = new File(file);
        bufferedReader = null;
        line = "";
        data = "";
    }

    /**
     * metodo che riceve il file Json salvato <i>file</i>
     * 
     * @return una Stringa in formato Json
     */
    public String data_file() {
        try {

            FileReader fileReader = new FileReader(file);
            bufferedReader = new BufferedReader(fileReader);

            while ((line = bufferedReader.readLine()) != null) {
                data += line;

            }
        } catch (FileNotFoundException e) {
            System.out.println("ERROR FILE NOT FOUND !!!");
        } catch (IOException e) {
            System.out.println("ERROR NOT DATA !!!!" + file.toString());
        }

        /**
         * try catch molto importante che ci permette di sorvegliare l'andamento della
         * chiusura del buffer NullPointerException che sarebbe importante siccome ho
         * dichiarato buffered ad inizio con Null escludendo una possibile errore con
         * relativo alla chiusura del buffered
         */

        try {
            bufferedReader.close();
        } catch (IOException e) {
            System.out.println("Impossibile chiudere il file !!!" + file.toString());
        } catch (NullPointerException e) {
            System.out.println("ERROR !!!" + file.toString());
        }
        return data;

    }
}
