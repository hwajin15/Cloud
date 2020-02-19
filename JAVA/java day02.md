heap /stack

stack -필요한 데이터 

``` 
System.out.println(name.equals(newName)); --> 내용이 같은 경우
```

NullPointerException -> null인 데이터 사용 

다차원 배열  int[][]

```
int[][] scores =new int[2][3];
System.out.println(scores[0].length);
System.out.println(scores[1].length);
```

 

array.sort

Array.sort(sum, c)

Math.random()

for(int i=0; i<10; i++){

1.개별 학생의 성적과 평균을 구하고 성적으로 정렬(내림차순)

2.로또 1-45 사이의 6개의 번호를 입력하여 중복되지x /사용자가 입력한 번호를 비교하여 

몇개의 숫자가 일치하는지 출력

double vaule =Math.random();

System.out.println()

} 

Random r =new Random();

int intVal = r.nextInt(45);

System.out.println(intVal);



```
package com.example.day02;

public class Member {
    //nested class
    class VipMember{
        
    }
    //filed
    int age =10;
    String name ="java";
    //method 
    void 메소드이름1 (){
        
    }
    int 메소드이름2 (){
        return 1;
    }
    //constructor method
    
}
```



```
package com.example.day02;

public class Member {
    String name;
    int age;
    Project finalProject;
    Project semiProject;
    
    void displayInfo(){
        System.out.println(name +"/" + age);
        System.out.println(String.format("이름은 %s 이고, 나이는 %s 입니다",name,age));
    }

}
class Project{
    String name;
    String period;
    void budget(){
        
    }
    
}


집합관계

```