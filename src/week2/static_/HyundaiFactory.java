package week2.static_;

public class HyundaiFactory {

    int num = 1000;
    private static HyundaiFactory instance = new HyundaiFactory();
    private HyundaiFactory() {}
    public static HyundaiFactory getFactory(){
        if(instance == null) {
            instance = new HyundaiFactory();
        }
        return instance;
    }
    public Car createCar(){
        Car car = new Car(num);
        num++;
        return car;
    }



}
