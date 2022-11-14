package week3.Inheritance.cafe;

abstract public class Coffee {

    protected String menu;
    protected String extra;

    public Coffee() {}

    public void brewing(){
        System.out.println(menu);
    }

}
