package dawgs;

public class DogTest {

	public static void main(String[] args) {
		Dog shortDog = new Dog("Short Dog", 14);
		shortDog.bark();
		
		//when we tell him to speak, he responds
		String response = shortDog.speak();
		System.out.println("Short Dog says -" + response + "',");
		
		int humanAge = shortDog.equivalentHumanAge();
		System.out.println("If I were a human, I'd be" + humanAge);
	}
	
}
