package week2.static_;

import java.util.Random;

public class Car {
//    private static int num = 1000;
    private int carNum;

    public Car(int carNum) {
        this.carNum = carNum;
    }

    public int showCarNumber() {
        return carNum;
    }
}
