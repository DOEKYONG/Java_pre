package week2.static_;

import java.util.Random;

public class Car {
//    private static int num = 1000;
    private int carnum;

    public Car(int carnum) {
        this.carnum = carnum;
    }

    public int showCarNumber() {
        return carnum;
    }
}
