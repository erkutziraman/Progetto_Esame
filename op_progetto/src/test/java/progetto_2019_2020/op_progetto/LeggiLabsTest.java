/* 
 * Abbiamo impostato questo test per verificare se effettivamente i dati ritornati da "LeggiLabs" 
 * sono gli stessi di quelli dentro twitter2
 * il nostro codice è basato sui supporti di dati (twitter1 e twitter2)
 * dunque faccendo questo test stiamo verificando che i dati presi dal API search sono stati effettivamente salvati dentro un file
 */
package progetto_2019_2020.op_progetto;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import progetto_2019_2020.op_progetto.Lettura.LeggiLabs;
import progetto_2019_2020.op_progetto.Lettura.LeggifileJSON;

public class LeggiLabsTest extends DemoApplicationTests {
    LeggiLabs test_labs=null;
    LeggifileJSON test_json=null;
    private String a;
    private String b;

    
    @BeforeEach
    void setUP() throws Exception{
        test_labs.LetturaLabs();
        a=test_labs.getA();
        test_json.setApi("twitter2.json");
        b=test_json.data_file();
    }
    @AfterEach
    void tearDown() throws Exception{

    }
    @Test
    void test2(){
        assertEquals(a,b);
    }
 
} 