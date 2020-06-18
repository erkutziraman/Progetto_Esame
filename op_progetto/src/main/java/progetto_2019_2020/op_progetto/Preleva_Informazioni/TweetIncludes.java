
package progetto_2019_2020.op_progetto.Preleva_Informazioni;

/**
 * classe tipica della stuttura di un'oggetto nel nostro caso struttura del
 * oggetto TweetIncludes
 */
public class TweetIncludes {
    private String country;
    private String id;
    private String location;

    /**
     * Costruttore con parametri
     * 
     * @param country
     * @param id
     * @param location
     */
    public TweetIncludes(String country, String id, String location) {
        this.country = country;
        this.id = id;
        this.location = location;
    }

    /**
     * Costruttore senza parametri
     */
    public TweetIncludes() {
    }

    /**
     * Override della funzione toString()
     */
    @Override
    public String toString() {
        return "Country: " + country + ", Id: " + id + ", Location: " + location;
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
     * @return id
     */
    public String getId() {
        return id;
    }

    /**
     * 
     * @param id
     */
    public void setId(String id) {
        this.id = id;
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