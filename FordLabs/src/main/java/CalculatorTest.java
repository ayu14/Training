import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class CalculatorTest {

	@Test                               //for JUnit, this @Test is necessary
	void test() {
		Calculator calc=new Calculator();
		double res=calc.multiply(2.0,3.0);
		
		//assert if res=6
		assertEquals(6.0, res);  //3rd param is delta(tolerance)
	}
		
		@Test                               //for JUnit, this @Test is necessary
		void test1() {
			Calculator calc=new Calculator();
			double res=calc.multiply(2.0,0.0);
			
			//assert if res=6
			assertEquals(2.0, res);  //3rd param is delta(tolerance)
		
	}

}
