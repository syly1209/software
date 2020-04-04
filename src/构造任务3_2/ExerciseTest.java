package 构造任务3_2;

import static org.junit.Assert.assertEquals;

import org.junit.Before;
import org.junit.Ignore;
import org.junit.Test;

public class ExerciseTest {

	Exercise exercise;
	@Before
	public void setUp() throws Exception {
		exercise=new Exercise();
	}

	@Ignore
	public void testGenerateBinaryExercise1() {
		exercise.generateBinaryExercise(50);
		int p=0;
		while(exercise.hasNext()) {
			exercise.next();
			p++;
		}
		assertEquals(p,50);
	}
	@Test
	public void testGenerateBinaryExercise2() {
		exercise.generateBinaryExercise(50);
		int p=0;
		while(exercise.hasNext()) {
			exercise.next();
			p++;
		}
		assertEquals(p,40);
	}

	@Ignore
	public void testGenerateAdditionExercise1() {
		exercise.generateAdditionExercise(50);
		int p=0;
		while(exercise.hasNext()) {
			exercise.next();
			p++;
		}
		assertEquals(p,50);
	}
	@Ignore
	public void testGenerateAdditionExercise2() {
		exercise.generateAdditionExercise(50);
		int p=0;
		while(exercise.hasNext()) {
			exercise.next();
			p++;
		}
		assertEquals(p,40);
	}

	@Ignore
	public void testGenerateSubstractExercise1() {
		exercise.generateSubstractExercise(50);
		int p=0;
		while(exercise.hasNext()) {
			exercise.next();
			p++;
		}
		assertEquals(p,50);
	}
	@Ignore
	public void testGenerateSubstractExercise2() {
		exercise.generateSubstractExercise(50);
		int p=0;
		while(exercise.hasNext()) {
			exercise.next();
			p++;
		}
		assertEquals(p,40);
	}

}
