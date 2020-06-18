
package progetto_2019_2020.op_progetto;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

/**
 * La classe tipica per impostare i test Junit5.
 */
@SpringBootTest
class DemoApplicationTests {

	@Test
	void test1() {
		LeggiAPIStringaTest test1 = new LeggiAPIStringaTest();
		test1.test1();
	}
	@Test
	void test3() {
		MetadataTest test3 = new MetadataTest();
		test3.test3();
	}

}
