package progetto_2019_2020.op_progetto;
import progetto_2019_2020.Preleva_Informazioni.GetLabs;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class Programma {
    public static void main(String[] args) {
        SpringApplication.run(Programma.class, args);
       GetLabs letturaesempio=new GetLabs();
       letturaesempio.Labs2();
    }
    }