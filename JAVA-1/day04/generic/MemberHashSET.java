package generic;

import set.Member;

import java.util.HashSet;
import java.util.Iterator;

public class MemberHashSET {
    private HashSet<Member> hashSet;
    public MemberHashSET(){
        hashSet = new HashSet<Member>();
    }
    public void addMember(Member member){
        hashSet.add(member);
    }
    public boolean removeMember(int memberId){
        Iterator<Member> ir = hashSet.iterator();
        while (ir.hasNext()){
            Member member = ir.next();
            if (member.getMemberId() == memberId){
                hashSet.remove(member);
                return true;
            }
        }
        System.out.println(memberId +"번호가 존재하지 않습니다");
        return false;
    }
    public void showMemberInfo(){
        for (Member member: hashSet){
            System.out.println(member);
        }

    }
}
