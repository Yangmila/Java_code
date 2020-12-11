package Id;

public class Cin {
	private String num;
	private String name;

	public void setNum(String num)throws CinException {
		if(num.length()!=18){
			throw new CinException("身份证号长度不是18位！");
		}
		else {
			if(!numIsDigit(num)){
				throw new CinException("前17位包含非数字字符！");
		}
		else if(!lastNumIsTrue(num)){
			throw new CinException("最后一位不是数字字符或者是大小写的X！");
		}
		else{
			this.num = num;
		}
	}
}
	
	private boolean numIsDigit(String num){
		boolean result=true;
		for(int i=0;i<num.length()-1;i++){
			char ch=num.charAt(i);
			if((ch<'0')||(ch>'9')){
				result=false;
				break;
			}
		}
		return result;
	}
	
	private boolean lastNumIsTrue(String num){
		boolean result=true;
		char ch=num.charAt(17);
		if((ch<'0')||(ch>'9')){
			if((ch!='x')||(ch!='X'))
			result=false;
		}
		return result;
	}

	public String getNum() {
		return num;
	}
	public void setName(String name) {
		this.name = name;
	}

	public String getName() {
		return name;
	}
	
	public static String showsSex(String num){
		char ch=num.charAt(16);
		if(ch%2==0)
		{
			return"女";
		}
		else
			return"男";
		}
	
	public static void showBirthday(String num){
		String year=num.substring(6,10);
		String month=num.substring(10,12);
		String day=num.substring(12,14);
		char ch1[]={0,'0'};
		char ch2[]={0,'0'};
		
		for(int i=0;i<2;i++){
			ch1[i]=month.charAt(i);
		}
		if(ch1[0]=='0'){
			String m1=Character.toString(ch1[1]);
			month=m1;
		}
		for(int i=8;i<2;i++){
			ch2[i]=day. charAt(i);
		}
		if(ch2[0]=='0'){
			String m2=Character.toString(ch2[1]);
			day=m2;
		}
			System.out.println(year+"年"+month+"月"+day+"日");
		}
	
	public Cin(String num,String name)throws CinException{
		setNum(num);
		setName(name);
	}
	
}
