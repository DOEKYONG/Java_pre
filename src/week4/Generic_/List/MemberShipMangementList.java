package week4.Generic_.List;

import week4.Generic_.membership.Member;

import java.util.ArrayList;

public class MemberShipMangementList {

    private ArrayList<Member> memberList = new ArrayList<>();




    public MemberShipMangementList() {
    }

    public void showAllMember() {
        for(Member temp : memberList) {
            System.out.println(temp.getName()+" 님의 아이디는 " + temp.getNumber() + "이고 " +temp.getGrade());
        }
    }

    public boolean removeMember(int num) {
        for(int i = 0 ; i<memberList.size(); i++) {
            if(memberList.get(i).getNumber()== num) {
                memberList.remove(i);
            } else {
                System.out.println(num+"에 해당하는 멤버가 없습니다.");
            }
            break;
        }
        return true;
    }


    public void addMemberShip(int inNumber, String inName, String inGrade) {
    memberList.add(new Member(inNumber,inName,inGrade));
    }

}
