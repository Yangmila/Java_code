package experiment31;

public class Text {
	public static void main(String[] args) {
		Id id=new Id("543254200008151987","��Ľ��");
		System.out.print(id.getName()+"Ϊ"+Id.showSex(id.getNum())+"�ԣ�");
		System.out.print(Id.check(id.getNum())+"����ʡ������δ����");
	}

}
