package week3.Inheritance.cafe;

public class AddSomething extends Coffee {


    public String makeLatte(){
        extra = "Adding Milk";
        return extra;
    }

    public String makeMocha(){
        extra ="Adding mocha Syrup";
        return extra;
    }

    public String makeWhippedCream(){
        extra = "Adding WhippedCreamed";
        return extra;
    }
}
