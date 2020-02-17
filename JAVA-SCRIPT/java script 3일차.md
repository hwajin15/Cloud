#### 6.객체

객체 - 실체화 시킬수 있는 

메소드 - 동작을 의미 (함수와 유사)

자료형- 불필요한 데이터 낭비를 막기 위함 

연관배열- key값 : value (중복을 허용x ) 자바에선 map

json- 데이터를 나타내기에 최적화된 포맷  /xml  

- this  자기자신의 함수를 호출 하고자 할때 

 let school ={

​      name:'multicompus',

​      capacity:[30,30,30],

​      grade:'3',

​      event: function(month, eventName){

​        console.log(this.name+ ","+ month + "달에 " + eventName +"이벤트가 있습니다");

​      }

​    };

- with 키워드 

  with(student){

​      sum =kor+ math + eng;

​      avg = sum/3;

​    }

​    console.log(sum +"/"+ avg);

- map

- reduce() 메소드

   하나로 합친값을 더해 저장

  