package experiment01;
public class C {
	public String rank(int score){
		String result="";//定义用来保存结果的变量
		
				if(score>=80){
					result="高等级";
				}
				else{
					if(score>=60){
						result="中等级";
					}
					else{
						result="低等级";
					}
				}
		return result;//返回结果变量
	}
	//静态方法
	public static String rank1(int score){
		String result="";//定义用来保存结果的变量
		if(score<60){
			result="不厉害";
		}
		else{
				if(score<80){
					result="还不错";
				}
				else{
						result="你太棒了";
					}
		}
		return result;//返回结果变量
	}
}