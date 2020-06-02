package Lettura;
import java.io.*;
public class LeggiStringa {
    File file;
    FileReader read;
    InputStream in;
    InputStreamReader inR;
    BufferedReader buf;
    String data="";
    String line="";
    public String string_letta(){
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