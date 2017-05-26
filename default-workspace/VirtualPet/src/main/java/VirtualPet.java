import java.util.Random;

public class VirtualPet {
	
	Random random = new Random();

	//Attributes
	private int hunger = 0;
	private int lazy = 0;
	private int dirty = 0;
	private int bored = 12;
	
	//get random method
	public int getRandom() {
		return random.nextInt(10); //random from 0-9 will be added/sub
	}
	//Tick method
	public void tick() {
		hunger += (5 + getRandom());
		lazy += (3 + getRandom());
		dirty += (2 + getRandom());
		bored -= (2 + getRandom());
		
		}
	
	//getters
	public int getHunger() {
		return hunger;
	}

	public int getLazy() {
		return lazy;
	}

	public int getDirty() {
		return dirty;
	}

	public int getBored() {
		return bored;
	}
	
	//Methods
	public void feed(){
		hunger -= 5; //this is same as hunger = hunger - 5;
		lazy += 2; //this is same lazy = lazy + 2;
		
	}
	
	public void pet () {
		bored -= 2;
		lazy += 3;
	}
	
	public void giveBath () {
		dirty -= 5; // once u clean his dirty ass he get clean
		hunger += 3; 
	}
	

	//This prints a picture
	public void elephant()
	{
		System.out.println("       _..--\"\"-.                  .-\"\"--.._ ");
		System.out.println("   _.-'         \\ __...----...__ /         '-._");
		System.out.println(" .'      .:::...,'              ',...:::.      '.");
		System.out.println("(     .'``'''::;                  ;::'''``'.     )");
		System.out.println(" \\             '-)              (-'             /");
		System.out.println("  \\             /                \\             /");
		System.out.println("   \\          .'.-.            .-.'.          /");
		System.out.println("    \\         | \\0|            |0/ |         /");
		System.out.println("    |          \\  |   .-==-.   |  /          |");
		System.out.println("     \\          `/`;          ;`\\`          /");
		System.out.println("      '.._      (_ |  .-==-.  | _)      _..'");
		System.out.println("          `\"`\"-`/ `/'        '\\` \\`-\"`\"`");
		System.out.println("               / /`;   .==.   ;`\\ \\");
		System.out.println("         .---./_/   \\  .==.  /   \\ \\");
		System.out.println("        / '.    `-.__)       |    `\"");
		System.out.println("       | =(`-.        '==.   ;");
		System.out.println("        \\  '. `-.           /");
		System.out.println("         \\_:_)   `\"--.....-'");
	}
}
