package progetto_2019_2020.op_progetto;
import static org.junit.jupiter.api.Assertions.assertEquals;


import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import progetto_2019_2020.op_progetto.Lettura.LeggiAPIStringa;
import progetto_2019_2020.op_progetto.Lettura.LeggifileJSON;

public class LeggiAPIStringaTest extends DemoApplicationTests{
    LeggiAPIStringa test_str=null;
    LeggifileJSON test_file=null;
    String a;
    String b;
    @BeforeEach
    void setUP() throws Exception{
        test_str= new LeggiAPIStringa();
        a=test_str.leggi();
        test_file=new LeggifileJSON(); 
        b=test_file.data_file();
    }
    @AfterEach
    void tearDown() throws Exception{
    }
    @Test
    void test1(){
        assertEquals(b,a);
    }
}