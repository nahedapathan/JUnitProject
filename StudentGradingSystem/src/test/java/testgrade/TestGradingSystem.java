package testgrade;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

import grade.GradingSystem;

public class TestGradingSystem {

	@Test
	public void testGradeAPlus()
	{
		GradingSystem gs=new GradingSystem();
		double percentage=95.0;
		String expectedGrade="A+";
		assertEquals("Something Wrong",expectedGrade,gs.getGrade(percentage));
	}
	
	@Test
	public void testGradeFail()
	{
		GradingSystem gs=new GradingSystem();
		double percentage=45.0;
		String expectedGrade="Fail";
		
		assertEquals("SomethingWrong",expectedGrade,gs.getGrade(percentage));
	}
}
