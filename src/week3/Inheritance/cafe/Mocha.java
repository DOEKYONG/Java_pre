package week3.Inheritance.cafe;

public class Mocha extends AddSomething{
    public Mocha(Latte latte) {
        menu = latte.menu+makeMocha();
    }

}
