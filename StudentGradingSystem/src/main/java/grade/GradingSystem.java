package grade;

public class GradingSystem {

	public String getGrade(double percentage)
	{
		if(percentage >=90)
		{
			return "A+";
		}
		else if(percentage>=75)
		{
			return "A";
		}
		else if(percentage>=60)
		{
			return "B";
		}
		else if(percentage >=50)
		{
			return "C";
			
		}
		else
		{
			return "Fail";
		}
	}
}
