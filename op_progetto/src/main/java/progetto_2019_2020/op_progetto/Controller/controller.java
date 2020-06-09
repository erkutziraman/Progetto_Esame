package progetto_2019_2020.op_progetto.Controller;

import java.util.Vector;

import org.springframework.web.bind.annotation.GetMapping;

import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import progetto_2019_2020.op_progetto.Lettura.LeggiAPIStringa;
import progetto_2019_2020.op_progetto.Lettura.LeggiLabs;
import progetto_2019_2020.op_progetto.Preleva_Informazioni.TweetMetadata;
import progetto_2019_2020.op_progetto.Statistiche.StatCountry;
import progetto_2019_2020.op_progetto.Statistiche.StatLocation;
import progetto_2019_2020.op_progetto.Statistiche.StatTime;
import progetto_2019_2020.op_progetto.Statistiche.metadata;
@RestController
public class controller {
    Vector <TweetMetadata> nuovo = new Vector <TweetMetadata>();
    @GetMapping("/connessione")
    public String esempio_2()
    {
        new LeggiLabs().LetturaLabs();
        return "Dati sono prelevati";
    }
    @GetMapping ("/metadata")
    public Vector <TweetMetadata> example(){
        this.nuovo=new metadata().leggimetadata();
         return nuovo;
    }
    
       
    @GetMapping("/location")
    public Vector<TweetMetadata> example2(@RequestParam(name="param1")String param1){
        return new StatLocation().get_tweet_location(param1,nuovo);
    }

    @GetMapping("/Country")
    public Vector<TweetMetadata> example3(@RequestParam(name="param2")String param2){
        return new StatCountry().get_tweet_Country(param2,nuovo);
    }
    @GetMapping("/Time")
    public Vector<TweetMetadata> example4(@RequestParam(name="param3")String param3){
        
        return new StatTime().get_tweet_time(param3,nuovo);
    }
        @GetMapping("/esempio3")
        public String example3(){
            return new LeggiAPIStringa().leggi();
    
    }
}