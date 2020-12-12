package experiment01;

public class B {
	//非静态方法
	public String getRankByScore(int score)
	{
		String result="";//定义用来保存结果的变量
		if(score>=90)
		{
			result="优1";
		}
		else
		{
			if(score>=80)
			{
				result="良1";
			}
			else
			{
				if(score>=70)
				{
					result="中1";
				}
				else
				{
					if(score>=60)
					{
						result="及格1";
					}
					else
					{
						result="不及格1";
					}
				}
			}
		}
		return result;//返回结果变量
	}
	//静态方法
	public static String getRankByScore1(int score)
	{
		String result="";//定义用来保存结果的变量
		if(score<60)
		{
			result="不及格";
		}
		else
		{
			if(score<70)
			{
				result="及格";
			}
			else
			{
				if(score<80)
				{
					result="中";
				}
				else
				{
					if(score<90)
					{
						result="良好";
					}
					else
					{
						result="优";
					}
				}
			}
		}
		return result;//返回结果变量
	}
}
