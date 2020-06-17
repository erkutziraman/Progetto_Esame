/**
 * classe tipica per impostare i test Junit
 */

package progetto_2019_2020.op_progetto;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class DemoApplicationTests {

	@Test
	void test1() {
		LeggiAPIStringaTest test1=new LeggiAPIStringaTest();
		test1.test1();
	}
	@Test
	void test2(){
		LeggiLabsTest test2=new LeggiLabsTest();
		test2.test2();
	} 

	@Test 
	void test3(){
		MetadataTest test3=new MetadataTest();
		test3.test3();
	}

}
