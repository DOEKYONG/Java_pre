package week3.Inheritance.cafe;

public class Latte extends AddSomething{
    public Latte(Coffee coffe) {
        menu = coffe.menu+" "+makeLatte();
    }

}
