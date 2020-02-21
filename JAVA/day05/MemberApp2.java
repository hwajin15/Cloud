package com.example.day05;

public class MemberApp2 {
    public static void main(String[] args) {
     //5명의 사용자 추가 member -2 vip-2 vvvip-2
        GeneralMember member1 =new GeneralMember("user1","A");
        GeneralMember member2 =new GeneralMember("user2","B");
        VipMember vipMember1 =new VipMember("user3","S1");
        VipMember vipMember2 =new VipMember("user4","S2");
        VVipmember vVipmember = new VVipmember("vvip1");

        //array 로  관리
        IMemberFunc[] members =new IMemberFunc[5];
        members[0] =member1;
        members[1] =member2;
        members[2] =vipMember1;
        members[3] =vipMember2;
        members[4] =vVipmember;

        for(IMemberFunc member : members){
//            System.out.println(member.id +"/" + member.joinDate);
            member.setPoint(1000);
            member.display();
        }
        Object [] obj = new Object[3];
        obj[0]= new GeneralMember("user3 ","user3");
        obj[1]= new VipMember("user4 ","s3");
        obj[2]= new VVipmember("vvip3");

        for(Object o:obj){
            IMemberFunc member = null;
            if( o instanceof GeneralMember){
                member = (GeneralMember) o;
            }else if(o instanceof VipMember){
                member = (VipMember) o;
            }else if(o instanceof  VVipmember){
                member = (VVipmember) o;
            }
           
            member.setPoint(200);
            member.display();
        }

    }
}
