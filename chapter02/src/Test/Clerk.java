package Test;

public class Clerk {
	    private String clName;//��Ա����
	    private String sex;//�Ա�
	    private int age;//����

	    public void setClName(String clName) 
	    {
			this.clName = clName;
		}
	    public String getClName() 
	    {
			return clName;
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
	    
	    public Clerk(String clName,String sex,int age)
		{
			setClName(clName);
			setSex(sex);
			setAge(age);
		}
	}

