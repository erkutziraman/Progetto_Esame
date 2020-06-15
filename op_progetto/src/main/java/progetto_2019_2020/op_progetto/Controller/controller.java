package progetto_2019_2020.op_progetto.Controller;

import java.util.Vector;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import progetto_2019_2020.op_progetto.Lettura.LeggiAPIStringa;
import progetto_2019_2020.op_progetto.Lettura.LeggiLabs;
import progetto_2019_2020.op_progetto.Preleva_Informazioni.TweetMetadata;
import progetto_2019_2020.op_progetto.Statistiche.*;
import progetto_2019_2020.op_progetto.Filtri.*;

@RestController
public class controller {
    Vector<TweetMetadata> nuovo = new Vector<TweetMetadata>();
    StatLocation statlocation = new StatLocation();
    StatCountry statcountry = new StatCountry();
    StatOra statora = new StatOra();

    @GetMapping("/connessione")
    public String esempio_2() {
        new LeggiLabs().LetturaLabs();
        return "I dati sono stati prelevati";
    }

    @GetMapping("/metadata")
    public Vector<TweetMetadata> example() {
        this.nuovo = new metadata().leggimetadata();
        return nuovo;
    }

    @GetMapping("/location")
    public Vector<TweetMetadata> example2(@RequestParam(name = "param1") String param1) {
        return new FiltriLocation().get_tweet_location(param1, nuovo);
    }

    @GetMapping("/country")
    public Vector<TweetMetadata> example3(@RequestParam(name = "param2") String param2) {
        return new FiltriCountry().get_tweet_Country(param2, nuovo);
    }

    @GetMapping("/ora")
    public Vector<TweetMetadata> example4(@RequestParam(name = "param3") String param3) {

        return new FiltriOra().get_tweet_time(param3, nuovo);
    }

    @GetMapping("/statlocation")
    public Statmain example5(@RequestParam(name = "param4") String param4) {
        statlocation.get_StatFiltriLocation(param4, nuovo);
        return statlocation.risultato();
    }

    @GetMapping("/statcountry")
    public Statmain example6(@RequestParam(name = "param5") String param5) {
        statcountry.get_StatFiltriCountry(param5, nuovo);
        return statcountry.risultato();
    }

    @GetMapping("/statora")
    public Statmain example7(@RequestParam(name = "param6") String param6) {
        statora.get_StatFiltriOra(param6, nuovo);
        return statora.risultato();
    }

    @GetMapping("/esempio3")
    public String example3() {
        return new LeggiAPIStringa().leggi();

    }
}