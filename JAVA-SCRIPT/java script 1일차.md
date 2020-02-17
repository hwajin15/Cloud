#### 1. JAVA SCRIPT

자바스크립트 -웹브라우저에서 실행 

node js - 서버와 클라이언트 두개다 가능하게함

ECMAScript기반

<script></script> 에 자바스크립트 코드 입력
<img/> 

var name = " 정서화 " ; // 문자값을 name 라는 변수에 넣어 준다 

() - 함수(method, function) 또는 사칙연산 

함수는 만들거나 호출하는 경우 

\ :특수문자 \n :enter  \t :수평탭

+:1. 덧셈/ 2. 문자열 결합 

오더로딩 - 함수나 기호를 재정의 하는것 (여러개의 의미를 가질 수 있음)

#### 2. 기본문법

- 주석

 <!----->  , // var name = "정서화"; /* ~*/

   -alter();  alert('Hello "' + name+ '"');

   -confirm();   

   -prompt();  var userVal =prompt("값을 입력하세요.");

- 비교연산자 

​      - === 값과 데이터 타입이 같음

​       - !== 값과 데이터 타입이 다름 

- 논리연산자 

​     - ! -논리 부정  

​    - && 논리곱  if(isWinner && toeic>900)  / & 

​     -|| 논리합  if(isWinner || toeic>900)   / |

- 변수 선언

​     -var 다시 변수를 선언해도 문제가 없음  

​      -let block 안에서  다시 변수를 선언하면 오류 발생 

​      -const 상수값(변하지 않는 값) 

- 복합 대입연산자 

​        window.onload - 최초의 이벤트 웹브라우저에서 실행 

​       document.body.innerHTML =list;  내장객체

- 자료형 검사 

   typeof   ex> console.log(typeof a);



1.팀별 ( html , form (input))

2.구구단 작성 (4x2)

3.이력서 폼 

-  table 만들기 (colspan ,rowspan) 

<tr>

​        <th rowspan="4">사진</th>

​        <th colspan="4" >이력서</th>

​      </tr>

- form태그 /  select 태그(option)

```html
<form>
    이름<input type="text" placeholder="이름을 입력하세요">
    </form>

<select> 
    <option>10대</option>
    <option>20대</option>
</select>
```
- POST  -> 사용자가 입력한 내용을 서버에 저장 가입이나 저장에 사용 (게시판 )

  request body 

- GET -> 사용자가 서버에 resource를 요청

​     웹브라우저 -> URL 요청  /입력했던 데이터값이 넘어감 

​     querystrintg 추가적인 정보를 넘길수 있음 - 중요한 데이터나 긴 데이터에는 적합하지 않음 

​	https://www.google.com/search?q=jquery  //GET 방식으로 요청 



- 자료형 변환하기

​     다른자료형을 숫자로 - Number()  ex>  let converDate = Number(userDate);

​	다른 자료형을 문자열 -String()

​    String + number  ->String  10+100 = 10100 결과

 	NaN : 숫자가 아닌 값 입력시 



#### 3. IF조건문

- 삼항 연산자 ()?():() //디버깅에 어려움이 있음

- index0f  문자열이 포함되어 있는지 확인 (ex 안녕하세요 - 안녕 0번째 /하세요 2번째 /정서화 - 해당 없기 때문에 -1)



####