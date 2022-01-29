package oop.interfaces;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

/**
 * @author Michael Wagih
 */

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
public class Car implements Vehicle{
    private String brand;

    @Override
    public String getBrand() {
        return brand;
    }

    @Override
    public String speedUp() {
        return "The " +brand+" car is speeding up.";
    }

    @Override
    public String slowDown() {
        return "The "+brand+"car is slowing down.";
    }
}
