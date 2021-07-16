package C209_L03;

public class Birthday extends Card {
	private int age;

	public Birthday(String recipient, int age) {
		super(recipient);
		this.age = age;
	}

	public void greeting() {
		System.out.println("Dear " + super.getRecipient() + ",\n");
		System.out.println("Happy " + age + "th Birthday\n\n");
	}
	
	// additional method---does not override parent's method
	public void greeting(String sender) {
		this.greeting();
		System.out.println("How you have grown!!\n");
		System.out.println("Love, " + sender + "\n");
	}
	
	public int getAge(){
		return age;
	}
}