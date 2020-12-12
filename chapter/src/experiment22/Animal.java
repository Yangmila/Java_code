package experiment22;

public abstract class Animal {
	private String sex;
	private int age;
	
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
	
	public Animal(String sex,int age){
		this.sex = sex;
		this.age = age;
	}
	
}
