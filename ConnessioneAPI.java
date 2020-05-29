
/**
 * ConnessioneAPI
 */
import java.net.HttpURLConnection;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.MalformedURLException;
import java.net.URL;

public class ConnessioneAPI {
    private static HttpURLConnection connessione;

    public static void main(String[] args) {
        BufferedReader reader;
        String line;
        StringBuffer data = new StringBuffer();
        try {
            URL api = new URL(
                    "https://wd4hfxnxxa.execute-api.us-east-2.amazonaws.com/dev/user/1.1/statuses/retweets_of_me.json");
            connessione = (HttpURLConnection) api.openConnection();
            connessione.setRequestMethod("GET");
            connessione.setConnectTimeout(5000);
            connessione.setReadTimeout(5000);
            int r_server = connessione.getResponseCode();
            if (r_server >= 200 && r_server < 300)
                System.out.println("Connessione riuscita");
            reader = new BufferedReader(new InputStreamReader(connessione.getInputStream()));
            while ((line = reader.readLine()) != null) {
                System.out.println(line);
            }
            reader.close();
            System.out.println(data.toString());
        } catch (MalformedURLException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}