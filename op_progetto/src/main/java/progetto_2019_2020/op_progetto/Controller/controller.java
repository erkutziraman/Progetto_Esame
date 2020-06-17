/**
 * Questa classe il nostro controller
 * essa ci permette d'impostare tutte le richieste con il GETMAPPING
 * essendo una particolarità del framework
 */

package progetto_2019_2020.op_progetto.Controller;

import java.util.Vector;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import progetto_2019_2020.op_progetto.Lettura.LeggiLabs;
import progetto_2019_2020.op_progetto.Preleva_Informazioni.TweetMetadata;
import progetto_2019_2020.op_progetto.Statistiche.*;
import progetto_2019_2020.op_progetto.Filtri.*;

@RestController
public class controller {
    private Vector<TweetMetadata> nuovo = new Vector<TweetMetadata>();
   private StatLocation statlocation = new StatLocation();
    private StatCountry statcountry = new StatCountry();
    private StatOra statora = new StatOra();

    @GetMapping("/connessione")
    public String connessione() {
        new LeggiLabs().LetturaLabs();
        return "I dati sono stati prelevati";
    }

    @GetMapping("/metadata")
    public Vector<TweetMetadata> metadata() {
        this.nuovo = new metadata().leggimetadata();
        return nuovo;
    }

    @GetMapping("/location")
    public Vector<TweetMetadata> location(@RequestParam(name = "param") String param) {
        return new FiltriLocation().get_tweet_location(param, nuovo);
    }

    @GetMapping("/country")
    public Vector<TweetMetadata> country(@RequestParam(name = "param") String param) {
        return new FiltriCountry().get_tweet_Country(param, nuovo);
    }

    @GetMapping("/ora")
    public Vector<TweetMetadata> ora(@RequestParam(name = "param") String param) {

        return new FiltriOra().get_tweet_time(param, nuovo);
    }

    @GetMapping("/statlocation")
    public Statmain statlocation(@RequestParam(name = "param") String param) {
        statlocation.get_StatFiltriLocation(param, nuovo);
        return statlocation.risultato();
    }

    @GetMapping("/statcountry")
    public Statmain statcountry(@RequestParam(name = "param") String param) {
        statcountry.get_StatFiltriCountry(param, nuovo);
        return statcountry.risultato();
    }

    @GetMapping("/statora")
    public Statmain statora(@RequestParam(name = "param") String param) {
        statora.get_StatFiltriOra(param, nuovo);
        return statora.risultato();
    }

}