package week2.static_;

public class CarTest {

    public static void main(String[] args) {
        HyundaiFactory factory = HyundaiFactory.getFactory();
        Car myCar = factory.createCar();
        Car yourCar = factory.createCar();
        Car sonata = factory.createCar();
        

        System.out.println("첫번째 차 번호는 " +myCar.showCarNumber());
        System.out.println("두번째 차 번호는 " +yourCar.showCarNumber());
        System.out.println("세번째 차 번호는 " +sonata.showCarNumber());
    }
}

