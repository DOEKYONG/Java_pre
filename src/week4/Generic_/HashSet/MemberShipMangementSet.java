package week4.Generic_.HashSet;

import week4.Generic_.membership.Member;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class MemberShipMangementSet {
    private Set<Member> memberSet = new HashSet<>();

    public MemberShipMangementSet() {
    }


    public void addMemberShip(int inNum, String inName, String inGrade) {
        Member member = new Member(inNum,inName,inGrade);

        if(!memberSet.add(member))System.out.println(member.getNumber()+"은 이미있는 아이디");
        memberSet.add(member);
    }


    public void showAllMember() {
        for(Member temp : memberSet) {
            System.out.println(temp.getName()+" 님의 아이디는 " + temp.getNumber() + "이고 " +temp.getGrade());
        }
    }

    public boolean removeMember(int num) {
        Member member = new Member(num);
        memberSet.remove(member);
        if(!memberSet.remove(member))System.out.println(num+"은 없는 아이디 입니다.");
        return true;
    }


}
