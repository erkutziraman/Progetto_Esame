package progetto_2019_2020.op_progetto.Controller;

import java.util.Vector;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import progetto_2019_2020.op_progetto.Lettura.LeggiAPIStringa;
import progetto_2019_2020.op_progetto.Lettura.LeggiLabs;
import progetto_2019_2020.op_progetto.Preleva_Informazioni.TweetMetadata;
import progetto_2019_2020.op_progetto.Statistiche.StatLocation;
import progetto_2019_2020.op_progetto.Statistiche.metadata;
@RestController
public class controller {

//StatLocation statlocation = new StatLocation();
    Vector <TweetMetadata> nuovo =new  Vector <TweetMetadata>();
    @GetMapping ("/metadata")
    public Vector <TweetMetadata> example(){
         this.nuovo=new metadata().leggimetadata();
         return nuovo;
    }
    
       
    @GetMapping("/location")
    public Vector<TweetMetadata> example2(@RequestParam(name="param1")String param1){
        return new StatLocation().get_tweet_location(param1,nuovo);
    }
        @GetMapping("/esempio3")
        public String example3(){
            return new LeggiAPIStringa().leggi();
    
    }
    @GetMapping("/esempio4")
    public String example4(){
        return new LeggiLabs().LetturaLabs();

}
}