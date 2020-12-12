package experiment21;

public class Rectangle extends Picture{
	private double l;
	private double w;
	
	public void setL(double l) {
		this.l = l;
	}
	public double getL() {
		return l;
	}
	public void setW(double w) {
		this.w = w;
	}
	public double getW() {
		return w;
	}
	
	public Double shapeS(){
		return w*l;
	}
	
	public Double shapeC(){
		return 2*(l+w);
	}
	
	public Rectangle(double l,double w){
		this.l = l;
		this.w = w;
	}
}
