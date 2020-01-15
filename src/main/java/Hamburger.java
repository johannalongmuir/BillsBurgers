import java.util.ArrayList;
import java.util.List;

public class Hamburger {
    private String name;
    private String breadRoll;
    private String meat;
    private double basePrice;
    private int maxAdditionalToppings;
    private List<AdditionalTopping> allAdditionalToppings;


    public Hamburger(String breadRoll, String meat) {
        this("Basic", breadRoll, meat, 5.00, 4);
    }

    public Hamburger(String name, String breadRoll, String meat, double basePrice, int maxAdditionalToppings) {
        this.name = name;
        this.breadRoll = breadRoll;
        this.meat = meat;
        this.basePrice = basePrice;
        this.allAdditionalToppings = new ArrayList<>();
        this.maxAdditionalToppings = maxAdditionalToppings;
    }

    public void addAdditionalTopping(String name){
        if (allAdditionalToppings.size() < maxAdditionalToppings){
            allAdditionalToppings.add(new AdditionalTopping(name));
            System.out.println("Added " + name);
        } else {
            System.out.println("Max number of toppings is: " + maxAdditionalToppings + ". Cannot add " + name);
        }
    }

    public void removeAdditionalTopping(String string){
        allAdditionalToppings.removeIf(additionalTopping -> additionalTopping.getName().equalsIgnoreCase(string));
        System.out.println("Removed " + string);
    }


    public String getAllAdditionalToppings(){
        int additionalCount = 1;
        String response = "";
        if (allAdditionalToppings.size() == 0){
            response = "No additional Toppings \n";
        } else {
            for (AdditionalTopping additionalTopping: allAdditionalToppings) {
                response += "Additional Topping " + additionalCount + ": " + additionalTopping.getName() + ", Price: " + additionalTopping.getCost() + "\n";
                additionalCount++;
            }
        }
        return response;
    }




    public String getTotalPrice(){
        if(allAdditionalToppings != null){
            return "Total is: " + (basePrice + totalAdditionalPrice());
        } else{
            return "Total is: " + basePrice;
        }
    }

    private double totalAdditionalPrice() {
        double totalAdditionalCost = 0;
        for (AdditionalTopping additionalTopping : allAdditionalToppings) {
            totalAdditionalCost += additionalTopping.getCost();
        }
        return totalAdditionalCost;
    }

    public String orderSummary(){
        return "You've Ordered: \n" +
                "The " + this.name + " with " + this.meat + " on " + this.breadRoll + "\nBase Price: " + this.basePrice + "\n"
                + getAllAdditionalToppings() + getTotalPrice();

    }



    public String getName() {
        return name;
    }

    public String getBreadRoll() {
        return breadRoll;
    }

    public String getMeat() {
        return meat;
    }

    public double getBasePrice() {
        return basePrice;
    }

    public int getMaxAdditionalToppings() {
        return maxAdditionalToppings;
    }
}
