
package progetto_2019_2020.op_progetto.Preleva_Informazioni;

/**
 * classe tipica della stuttura di un'oggetto nel nostro caso struttura del
 * oggetto TweetMetadata
 */
public class TweetMetadata {
    private String created_at;
    private String text;
    private String place_id;
    private String country;
    private String location;

    /**
     * costruttore senza parametro
     */
    public TweetMetadata() {
    }

    /**
     * costruttore con i parametri
     * 
     * @param created_at
     * @param text
     * @param place_id
     * @param country
     * @param location
     */
    public TweetMetadata(String created_at, String text, String place_id, String country, String location) {
        this.created_at = created_at;
        this.text = text;
        this.place_id = place_id;
        this.country = country;
        this.location = location;
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

    /**
     * 
     * @return country
     */
    public String getCountry() {
        return country;
    }

    /**
     * 
     * @param country
     */
    public void setCountry(String country) {
        this.country = country;
    }

    /**
     * 
     * @return location
     */
    public String getLocation() {
        return location;
    }

    /**
     * 
     * @param location
     */
    public void setLocation(String location) {
        this.location = location;
    }

}