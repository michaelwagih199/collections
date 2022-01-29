package oop.interfaces;

/**
 * @author Michael Wagih
 */
public interface Vehicle {

    String getBrand();

    String speedUp();

    String slowDown();

    default String turnAlarmOn(Object e) {
        return "Turning the vehicle:\t"+e+"\talarm on.";
    }

    default String turnAlarmOff() {
        return "Turning the vehicle alarm off.";
    }


    static int getHorsePower(int rpm, int torque) {
        return (rpm * torque) / 5252;
    }


}
