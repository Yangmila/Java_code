package experiment13;

public class Team {
		private String name;
		private String className;
		private int    maxNum;
		private int currentUcount;//��ǰ����������
		private int currentGcount;//��ǰ�о�������
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
		
		//ָ����ʦ����
		public void tInTeam(Teacher teacher){
			this.teacher = teacher;
			System.out.println("ָ����ʦ"+teacher.getName()+"�����Ŷ�"+getName());
		}
		//����������
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
				System.out.println("���Ŷӱ��������㹻");
			}
			else
			{
				currentUcount++;
				for(int i=0;i<undergraduateList.length;i++)
				{
					if(undergraduateList[i]==null)
					{
						undergraduateList[i]=undergraduate;
						System.out.println(undergraduate.getName()+"�Ѽ����Ŷ�");
						break;
					}
				}
			}
		}
		//�о�������
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
				System.out.println("���Ŷ��о������㹻");
			}
			else
			{
				currentGcount++;
				for(int i=0;i<graduateList.length;i++)
				{
					if(graduateList[i]==null)
					{
						graduateList[i]=graduate;
						System.out.println(graduate.getName()+"�Ѽ����Ŷ�");
						break;
					}
				}
			}
		}
		//����Ŷ���Ϣ
	    public  void Pri(Team team)
	    {
	        System.out.println("�Ŷ�����:" + team.getName() + " ָ����ʦ:" + getTeacher().getName() + " ��������:" + getClassName());
	        System.out.println("�о���:");
	        for(int i = 0;i < graduateList.length;i++)
	        {
	            if(graduateList[i] != null)
	            System.out.printf(" " + graduateList[i].getName());
	        }
	        System.out.println("\n" + "������:");
	        for(int i = 0;i < undergraduateList.length;i++)
	        {
	            if(undergraduateList[i] != null)
	                System.out.printf(" " + undergraduateList[i].getName());
	        }
	        System.out.println("");
	    }
	}
