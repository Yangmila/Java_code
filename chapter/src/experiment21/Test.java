package experiment21;

public class Test {
	public static void main(String[] args){
		Rectangle rectangle=new Rectangle(3.4,4);
		System.out.println("��Ϊ��"+rectangle.getL()+"��Ϊ��"+rectangle.getW()+"�������Ϊ��"+rectangle.shapeS()+"���ε��ܳ�Ϊ��"+rectangle.shapeC());
		Round round=new Round(1.25);
		System.out.println("�뾶Ϊ��"+round.getR()+"Բ�����Ϊ��"+round.shapeS()+"Բ�ε��ܳ�Ϊ��"+round.shapeC());
		Triangle triangle=new Triangle(7.9);
		System.out.println("�߳�Ϊ��"+triangle.getL()+"�ȱ����������Ϊ��"+triangle.shapeS()+"�ȱ������ε��ܳ�Ϊ��"+round.shapeC());
	}
}
