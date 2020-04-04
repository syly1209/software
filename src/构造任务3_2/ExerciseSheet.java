package 构造任务3_2;


public class ExerciseSheet {
	private static final short COLUMN_NUMBER=5;  
	//打印算式
	public void formattedDisplay (Exercise exercise, int columns) {
		int p=1;
		while(exercise.hasNext()) {
			System.out.printf("%2d. ",p);
			System.out.print(exercise.next()+"\t\t");
			if(p%columns==0)
				System.out.println();
			p++;
		}
		System.out.println();
	}
	public void formattedDisplay (Exercise exercise) {
		formattedDisplay(exercise,COLUMN_NUMBER);
	}
	//打印带答案的算式
	public void formattedDisplayAns (Exercise exercise) {
		formattedDisplayAns(exercise,COLUMN_NUMBER);
	}
	public void formattedDisplayAns(Exercise exercise, int columns) {
		System.out.println("--------------------答案--------------------");
		int p=1;
		while(exercise.hasNext()) {
			System.out.printf("%2d. ",p);
			System.out.print(exercise.next().asString()+"\t\t");
			if(p%columns==0)
				System.out.println();
			p++;
		}
		System.out.println();
	}
	public static void main(String[] args) {
		ExerciseSheet sheet=new ExerciseSheet();
		Exercise exercise=new Exercise();
		
		System.out.println("50道加减混合题目第一套");
		exercise.generateBinaryExercise(50);
		sheet.formattedDisplay(exercise);
		sheet.formattedDisplayAns(exercise);
		exercise.clear();
		
		System.out.println("50道加减混合题目第二套");
		exercise.generateBinaryExercise(50);
		sheet.formattedDisplay(exercise);
		sheet.formattedDisplayAns(exercise);
		exercise.clear();
		
		System.out.println("50道加法题目第一套");
		exercise.generateAdditionExercise(50);
		sheet.formattedDisplay(exercise);
		sheet.formattedDisplayAns(exercise);
		exercise.clear();
		
		System.out.println("50道加法题目第二套");
		exercise.generateAdditionExercise(50);
		sheet.formattedDisplay(exercise);
		sheet.formattedDisplayAns(exercise);
		exercise.clear();
		
		System.out.println("50道减法题目第一套");
		exercise.generateSubstractExercise(50);
		sheet.formattedDisplay(exercise);
		sheet.formattedDisplayAns(exercise);
		exercise.clear();
		
		System.out.println("50道减法题目第二套");
		exercise.generateSubstractExercise(50);
		sheet.formattedDisplay(exercise);
		sheet.formattedDisplayAns(exercise);
		exercise.clear();
	}
}
