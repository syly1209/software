package 构造任务3_2;

import java.util.ArrayList;
import java.util.Random;

public class Exercise {
	private ArrayList<BinaryOperation> operationList = new ArrayList <BinaryOperation>();  
	private int current=0; 
	public void generateBinaryExercise(int operationCount) {
		
		BinaryOperation operation; 
		
		while (operationCount>0){ 
			do{
				operation = generateOperation();    
			}while (operationList.contains(operation));  
			operationList.add(operation);
			operationCount--;   
		}
	}  
	public void generateAdditionExercise(int operationCount) {
		while(operationCount>0) {
			operationList.add(new AdditionOperation());
			operationCount--;
		}
	}  
	public void generateSubstractExercise(int operationCount) {
		while(operationCount>0) {
			operationList.add(new SubstractOperation());
			operationCount--;
		}
	}  
	private BinaryOperation generateOperation(){
		Random random=new Random();
		if(random.nextInt(2)==0)
			return new AdditionOperation();
		else
			return new SubstractOperation();
	}      
	public boolean hasNext(){   
		if(current <= operationList.size()-1)
			return true;  
		else {
			current=0;
			return false;
		}
	}  
	public BinaryOperation next(){    
		 return operationList.get(current++);  
	} 
	public int size() {
		return operationList.size();
	}
	public void clear() {
		operationList.clear();
		current=0;
	}
}
