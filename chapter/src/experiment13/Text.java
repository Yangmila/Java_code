package experiment13;

public class Text {
	public static void main(String[] args){
		Undergraduate undergraduate1=new Undergraduate("���","��",21,"������");
		Undergraduate undergraduate2=new Undergraduate("���","��",19,"������");
		
		Graduate graduate1 = new Graduate("����","Ů",22,"�о���");
		Graduate graduate2 = new Graduate("��Ľ��","��",24,"�о���");
		
		Teacher teacher1 =  new Teacher("���","��",53);
	    Teacher teacher2 =  new Teacher("����","��",42);
	    
	    Team team1 = new Team("�о��Ŷ�1","�˹�����",15);
	    Team team2 = new Team("�о��Ŷ�2","Gps",20);
	    team1.tInTeam(teacher1);
	    team2.tInTeam(teacher2);

	    team1.gInOneTeam(graduate1);
	    team2.gInOneTeam(graduate2);

	    team1.uInOneTeam(undergraduate1);
	    team2.uInOneTeam(undergraduate2);
	    team1.Pri(team1);
	    team2.Pri(team2);
	}
}
