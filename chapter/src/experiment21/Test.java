package experiment21;

public class Test {
	public static void main(String[] args){
		Rectangle rectangle=new Rectangle(3.4,4);
		System.out.println("长为："+rectangle.getL()+"宽为："+rectangle.getW()+"矩形面积为："+rectangle.shapeS()+"矩形的周长为："+rectangle.shapeC());
		Round round=new Round(1.25);
		System.out.println("半径为："+round.getR()+"圆形面积为："+round.shapeS()+"圆形的周长为："+round.shapeC());
		Triangle triangle=new Triangle(7.9);
		System.out.println("边长为："+triangle.getL()+"等边三角形面积为："+triangle.shapeS()+"等边三角形的周长为："+round.shapeC());
	}
}
