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
		System.out.println("��������2�ˡ�");
	}
	public static void life(){
		System.out.println("������19��������");
	}
	public static void doing(){
		System.out.println("��������ʻ�С�");
	}
	public static void price(){
		System.out.println("���ļ۸��е�ߡ�");
	}
	public static void run(){
		System.out.println("���Ѿ���ʻ��53422���");
	}
	public static void aboutCar(){
		Car car=new Car("������","5598","��",1567890,"5435��");
		System.out.println("����Ʒ�ƣ�"+car.brand);
		System.out.println("�������ƺţ�"+car.carNum);
		System.out.println("������ɫ��"+car.color);
		System.out.println("�����۸�"+car.price);
		System.out.println("������������"+car.weight);
	}
	
	public static void main(String[] args){
		Car.aboutCar();
	}
}

