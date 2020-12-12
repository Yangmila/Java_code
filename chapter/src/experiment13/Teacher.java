package experiment13;

public class Teacher {
	private String name;
	private String sex;
	private int    age;
	
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
	
	public Teacher(String name,String sex,int age){
		this.name = name;
		this.sex = sex;
		this.age = age;
	}
	
}
