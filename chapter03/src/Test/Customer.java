package Test;

public class Customer {
	private static String name;
	private String sex;
	private float money;
	
	public void setName1(String name) {
		this.name = name;
	}
	public static String getName1() {
		return name;
	}
	public void setSex(String sex) {
		this.sex = sex;
	}
	public String getSex() {
		return sex;
	}
	public void setMoney(float money) {
		this.money = money;
	}
	public float getMoney() {
		return money;
	}
	public Customer(String name,String sex,float money)
	{
		setName1(name);
		setSex(sex);
		setMoney(money);
	}
	public void setName(String name) {
		this.name = name;
	}
	public static String getName() {
		return name;
	}
}
