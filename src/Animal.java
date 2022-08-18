public class Animal {

	public String feed() {

		System.out.println("Animal.feed()");
		return "Animal: COOL!";

	}

	@Override
	public String toString() {
		return "Animal{}";
	}
}
