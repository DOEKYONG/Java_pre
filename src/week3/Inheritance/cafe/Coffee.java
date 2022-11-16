package week3.Inheritance.cafe;

 public abstract class Coffee {

    protected String menu;
    protected String extra;

    public Coffee() {}

//    public void brewing(){
//        System.out.println(menu);
//    }
    public abstract void brewing();
}
