#### 객체모델

 dom -화면의 html파일을 구조화 

모든객체는 속성과 메소드를 가짐(member 이름 연락처 등급 등 속성을 가짐 / 동작과 행위를 메소드)

- window 객체 

 alert() /prompt()/ confirm()

open()

- **a태그 이용하여 (링크걸기)**

  <li><a href=" https://www.naver.com">NAVER</a> </li>

- **a onclick 태그**

 <li><a onclick="alert('GOOGLE을 클릭하셨습니다.')">GOOGLE</a></li>

- **myopen함수를 만들어 사용**

```

<script> function myopen(url){
     window.open(url);
}<script>

 <li><a onclick="myopen('https://www.naver.com')">NAVER</a> </li>
```

- **버튼을 이용하여 링크 이동**

  ```
   <li><button onclick="myopen('https://www.google.com')">GOOGLE</a></li> 
  ```

- location 객체 

  ?param =10 

- **navigator**
- **onload**

```
 <script>
            window.onload= function(){
                let h1_tag = document.createElement("h1");
            let greeting_text = document.createTextNode("hi there");  h1_tag.appendChild(greeting_text);
            document.body.appendChild(h1_tag);
            }
          
        </script>
```

- **이미지 태그 사용하기**

```html
 //image tag 추가

let myimg = document.createElement("img");
myimg.src ="1.PNG";s
myimg.width="272";
myimg.height="500";
document.body.appendChild(myimg);
```

```
let mytag = "<h1> hello seohwa hi there</h1>";
 document.body.innerHTML ="hello seohwa hi there";

```

- **getElementById()**

```wiki
05542e36559de019967088aaa2ccb705
```

[api.openweathermap.org/data/2.5/weather?q=London](http://samples.openweathermap.org/data/2.5/weather?q=London,uk&appid=b6907d289e10d714a6e88b30761fae22)

#### 제이쿼리

