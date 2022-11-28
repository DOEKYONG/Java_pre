package week4.Generic_.membership;

import week4.Generic_.HashSet.MemberShipMangementSet;

import java.util.Comparator;

public  class Member implements Comparable<Member>, Comparator<Member> {
    protected int number;
    protected String name;
    protected String grade;

    public Member(int number, String name, String grade) {
        this.number = number;
        this.name = name;
        this.grade = grade;
    }

    public Member() {
    }

    public Member(int number) {
        this.number = number;
    }


    public int getNumber() {
        return number;
    }

    public String getName() {
        return name;
    }

    public String getGrade() {
        return grade;
    }

    @Override
    public int hashCode() {
        return number;
    }

    @Override
    public int compare(Member o1, Member o2) {
      //  return (o1.getName().compareTo(o2.getName())*-1);
        return o1.getName().compareTo(o2.getName());
    }

    @Override
    public boolean equals(Object obj) {
            return ((Member) obj).number == number;
    }

    @Override
    public int compareTo(Member o) {
        return (this.number- o.number) *-1;
    }
}
