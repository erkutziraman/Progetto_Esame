package progetto_2019_2020.op_progetto.Controller;

import java.util.Vector;


import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import progetto_2019_2020.op_progetto.Lettura.LeggiAPIStringa;
import progetto_2019_2020.op_progetto.Lettura.LeggiLabs;
import progetto_2019_2020.op_progetto.Preleva_Informazioni.TweetMetadata;
import progetto_2019_2020.op_progetto.Statistiche.metadata;
@RestController
public class controller {
    @GetMapping ("/metadata")
    public Vector <TweetMetadata> example(){
        return new metadata().leggimetadata();
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