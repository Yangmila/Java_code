package Test;

public class Salesperson {
	private String name;
	private String sex;
	private String salespersonNum;
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
	public void setSalespersonNum(String salespersonNum) {
		this.salespersonNum = salespersonNum;
	}
	public String getSalespersonNum() {
		return salespersonNum;
	}
	public Salesperson(String name,String sex,String salespersonNum)
	{
		setName(name);
		setSex(sex);
		setSalespersonNum(salespersonNum);
	}
}
