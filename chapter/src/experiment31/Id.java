package experiment31;

public class Id {
	private String num;
	private String name;
	public void setNum(String num) {
		this.num = num;
	}
	public String getNum() {
		return num;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getName() {
		return name;
	}
	public static String showSex(String num){
		char ch=num.charAt(17);
		if(ch%2==0){
			return "Ů";
		}
		else
			return "��";
	}
	public static String check(String num){
		if(num.substring(0,6).equals("610113")){
			return "��";
		}
		else{
			return "����";
		}
	}
	
	public Id(String num,String name){
		setNum(num);
		setName(name);
	}
}
