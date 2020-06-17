/**
 * classe tipica della stuttura di un'oggetto
 * nel nostro caso struttura del oggetto TweetIncludes
 */

package progetto_2019_2020.op_progetto.Preleva_Informazioni;

public class TweetIncludes {
   private String country;
    private String id;
   private  String location;

    public TweetIncludes(String country, String id, String location) {
        this.country = country;
        this.id = id;
        this.location = location;
    }

    public TweetIncludes() {
    }

    @Override
    public String toString() {
        return "Country: " + country + ", Id: " + id + ", Location: " + location;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }
}