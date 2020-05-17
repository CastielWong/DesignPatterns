package Factory.abstract_factory.model.base;

import Factory.abstract_factory.model.ingrdient.type.Cheese;
import Factory.abstract_factory.model.ingrdient.type.Dough;
import Factory.abstract_factory.model.ingrdient.type.Sauce;
import Factory.abstract_factory.model.ingrdient.type.Veggies;

public abstract class Pizza {
    protected String name;
    protected Dough dough;
    protected Sauce sauce;
    protected Cheese cheese;
    protected Veggies[] veggies;

    public abstract void prepare();

    public void bake() {
        System.out.println("Bake for 25 minutes at 350");
    }

    public void cut() {
        System.out.println("Cutting the pizza into diagonal slices");
    }

    public void box() {
        System.out.println("Place pizza in official PizzaStore box");
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return this.name;
    }

    @Override
    public String toString() {
        StringBuilder result = new StringBuilder();
        result.append(name).append(" with ingredients: \n");
        if (dough != null) {
            result.append("- ");
            result.append(dough);
            result.append("\n");
        }
        if (sauce != null) {
            result.append("- ");
            result.append(sauce);
            result.append("\n");
        }
        if (cheese != null) {
            result.append("- ");
            result.append(cheese);
            result.append("\n");
        }
        if (veggies != null) {
            for (int i = 0; i < veggies.length; i++) {
                result.append("- ");
                result.append(veggies[i]);
                if (i < veggies.length-1) {
                    result.append(", ");
                }
            }
            result.append("\n");
        }
        return result.toString();
    }

}
