package progetto_2019_2020.op_progetto.Preleva_Informazioni;

public class Tweet {
    String created_at;
    String text;
    String place_id;

    public Tweet(String created_at, String text, String place_id) {
        this.created_at = created_at;
        this.text = text;
        this.place_id = place_id;
    }
    @Override
    public String toString() {
        return "Created_at: "+created_at +", Text: "+text+", Place_id: "+place_id ;
    }
   
}