package Preleva_Informazioni;

public class Tweet {
    String created_at;
    String id;
    String text;
    String country;
    String location;
    String place_id;
    public Tweet(String created_at, String id, String text, String country, String location, String place_id) {
        this.created_at = created_at;
        this.id = id;
        this.text = text;
        this.country = country;
        this.location = location;
        this.place_id = place_id;
    }
}