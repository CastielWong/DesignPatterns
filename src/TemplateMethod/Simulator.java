package TemplateMethod;

import TemplateMethod.model.Coffee;
import TemplateMethod.model.Tea;

public class Simulator {
    public static void main(String[] args) {
        Tea tea = new Tea();
        Coffee coffee = new Coffee();

        System.out.println("\nMaking tea...");
        tea.prepareRecipe();

        System.out.println("\nMaking coffee...");
        coffee.prepareRecipe();
    }
}
