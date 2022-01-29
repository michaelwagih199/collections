package oop.interfaces;

/**
 * @author Michael Wagih
 */


public class III {

    public static void main(String[] args) {
       Vehicle car = new Car("BMW");
       Vehicle marcedis = new Car("Mercedes");
       System.out.println(marcedis.turnAlarmOn("Mercedes"));
       System.out.println(Vehicle.getHorsePower(2500, 480));
    }


}