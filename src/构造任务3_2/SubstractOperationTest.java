package 构造任务3_2;

import static org.junit.Assert.assertEquals;

import org.junit.Before;
import org.junit.Ignore;
import org.junit.Test;

public class SubstractOperationTest {

	BinaryOperation bo;
	@Before
	public void setUp() throws Exception {
		bo=new SubstractOperation();
	}

	@Ignore
	public void testCheckingCalculation1() {
		assertEquals(bo.checkingCalculation(0),true);
	}

	@Ignore
	public void testCheckingCalculation2() {
		assertEquals(bo.checkingCalculation(-1),true);
	}
	
	@Ignore
	public void testCheckingCalculation3() {
		assertEquals(bo.checkingCalculation(50),true);
	}

	@Ignore
	public void testCalculate1() {
		assertEquals(bo.calculate(37, 29),8);
	}
	
	@Ignore
	public void testCalculate2() {
		assertEquals(bo.calculate(37, 29),2);
	}
	
	@Ignore
	public void testCalculate3() {
		assertEquals(bo.calculate(50, 20),30);
	}

}
