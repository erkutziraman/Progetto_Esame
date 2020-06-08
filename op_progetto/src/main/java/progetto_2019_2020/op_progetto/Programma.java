package progetto_2019_2020.op_progetto;



import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import progetto_2019_2020.op_progetto.Preleva_Informazioni.GetLabs;
import progetto_2019_2020.op_progetto.Statistiche.metadata;

@SpringBootApplication
public class Programma {
    public static void main(String[] args) {
        SpringApplication.run(Programma.class, args);
        // SpringApplication.run(GetLabs.class, args);
    }
}