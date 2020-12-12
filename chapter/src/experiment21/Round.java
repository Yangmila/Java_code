package experiment21;

public class Round extends Picture{
	private	double r;

	public void setR(double r) {
		this.r = r;
	}

	public double getR() {
		return r;
	}
	
	public Double shapeS(){
		return 3.14*r*r;
	}
	public Double shapeC(){
		return 3.14*2*r;
	}
	
	public Round(double r){
		this.r = r;
	}
}
