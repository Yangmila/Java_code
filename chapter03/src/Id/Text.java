package Id;

public class Text {

	public static void main(String[] args) {
		try{
			Cin cin=new Cin("543254200008151987","��Ľ��");
			System.out.println(cin.getName()+"Ϊ"+Cin.showsSex(cin.getNum())+"�ԣ�"+"����������:");
			Cin.showBirthday(cin.getNum());
		}
		catch(CinException ex){
			System.out.println(ex.getMessage());
			
		}
	}
}
