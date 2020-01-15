import lombok.Getter;

@Getter
public class DeluxeHamburger extends Hamburger{
    private String chips;
    private String drink;
    private static String test = "yeaahhh";


    public DeluxeHamburger(String meat, String drink) {
        super("Deluxe Hamburger!", "White", meat, 10.00, 0);
        this.chips = "Chips";
        this.drink = drink;
    }

    @Override
    public void addAdditionalTopping(String name) {
        System.out.println("No additional toppings with the Deluxe Burger allowed");
    }
}
