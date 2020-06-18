package progetto_2019_2020.op_progetto.Statistiche;

/**
 * classe tipica della stuttura di un'oggetto nel nostro caso struttura del
 * oggetto statmain
 */
public class Statmain {
    private String description;
    private int risultato;

    /**
     * Costruttore senza parametri.
     */
    public Statmain() {
    }

    /**
     * Costruttore con parametri
     * 
     * @param description
     * @param risultato
     */
    public Statmain(String description, int risultato) {
        this.description = description;
        this.risultato = risultato;
    }

    /**
     * 
     * @return description
     */
    public String getDescription() {
        return this.description;
    }

    /**
     * 
     * @param description
     */
    public void setDescription(String description) {
        this.description = description;
    }

    /**
     * 
     * @return risultato
     */
    public int getRisultato() {
        return this.risultato;
    }

    /**
     * @param risultato
     */
    public void setRisultato(int risultato) {
        this.risultato = risultato;
    }

}
