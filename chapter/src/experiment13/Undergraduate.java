package experiment13;

public class Undergraduate {
	private String 	name;
	private String	sex;
	private int    	age;
	private String 	nameUngra;
	public int length;
	
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
	public void setNumUngra(String numUngra) {
		this.nameUngra = numUngra;
	}
	public String getNumUngra() {
		return nameUngra;
	}
	
	public Undergraduate(String name,String sex,int age,String nameUngra){
		this.name = name;
		this.sex = sex;
		this.age = age;
		this.nameUngra = nameUngra;
	}
}
