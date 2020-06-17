/**
 * classe tipica della stuttura di un'oggetto
 * nel nostro caso struttura del oggetto TweetMetadata
 */

package progetto_2019_2020.op_progetto.Preleva_Informazioni;

public class TweetMetadata {
   private String created_at;
   private String text;
   private String place_id;
    private String country;
    private String location;

    public TweetMetadata() {
    }

    public TweetMetadata(String created_at, String text, String place_id, String country, String location) {
        this.created_at = created_at;
        this.text = text;
        this.place_id = place_id;
        this.country = country;
        this.location = location;
    }

    public String getCreated_at() {
        return created_at;
    }

    public void setCreated_at(String created_at) {
        this.created_at = created_at;
    }

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }

    public String getPlace_id() {
        return place_id;
    }

    public void setPlace_id(String place_id) {
        this.place_id = place_id;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

}