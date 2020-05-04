package Iterator.model;

public class MenuItem {
    private String name;
    private String description;
    private double price;
    private boolean vegetarian;

    public MenuItem(String name,
                    String description,
                    double price,
                    boolean vegetarian) {
        this.name = name;
        this.description = description;
        this.price = price;
        this.vegetarian = vegetarian;
    }

    public String getName() {
        return name;
    }

    public String getDescription() {
        return description;
    }

    public double getPrice() {
        return price;
    }

    public boolean isVegetarian() {
        return vegetarian;
    }
}
