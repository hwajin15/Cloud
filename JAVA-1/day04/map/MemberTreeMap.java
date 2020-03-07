package map;

import java.util.HashMap;
import java.util.Iterator;
import java.util.TreeMap;

public class MemberTreeMap {

    private TreeMap<Integer, Member> treeMap;

    public MemberTreeMap() {
        treeMap = new TreeMap<Integer, Member>();

    }

    public void addMember(Member member) {
        treeMap.put(member.getMemberId(), member);
    }

    public boolean removeMember(int memberId) {
        if (treeMap.containsKey(memberId)) {  //키값에 해당되는 값이 있느냐
            treeMap.remove(memberId);
            return true;
        }
        System.out.println("회원 번호가 없습니다.");
        return false;
    }
    public void showMember(){
        Iterator ir = treeMap.keySet().iterator(); // 모든 set key 를 반환
        while (ir.hasNext()){
            int key = (int) ir.next();
            Member member = treeMap.get(key);
            System.out.println(member);
        }
        System.out.println();
    }
}
