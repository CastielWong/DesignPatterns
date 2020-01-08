package Factory.abstract_factory;

import Factory.abstract_factory.PizzaIngredientFactory;
import Factory.abstract_factory.model.ingrdient.MozzarellaCheese;
import Factory.abstract_factory.model.ingrdient.PlumTomatoSauce;
import Factory.abstract_factory.model.ingrdient.SlicedPepperoni;
import Factory.abstract_factory.model.ingrdient.ThickCrustDough;
import Factory.abstract_factory.model.ingrdient.type.*;
import Factory.abstract_factory.model.ingrdient.vegetable.BlackOlives;
import Factory.abstract_factory.model.ingrdient.vegetable.Eggplant;
import Factory.abstract_factory.model.ingrdient.vegetable.Spinach;

public class ChicagoPizzaIngredientFactory implements PizzaIngredientFactory {

	@Override
	public Dough createDough() {
		return new ThickCrustDough();
	}

	@Override
	public Sauce createSauce() {
		return new PlumTomatoSauce();
	}

	@Override
	public Cheese createCheese() {
		return new MozzarellaCheese();
	}

	@Override
	public Pepperoni createPepperoni() {
		return new SlicedPepperoni();
	}

	@Override
	public Veggies[] createVeggies() {
		Veggies veggies[] = {
				new BlackOlives(),
				new Spinach(),
				new Eggplant()
		};

		return veggies;
	}


}
