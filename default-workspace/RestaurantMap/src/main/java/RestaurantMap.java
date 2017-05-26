import java.math.BigDecimal;
import java.util.HashMap;
import java.util.Map;
public class RestaurantMap {
    public static void main(String[] args) {
        //initialize the map
        Map<String,BigDecimal> menu = new HashMap<String,BigDecimal>();
        
        //Adding to Map whenever put ---> add
        BigDecimal price = new BigDecimal("8.97");
        menu.put("Spaghetti", price);
        
        price = new BigDecimal("10.98"); // reusing price
        menu.put("Lasagna", price);
        
        menu.put("Kale Salad", new BigDecimal("10.00"));
        
        menu.put("Pizza", new BigDecimal("15.50")); //inline
        
        menu.put("Champagne", new BigDecimal("200.00"));
        
        menu.put("Wine", new BigDecimal("175.00"));
        
        //Getting the price for Spaghetti
        price = menu.get("Spaghetti");
        System.out.println("Spaghetti price = " + price + "\n");
        
        //Getting menu items
        int entries = menu.size();
        System.out.println("Number of menu entries = " + entries + "\n");
        
        //Checking if we have Champagne
        boolean findChampagne = menu.containsKey("Champagne");
        if (findChampagne) {
            System.out.println("Yes we have Champagne!\n");
        }
        
        boolean findValue = menu.containsValue(new BigDecimal("13.50"));
        
        if (findValue) {
            System.out.println("13.50 is on the menu price\n");
        }else{
            System.out.println("15.50 is on the menu price\n");
        }
        
        //We are removing Kale
        menu.remove("Kale Salad");
        System.out.println("This is our updated menu after removing Kale \n" + menu +"\n" );
        
        //we clear menu
        menu.clear();
        System.out.println("this is our updated menu size " + menu.size() + "\n");
        
        //checking if we still have items on the menu
        boolean emptyMenu = menu.isEmpty();
        if(emptyMenu) {
            System.out.println("Our menu is Empy");
        }else{
            System.out.println("We still have some items on our menu");
        }
        
    }
}
