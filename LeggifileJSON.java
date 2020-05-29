
import java.io.File;
import java.io.FileReader;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.BufferedReader;

/**
 * <strong> Nel caso in cui i dati non possono essere presi nel API</strong>
 */

public class LeggifileJSON {

    public static void main(String[] args) {
        /**
         * lettura dei dati dal file salvato <i>twitter1.json</i>
         */
        File file = new File("twitte.json");
        BufferedReader bufferedReader = null;

        /**
         * try catch di lettura dei dati con bufferedReader di tipo BufferedReader
         */
        try {
            FileReader fileReader = new FileReader(file);
            bufferedReader = new BufferedReader(fileReader);

            String line;
            while ((line = bufferedReader.readLine()) != null) {
                /**
                 * @return tutti i dati
                 */
                System.out.println(line);
            }
/**
 * try catch 
 */
        } catch (FileNotFoundException e) {
            System.out.println("ERROR FILE NOT FOUND !!!");
        } catch (IOException e) {
            System.out.println("ERROR NOT DATA !!!!" + file.toString());
        }

        /**
         * try catch molto importante che ci permette di sorvegliare l'andamento della chiusura del buffer
         * NullPointerException che sarebbe importante siccome ho dichiarato buffered ad inizio con Null
         * escludendo una possibile errore con relativo alla chiusura del buffered
         */

        try {
            bufferedReader.close();
        } catch (IOException e) {
            System.out.println("IMPOSSIBLE TO CLOSE THE FILE !!!" + file.toString());
        } catch (NullPointerException e) {
            System.out.println("ERROR !!!" + file.toString());
        }
    }
}