package 构造任务3_2;


public class AdditionOperation extends BinaryOperation {
	public AdditionOperation() {
		generateBinaryOperation('+');
	}
	@Override
	boolean checkingCalculation(int result) {
		// TODO Auto-generated method stub
		return result<=UPPER;
	}

	@Override
	int calculate(int left, int right) {
		// TODO Auto-generated method stub
		return left+right;
	}

}
