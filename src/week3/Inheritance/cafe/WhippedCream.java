package week3.Inheritance.cafe;

public class WhippedCream extends AddSomething{
    public WhippedCream(Mocha mocha) {
        menu = mocha.menu+makeWhippedCream();
    }


}
