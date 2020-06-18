package progetto_2019_2020.op_progetto.Lettura;

import java.io.*;

/**
 * La classe impostata solo per leggere il flusso tramite bufferedReader e lo
 * mette dentro data
 */
public class LeggiStringa {
    protected File file;
    protected FileReader read;
    protected InputStream in;
    protected InputStreamReader inR;
    protected BufferedReader buf;
    protected String data = "";
    protected String line = "";

    /**
     * Il metodo è stato impostato cosi per poter solo essere chiamato quando si
     * deve leggere dei flussi di dati dentro uno file e lo mette dentro una Stringa
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

    /**
     * setter file
     * 
     * @param file
     */
    public void setFile(File file) {
        this.file = file;
    }

    /**
     * @return in di tipo inputStream
     */
    public InputStream getIn() {
        return in;
    }

    /**
     * @param in
     */
    public void setIn(InputStream in) {
        this.in = in;
    }

    /**
     * @return inR di tipo inputstreamreader.
     */
    public InputStreamReader getInR() {
        return inR;
    }

    /**
     * @param inR
     */
    public void setInR(InputStreamReader inR) {
        this.inR = inR;
    }

    /**
     * @return buf di tipo bufferedreader.
     */
    public BufferedReader getBuf() {
        return buf;
    }

    /**
     * @param buf
     */
    public void setBuf(BufferedReader buf) {
        this.buf = buf;
    }
}