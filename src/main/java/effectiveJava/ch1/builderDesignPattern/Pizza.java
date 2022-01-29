package effectiveJava.ch1.builderDesignPattern;

import java.util.EnumSet;
import java.util.Objects;
import java.util.Set;

public abstract class Pizza {
    public enum Toping { HAM, MUSHROOM, ONION, PEPPER, SAUSAGE}
    final Set<Toping> toppings;

    abstract static class Builder<T extends  Builder<T>>{
        EnumSet<Toping> toppings = EnumSet.noneOf(Toping.class);
        public T addTopping(Toping topping) {
            toppings.add(Objects.requireNonNull(topping));
            return self();
        }
        abstract Pizza build();
        // Subclasses must override this method to return "this"
        protected abstract T self();
    }
    Pizza(Builder<?> builder) {
        toppings = builder.toppings.clone(); // See Item 50
    }
}
