package ��������3_2;

import java.util.Random;

abstract class BinaryOperation {
	protected final int UPPER= 100;
	protected final int LOWER= 0;
	protected int left_operand ;
	protected int right_operand ;
	protected int value ;
	protected char operator ;
	protected void generateBinaryOperation(char operator) {
		 int left;
		 int right;
		 int result;      
		 Random random = new Random();   
		 left = random.nextInt(UPPER+1);   
		 do {      
			 right = random.nextInt(UPPER+1);    
			 result = calculate(left,right);   
		 } while (!(checkingCalculation(result)));   
		 left_operand = left;   
		 right_operand = right;   
		 value = result;  
		 this.operator = operator;   
	}
	abstract boolean checkingCalculation(int result) ;
	abstract int calculate(int left, int right) ;
	public boolean equals(BinaryOperation operation) {
		return left_operand==operation.left_operand&&
				right_operand==operation.right_operand&&
				value==operation.value&&
				operator==operation.operator;
				
	}
	//��ʽ����ʾ��ʽ
	public String toString() {
		String ans="";
		ans+=String.format("%4d ", left_operand);
		ans+=operator;
		ans+=String.format("%4d =", right_operand);
		return ans;
	}
	//��ʽ����ʾ���𰸵���ʽ
	public String asString() {
		String ans="";
		ans+=String.format("%4d ", left_operand);
		ans+=operator;
		ans+=String.format("%4d = ", right_operand);
		ans+=String.format("%3d", value);
		return ans;
	}
	public int getValue() {
		return value;
	}
	
	
}
