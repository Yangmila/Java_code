package experiment22;

public class Cat extends Animal implements EatIF, SleepIF, SpeakIF {

	public Cat(String sex, int age) {
		super(sex, age);
	}

	public void eat() {
		System.out.println("è���è��");

	}

	public void sleep() {
		System.out.println("è��ſ��˯");

	}

	public void speak() {
		System.out.println("è�䣺��~");

	}

}
