package experiment13;

public class Team {
		private String name;
		private String className;
		private int    maxNum;
		private int currentUcount;//当前本科生数量
		private int currentGcount;//当前研究生数量
		private Teacher teacher;
		private Undergraduate[] undergraduateList;
		private Graduate[] graduateList;
		
		public Team(String name,String className,int maxNum){
			this.setName (name);
			this.setClassName(className);
			this.setMaxNum (maxNum);
			undergraduateList=new Undergraduate[maxNum / 2];
			graduateList=new Graduate[maxNum / 2];
		}
		
		public void setName(String name) {
			this.name = name;
		}
		public String getName() {
			return name;
		}
		public void setClassName(String className) {
			this.className = className;
		}
		public String getClassName() {
			return className;
		}
		public void setMaxNum(int maxNum) {
			this.maxNum = maxNum;
		}
		public int getMaxNum() {
			return maxNum;
		}
		public void setCurrentUcount(int currentUcount) {
			this.currentUcount = currentUcount;
		}
		public int getCurrentUcount() {
			return currentUcount;
		}
		public void setCurrentGcount(int currentGcount) {
			this.currentGcount = currentGcount;
		}
		public int getCurrentGcount() {
			return currentGcount;
		}
		public void setTeacher(Teacher teacher) {
			this.teacher = teacher;
		}
		public Teacher getTeacher() {
			return teacher;
		}
		public void setUndergraduateList(Undergraduate[] undergraduateList) {
			this.undergraduateList = undergraduateList;
		}
		public Undergraduate[] getUndergraduateList() {
			return undergraduateList;
		}
		public void setGraduateList(Graduate[] graduateList) {
			this.graduateList = graduateList;
		}
		public Graduate[] getGraduateList() {
			return graduateList;
		}
		
		//指导老师加入
		public void tInTeam(Teacher teacher){
			this.teacher = teacher;
			System.out.println("指导老师"+teacher.getName()+"加入团队"+getName());
		}
		//本科生加入
		public void uInTeam(Undergraduate[] inUndergraduateList)
		{
			for(int i=0;i< inUndergraduateList.length;i++)
			{
				uInOneTeam( inUndergraduateList[i]);
			}
		}
		public void uInOneTeam(Undergraduate undergraduate)
		{
			if(currentUcount==maxNum)
			{
				System.out.println("该团队本科生已足够");
			}
			else
			{
				currentUcount++;
				for(int i=0;i<undergraduateList.length;i++)
				{
					if(undergraduateList[i]==null)
					{
						undergraduateList[i]=undergraduate;
						System.out.println(undergraduate.getName()+"已加入团队");
						break;
					}
				}
			}
		}
		//研究生加入
		public void gInTeam(Graduate[] inGraduateList)
		{
			for(int i=0;i< inGraduateList.length;i++)
			{
				gInOneTeam(inGraduateList[i]);
			}
		}
		public void gInOneTeam(Graduate graduate)
		{
			if(currentGcount==maxNum)
			{
				System.out.println("该团队研究生已足够");
			}
			else
			{
				currentGcount++;
				for(int i=0;i<graduateList.length;i++)
				{
					if(graduateList[i]==null)
					{
						graduateList[i]=graduate;
						System.out.println(graduate.getName()+"已加入团队");
						break;
					}
				}
			}
		}
		//输出团队信息
	    public  void Pri(Team team)
	    {
	        System.out.println("团队名称:" + team.getName() + " 指导老师:" + getTeacher().getName() + " 课题名称:" + getClassName());
	        System.out.println("研究生:");
	        for(int i = 0;i < graduateList.length;i++)
	        {
	            if(graduateList[i] != null)
	            System.out.printf(" " + graduateList[i].getName());
	        }
	        System.out.println("\n" + "本科生:");
	        for(int i = 0;i < undergraduateList.length;i++)
	        {
	            if(undergraduateList[i] != null)
	                System.out.printf(" " + undergraduateList[i].getName());
	        }
	        System.out.println("");
	    }
	}
