package Test;

public class Customer {

	    private String custName;//�˿�����
	    private String sex;//�Ա�
	    private int age;//����
	    private double money;

	    public void setCustName(String custName) 
	    {
			this.custName = custName;
		}
	    public String getCustName() 
	    {
			return custName;
		}
	    public void setSex(String sex) 
	    {
			this.sex = sex;
		}
	    public String getSex() 
	    {
			return sex;
		}
	    public void setAge(int age) 
	    {
			this.age = age;
		}
	    public int getAge() 
	    {
			return age;
	    }
	    public void setMoney(double money) 
	    {
			this.money = money;
		}
	    public double getMoney() 
	    {
			return money;
		}
	    
	    public Customer(String custName,String sex,int age,double money)
		{
			setCustName(custName);
			setSex(sex);
			setAge(age);
			setMoney(money);
		}
	}

