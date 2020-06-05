package progetto_2019_2020.Preleva_Informazioni;

public class TweetIncludes {
    String country;
    String id;
    String location;
    public TweetIncludes(String country, String id, String location) {
        this.country = country;
        this.id = id;
        this.location = location;
    }
    @Override
    public String toString() {
        return "Country: "+country +", Id: "+id+", Location: "+location ;
    }
}