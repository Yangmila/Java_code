package experiment13;

public class Text {
	public static void main(String[] args){
		Undergraduate undergraduate1=new Undergraduate("杨杰","男",21,"本科生");
		Undergraduate undergraduate2=new Undergraduate("杨浩","男",19,"本科生");
		
		Graduate graduate1 = new Graduate("张钰","女",22,"研究生");
		Graduate graduate2 = new Graduate("钟慕寒","男",24,"研究生");
		
		Teacher teacher1 =  new Teacher("李程","男",53);
	    Teacher teacher2 =  new Teacher("王晟","男",42);
	    
	    Team team1 = new Team("研究团队1","人工智能",15);
	    Team team2 = new Team("研究团队2","Gps",20);
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
