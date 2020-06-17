/**
 * classe impostata solo per leggere il flux tramite bufferedReader 
 * e lo mette dentro data
 */

package progetto_2019_2020.op_progetto.Lettura;

import java.io.*;

public class LeggiStringa {
    protected File file;
    protected FileReader read;
    protected InputStream in;
    protected InputStreamReader inR;
    protected BufferedReader buf;
    protected String data = "";
    protected String line = "";

    /**
     * Classe Impostata cosi per poter solo essere chiamata quando si deve leggere dei flussi di dati dentro
     * uno file e lo mette dentro una Stringa
     * 
     * @return data
     */
    protected String string_letta() {
        try {
            while ((line = buf.readLine()) != null) {
                data += line;
            }
        } catch (Exception e) {
        }
        return data;
    }

    public void setFile(File file) {
        this.file = file;
    }

    public InputStream getIn() {
        return in;
    }

    public void setIn(InputStream in) {
        this.in = in;
    }

    public InputStreamReader getInR() {
        return inR;
    }

    public void setInR(InputStreamReader inR) {
        this.inR = inR;
    }

    public BufferedReader getBuf() {
        return buf;
    }

    public void setBuf(BufferedReader buf) {
        this.buf = buf;
    }
}