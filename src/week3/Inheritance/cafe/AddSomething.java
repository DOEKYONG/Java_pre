package week3.Inheritance.cafe;

public class AddSomething extends Coffee {


    public String makeLatte(){
        extra = "Adding Milk ";
        return extra;
    }

    public String makeMocha(){
        extra ="Adding Mocha Syrup ";
        return extra;
    }

    public String makeWhippedCream(){
        extra = "Adding WhippedCreamed";
        return extra;
    }

    @Override
    public void brewing(){
        System.out.println(menu);
    }
}
