package ��������3_2;


public class ExerciseSheet {
	private static final short COLUMN_NUMBER=5;  
	//��ӡ��ʽ
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
	//��ӡ���𰸵���ʽ
	public void formattedDisplayAns (Exercise exercise) {
		formattedDisplayAns(exercise,COLUMN_NUMBER);
	}
	public void formattedDisplayAns(Exercise exercise, int columns) {
		System.out.println("--------------------��--------------------");
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
		
		System.out.println("50���Ӽ������Ŀ��һ��");
		exercise.generateBinaryExercise(50);
		sheet.formattedDisplay(exercise);
		sheet.formattedDisplayAns(exercise);
		exercise.clear();
		
		System.out.println("50���Ӽ������Ŀ�ڶ���");
		exercise.generateBinaryExercise(50);
		sheet.formattedDisplay(exercise);
		sheet.formattedDisplayAns(exercise);
		exercise.clear();
		
		System.out.println("50���ӷ���Ŀ��һ��");
		exercise.generateAdditionExercise(50);
		sheet.formattedDisplay(exercise);
		sheet.formattedDisplayAns(exercise);
		exercise.clear();
		
		System.out.println("50���ӷ���Ŀ�ڶ���");
		exercise.generateAdditionExercise(50);
		sheet.formattedDisplay(exercise);
		sheet.formattedDisplayAns(exercise);
		exercise.clear();
		
		System.out.println("50��������Ŀ��һ��");
		exercise.generateSubstractExercise(50);
		sheet.formattedDisplay(exercise);
		sheet.formattedDisplayAns(exercise);
		exercise.clear();
		
		System.out.println("50��������Ŀ�ڶ���");
		exercise.generateSubstractExercise(50);
		sheet.formattedDisplay(exercise);
		sheet.formattedDisplayAns(exercise);
		exercise.clear();
	}
}
