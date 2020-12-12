package experiment14;

public class Student {
	private static String name;
	private String sex;
	private int    age;
	
	public void setName(String name) {
		this.name = name;
	}
	public static String getName() {
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
	
	public Student(String name,String sex,int age){
		this.name = name;
		this.sex = sex;
		this.age = age;
	}
}
