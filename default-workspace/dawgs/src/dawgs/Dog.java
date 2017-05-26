package dawgs;

public class Dog {
	private String name;
	private int age;
	public final static String FAMILY = "canine";
	
	// constructors create objects (instances of classes)
	public Dog (String name, int age) {
		this.name = name;
		this.age = age;
	}
	
	// 'void' methods don't return a value
	public void bark() {
		System.out.println("woof");
	}
	
	// this method returns a String literal
	public String speak() {
		// '+' is the String concatenation operator
		return "My name is " + name;
	}
	
	public int equivalentHumanAge() {
		// 7 is what we call a 'magic number'. that's bad.
		// we'd usually create a constant
		return 7*age;
	}
}
