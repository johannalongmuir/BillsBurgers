import java.util.concurrent.atomic.AtomicInteger;

public class Order {

    private int orderNumber;
    private Hamburger hamburger;

    public Order() {
        BillsBurgerShop.counter++;
        this.orderNumber = BillsBurgerShop.counter;
        //this.hamburger = new Hamburger()
    }

    public int getOrderNumber() {
        return orderNumber;
    }


    public String orderSummary(){
        return "You've Ordered: \n" +
                "The " + hamburger.getName() + " with " + hamburger.getMeat() + " on " + hamburger.getBreadRoll() + "\nBase Price: " + hamburger.getBasePrice() + "\n"
                + hamburger.getAllAdditionalToppings() + hamburger.getTotalPrice();

    }





}
