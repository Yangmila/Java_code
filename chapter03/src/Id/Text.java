package Id;

public class Text {

	public static void main(String[] args) {
		try{
			Cin cin=new Cin("543254200008151987","杨慕浩");
			System.out.println(cin.getName()+"为"+Cin.showsSex(cin.getNum())+"性，"+"出生日期是:");
			Cin.showBirthday(cin.getNum());
		}
		catch(CinException ex){
			System.out.println(ex.getMessage());
			
		}
	}
}
