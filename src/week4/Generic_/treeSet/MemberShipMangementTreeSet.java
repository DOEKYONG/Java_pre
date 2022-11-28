package week4.Generic_.treeSet;

import week4.Generic_.membership.Member;

import java.util.TreeSet;

public class MemberShipMangementTreeSet {

    private TreeSet<Member> treeSet = new TreeSet<>();
    public void addMemberShip(int inNum, String inName, String inGrade) {
        Member member = new Member(inNum,inName,inGrade);
        if(!treeSet.add(member)) System.out.println("이미 있는 아이디 " + member.getNumber() +"는 추가할 수 없습니다.");
        treeSet.add(member);
    }

    public void showAllMember() {
        System.out.println("===================================");
        for(Member temp : treeSet) {
            System.out.println(temp.getName()+" 님의 아이디는 " + temp.getNumber() + "이고 " +temp.getGrade());
        }
        System.out.println("===================================");
    }

    public boolean removeMember(int inNum) {
        Member member = new Member(inNum);
        if(!treeSet.remove(member))System.out.println(inNum+"은 없는 아이디 입니다.");
        treeSet.remove(member);
        return true;
    }
}
