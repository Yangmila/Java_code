package experiment01;

public class B {
	//�Ǿ�̬����
	public String getRankByScore(int score)
	{
		String result="";//���������������ı���
		if(score>=90)
		{
			result="��1";
		}
		else
		{
			if(score>=80)
			{
				result="��1";
			}
			else
			{
				if(score>=70)
				{
					result="��1";
				}
				else
				{
					if(score>=60)
					{
						result="����1";
					}
					else
					{
						result="������1";
					}
				}
			}
		}
		return result;//���ؽ������
	}
	//��̬����
	public static String getRankByScore1(int score)
	{
		String result="";//���������������ı���
		if(score<60)
		{
			result="������";
		}
		else
		{
			if(score<70)
			{
				result="����";
			}
			else
			{
				if(score<80)
				{
					result="��";
				}
				else
				{
					if(score<90)
					{
						result="����";
					}
					else
					{
						result="��";
					}
				}
			}
		}
		return result;//���ؽ������
	}
}
