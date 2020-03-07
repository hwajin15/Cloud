package generic;

import java.util.ArrayList;

class MyStack {
     private ArrayList<String> arrayList = new ArrayList<String>();
     public void push(String data){
         arrayList.add(data);

     }
     public String pop(){
         int len = arrayList.size();
         if (len == 0){
             System.out.println("스택이 비어있습니다.");
             return null;
         }
         return arrayList.remove(len-1);
     }
}
class StackTest{
    public static void main(String[] args) {
        MyStack stack = new MyStack();
        stack.push("a");
        stack.push("b");
        stack.push("c");

        System.out.println(stack.pop());
        System.out.println(stack.pop());
        System.out.println(stack.pop());
        System.out.println(stack.pop());
    }
}