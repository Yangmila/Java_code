package experiment21;

public class Triangle extends Picture{
	private double l;
	
	public void setL(double l) {
		this.l = l;
	}
	public double getL() {
		return l;
	}
	
	public Double shapeS(){
		double s = (3*l) / 2;
        double area = Math.pow(s*((s - l)*(s - l)*(s - l)), 0.5);
        return area;
	}
	public Double shapeC(){
		return 3*l;
	}
	
	public Triangle(double l){
		this.l = l;
	}
	
}
