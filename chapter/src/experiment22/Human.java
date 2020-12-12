package experiment22;

public class Human extends Animal implements EatIF, SleepIF, SpeakIF, ThinkIF {

	public Human(String sex, int age) {
		super(sex, age);
	}

	public void eat() {
		System.out.println("人吃火锅、炸鸡、汉堡");

	}

	public void sleep() {
		System.out.println("人躺着睡");

	}

	public void speak() {
		System.out.println("人想挣钱");

	}

	public void think() {
		System.out.println("人说中文、英文");

	}
	

}
