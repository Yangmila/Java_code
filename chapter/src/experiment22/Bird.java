package experiment22;

public class Bird extends Animal implements EatIF, FlyIF, SleepIF, SpeakIF{
	
	public Bird(String sex, int age) {
		super(sex, age);
	}

	public void eat() {
		System.out.println("Äñ³ÔÃ×");

	}

	public void fly() {
		System.out.println("Äñ»á·É");

	}

	public void sleep() {
		System.out.println("ÄñÕ¾×ÅË¯");

	}

	public void speak() {
		System.out.println("Äñ£ºÔûÔû½Ğ");

	}

}
