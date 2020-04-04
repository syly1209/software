package 构造任务3_2;


public class SubstractOperation extends BinaryOperation {
	public SubstractOperation() {
		generateBinaryOperation('-');
	}

	@Override
	boolean checkingCalculation(int result) {
		// TODO Auto-generated method stub
		return result>=LOWER;
	}

	@Override
	int calculate(int left, int right) {
		// TODO Auto-generated method stub
		return left-right;
	}

}
