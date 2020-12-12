package experiment22;

public class Cat extends Animal implements EatIF, SleepIF, SpeakIF {

	public Cat(String sex, int age) {
		super(sex, age);
	}

	public void eat() {
		System.out.println("Ã¨ßä³ÔÃ¨Á¸");

	}

	public void sleep() {
		System.out.println("Ã¨ßäÅ¿×ÅË¯");

	}

	public void speak() {
		System.out.println("Ã¨ßä£ºß÷~");

	}

}
