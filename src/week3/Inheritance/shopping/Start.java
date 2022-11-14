package week3.Inheritance.shopping;

public class Start {
    public static void main(String[] args) {
        Member james = new GradeRED("james",10000,2);
        Member Tomas = new GradeRED("Tomas",30000,2);
        Member Edward = new GradePLATINUM("Edward",10000,2);
        Member Percy = new GradePLATINUM("Percy",30000,2);
        Member Elizabet = new GradeDIAMOND("Elizabet",30000,2);
        james.print();
        Tomas.print();
        Edward.print();
        Percy.print();
        Elizabet.print();
    }
}
