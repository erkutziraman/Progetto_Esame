
package progetto_2019_2020.op_progetto.Preleva_Informazioni;

/**
 * classe tipica della stuttura di un'oggetto nel nostro caso struttura del
 * oggetto Tweet
 */
public class Tweet {
    private String created_at;
    private String text;
    private String place_id;

    /**
     * costruttore tweet con parametri
     * 
     * @param created_at
     * @param text
     * @param place_id
     */
    public Tweet(String created_at, String text, String place_id) {
        this.created_at = created_at;
        this.text = text;
        this.place_id = place_id;
    }

    /**
     * costruttore tweet senza parametri
     */
    public Tweet() {
    }

    /**
     * Override della funzione toString.
     */
    @Override
    public String toString() {
        return "Created_at: " + created_at + ", Text: " + text + ", Place_id: " + place_id;
    }

    /**
     * 
     * @return created_at
     */
    public String getCreated_at() {
        return created_at;
    }

    /**
     * 
     * @param created_at
     */
    public void setCreated_at(String created_at) {
        this.created_at = created_at;
    }

    /**
     * 
     * @return text
     */
    public String getText() {
        return text;
    }

    /**
     * 
     * @param text
     */
    public void setText(String text) {
        this.text = text;
    }

    /**
     * 
     * @return place_id
     */
    public String getPlace_id() {
        return place_id;
    }

    /**
     * 
     * @param place_id
     */
    public void setPlace_id(String place_id) {
        this.place_id = place_id;
    }

}