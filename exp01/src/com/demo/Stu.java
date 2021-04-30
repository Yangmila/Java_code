package com.demo;

public class Stu {
	private String sno;
	private String name;
	private String sex;
	private int age;
	private String type;
	
	public String getSno() {
		return sno;
	}
	public void setSno(String sno) {
		this.sno = sno;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getSex() {
		return sex;
	}
	public void setSex(String sex) {
		this.sex = sex;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
	
	public Stu(String sno,String name,String sex,int age,String type) {
		this.sno = sno;
		this.name = name;
		this.sex = sex;
		this.age = age;
		this.type = type;
	}
}
