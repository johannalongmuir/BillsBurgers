// TODO add Lombok - getters.

public class AdditionalTopping {
    private String name;
    private double cost;

    public AdditionalTopping(String name) {
        this.name = name;
        if (name.equalsIgnoreCase("Lettuce")){
            this.cost = 0.50;
        } else if (name.equalsIgnoreCase("Tomato")){
            this.cost = 0.25;
        } else if (name.equalsIgnoreCase("Cheese")){
            this.cost = 0.70;
        } else {
            this.cost = 1.00;
        }
    }

    public String getName() {
        return name;
    }

    public double getCost() {
        return cost;
    }
}
