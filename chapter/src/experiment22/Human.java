package experiment22;

public class Human extends Animal implements EatIF, SleepIF, SpeakIF, ThinkIF {

	public Human(String sex, int age) {
		super(sex, age);
	}

	public void eat() {
		System.out.println("�˳Ի����ը��������");

	}

	public void sleep() {
		System.out.println("������˯");

	}

	public void speak() {
		System.out.println("������Ǯ");

	}

	public void think() {
		System.out.println("��˵���ġ�Ӣ��");

	}
	

}
