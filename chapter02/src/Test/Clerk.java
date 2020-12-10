package Test;

public class Clerk {
	    private String clName;//店员姓名
	    private String sex;//性别
	    private int age;//年龄

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

