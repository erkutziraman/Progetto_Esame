/**
 * classe tipica della stuttura di un'oggetto
 * nel nostro caso struttura del oggetto Tweet
 */

package progetto_2019_2020.op_progetto.Preleva_Informazioni;

public class Tweet {
    private String created_at;
    private String text;
    private String place_id;

    public Tweet(String created_at, String text, String place_id) {
        this.created_at = created_at;
        this.text = text;
        this.place_id = place_id;
    }

    public Tweet() {
    }

    @Override
    public String toString() {
        return "Created_at: " + created_at + ", Text: " + text + ", Place_id: " + place_id;
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

}