```
int [] sum = {100,200,300,400};
sum = new int[]{}; //가변 데이터 사용하기

int add (int...values){
int result =0;
for(int value :values)
result += value;
}
```

메소드 오버로딩 

 같은 이름의 메소드를 여러개 생성

modifier -> private < x <protected <public

​           같은 클래스 / 같은 클래스 +패키지 / 같은 클래스 +패키지  + 다른 패키지(상속) / 다른 패키지여도 가능  



Studnet -> object(method) -> toString -> 다시 정의 (overriding )





