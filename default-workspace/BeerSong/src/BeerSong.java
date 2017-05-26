
public class BeerSong {

	public static void main(String[] args) {
		
		int numberOfBottles = 100;
		System.out.println(numberOfBottles + "bottles of refreshing beverage on the wall");
		
		while(numberOfBottles >=67) {
			numberOfBottles = numberOfBottles - 1;
			singstanza(numberOfBottles);
			
		}
		do {
			numberOfBottles -=1;
			singstanza(numberOfBottles);
		} while (numberOfBottles > 50);
		for (int bottlecount = 49; bottlecount >0; bottlecount--){
		}
	}
	
	private static void singstanza(int numberOfBottles) {
		String descriptor;
		if(numberOfBottles ==1) {
			descriptor = "bottles";
		} else{
			descriptor = "bottle";
		}
		String bottlesLyric = numberOfBottles + " " + descriptor + " of refreshing beverage";
		System.out.println(bottlesLyric + " on the wall,");
		System.out.println(bottlesLyric + ", Take one down, pass it around,");
	}

	private static void singstanza1(int numberOfBottles) {
		// TODO Auto-generated method stub
		
	}

}
