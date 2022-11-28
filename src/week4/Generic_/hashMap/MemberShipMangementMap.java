package week4.Generic_.hashMap;

import week4.Generic_.membership.Member;

import java.util.HashMap;
import java.util.Map;

public class MemberShipMangementMap {

    private Map<Integer, Member> map = new HashMap<>();

    public Map<Integer, Member> getMap() {
        return map;
    }

    public void addMemberShip(int inNum, String inName, String inGrade) {
        Member member = new Member(inNum,inName,inGrade);
            map.put(inNum,member);

    }

    public void showAllMember() {
        System.out.println("===================================");
        for(Member temp : map.values()) {
            System.out.println(temp.getName()+" 님의 아이디는 " + temp.getNumber() + "이고 " +temp.getGrade());
        }
        System.out.println("===================================");
    }

    public boolean removeMember(int inNum) {
        if(map.containsKey(inNum)){
            map.remove(inNum);
        } else {
            System.out.println(inNum+"은 없는아이디 ");
        }
        return true;
    }


}
