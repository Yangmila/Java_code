package experiment11;

public class Car {
	private String brand;
	private String carNum;
	private String color;
	private int    price;
	private String weight;
	public void setBrand(String brand) {
		this.brand = brand;
	}
	public String getBrand() {
		return brand;
	}
	public void setCarNum(String carNum) {
		this.carNum = carNum;
	}
	public String getCarNum() {
		return carNum;
	}
	public void setColor(String color) {
		this.color = color;
	}
	public String getColor() {
		return color;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	public int getPrice() {
		return price;
	}
	public void setWeight(String weight) {
		this.weight = weight;
	}
	public String getWeight() {
		return weight;
	}
	
	public Car(String brand,String carNum,String color,int price,String weight){
		this.brand = brand;
		this.carNum = carNum;
		this.color = color;
		this.price = price;
		this.weight = weight;
	}
	
	public static void people(){
		System.out.println("车上已做2人。");
	}
	public static void life(){
		System.out.println("车还有19年寿命。");
	}
	public static void doing(){
		System.out.println("车正在行驶中。");
	}
	public static void price(){
		System.out.println("车的价格有点高。");
	}
	public static void run(){
		System.out.println("车已经行驶了53422公里。");
	}
	public static void aboutCar(){
		Car car=new Car("科迈罗","5598","黄",1567890,"5435吨");
		System.out.println("汽车品牌："+car.brand);
		System.out.println("汽车车牌号："+car.carNum);
		System.out.println("汽车颜色："+car.color);
		System.out.println("汽车价格："+car.price);
		System.out.println("汽车空载量："+car.weight);
	}
	
	public static void main(String[] args){
		Car.aboutCar();
	}
}

