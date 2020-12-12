package experiment31;

public class Text {
	public static void main(String[] args) {
		Id id=new Id("543254200008151987","杨慕浩");
		System.out.print(id.getName()+"为"+Id.showSex(id.getNum())+"性，");
		System.out.print(Id.check(id.getNum())+"陕西省西安市未央区");
	}

}
