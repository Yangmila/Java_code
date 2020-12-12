package experiment13;

public class Graduate {
	private String 	name;
	private String	sex;
	private int    	age;
	private String 	nameGra;
	
	public void setName(String name) {
		this.name = name;
	}
	public String getName() {
		return name;
	}
	public void setSex(String sex) {
		this.sex = sex;
	}
	public String getSex() {
		return sex;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public int getAge() {
		return age;
	}
	public void setNumGra(String numGra) {
		this.nameGra = numGra;
	}
	public String getNumGra() {
		return nameGra;
	}
	
	
	public Graduate(String name,String sex,int age,String nameGra){
	this.name = name;
	this.sex = sex;
	this.age = age;
	this.nameGra = nameGra;
	}
}
