/**
 * Abbiamo impostato questo test per verificare se effettivamente il risultato di metadata è non nullo
 * l'importanza di questo test è dovuto al fatto che facendo il comando metadata i dati vengono salvati
 * affinché possa essere usato per effetuare le funzionalità
 */

package progetto_2019_2020.op_progetto;

import static org.junit.jupiter.api.Assertions.assertNotNull;

import java.util.Vector;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import progetto_2019_2020.op_progetto.Controller.controller;
import progetto_2019_2020.op_progetto.Preleva_Informazioni.TweetMetadata;

public class MetadataTest extends DemoApplicationTests {
    controller test_metadata=null;
    Vector<TweetMetadata> a =new Vector<TweetMetadata>();

    @BeforeEach
    void setUP() throws Exception{
       test_metadata=new controller();
       a= test_metadata.metadata();
    }

    @AfterEach
    void tearDown()throws Exception{
    }

    @Test
    void test3(){
        assertNotNull(a);
    }
    
}