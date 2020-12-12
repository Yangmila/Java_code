package experiment22;

public class Bird extends Animal implements EatIF, FlyIF, SleepIF, SpeakIF{
	
	public Bird(String sex, int age) {
		super(sex, age);
	}

	public void eat() {
		System.out.println("�����");

	}

	public void fly() {
		System.out.println("����");

	}

	public void sleep() {
		System.out.println("��վ��˯");

	}

	public void speak() {
		System.out.println("��������");

	}

}
