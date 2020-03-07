package day05;

public class IdFormat {
    public  String userId;

    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) throws IdException {
        if (userId == null){
            throw new IdException("아이디는 null 일수 없습니다.");
        }else if (userId.length() <8 ||  userId.length() >20 ){
            throw  new IdException("아이디의 글자수를 맞춰주세요");
        }
        this.userId = userId;
    }

    public static void main(String[] args) {
        IdFormat idFormat = new IdFormat();
        String myid =null;
        try {
            idFormat.setUserId(myid);
        } catch (IdException e) {
            System.out.println(e);
        }
        myid ="!23456";
        try{
            idFormat.setUserId(myid);
        } catch (IdException e) {
            System.out.println(e);
        }
    }
}
