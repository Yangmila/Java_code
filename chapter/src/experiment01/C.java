package experiment01;
public class C {
	public String rank(int score){
		String result="";//���������������ı���
		
				if(score>=80){
					result="�ߵȼ�";
				}
				else{
					if(score>=60){
						result="�еȼ�";
					}
					else{
						result="�͵ȼ�";
					}
				}
		return result;//���ؽ������
	}
	//��̬����
	public static String rank1(int score){
		String result="";//���������������ı���
		if(score<60){
			result="������";
		}
		else{
				if(score<80){
					result="������";
				}
				else{
						result="��̫����";
					}
		}
		return result;//���ؽ������
	}
}