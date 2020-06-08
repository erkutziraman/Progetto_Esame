package progetto_2019_2020.op_progetto.Controller;



import java.util.Iterator;
import java.util.Vector;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import progetto_2019_2020.op_progetto.Lettura.LeggiAPIStringa;
import progetto_2019_2020.op_progetto.Lettura.LeggiLabs;
import progetto_2019_2020.op_progetto.Preleva_Informazioni.GetLabs;
import progetto_2019_2020.op_progetto.Preleva_Informazioni.Tweet;
@RestController
public class controller {
    @GetMapping ("/metadata")
    public String example(){
        GetLabs labs=new GetLabs();
        Iterator <Tweet> itr=labs.Labs2().iterator();
        Tweet nuovo=new Tweet(null,null,null);
        String esempio="";
        while(itr.hasNext()){
            nuovo =itr.next();
            esempio=nuovo.toString();
        }
        return esempio;
    }
    @GetMapping("/esempio")
    public String example2(){
        return "hello ";
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