package pizzafm.store;

import pizzafm.pizza.Pizza;

//IMPLEMENT ME
public abstract class PizzaStore {
    protected abstract Pizza createPizza(String type);

    public final Pizza orderPizza(String type) {
        Pizza pizza = createPizza(type);
        pizza.prepare();
        pizza.bake();
        pizza.cut();
        pizza.box();
        return pizza;
    }
}
