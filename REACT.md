#### REACT

SPA (MVC) - 하나의 페이지가 처리 

Ajax -필요할때마다 데이터를 요청하는것이 가능 

jquery 는 자바스크립트의 dom 처리의 어려움을 해결 

angular  -typescript 와 호환 / 사용에 어려움 / 라우터 -페이지를 어디를 보여줄것인지 control   

react -facebook 호환/ 화면을 새로고침x -> 데이터 동적으로 바뀜 / component 기반 (java-script 형식) 

vue - html을 템플릿처럼 사용가능

react - interactive

model (사용자 행동(데이터와 관련)) /controller (처리를 정의 )

mvvm view model -화면에서 데이터 처리 /mvw

- 데이터의 mutation 

이벤트 발생 -> 모델변화->DOM 에 데이터 반영

 node / yarn / webpack / babel (java script 로 호환)

create react app - 템플릿 

map -  순차적으로 실행



[1,2,3].map(n => n**2);

var[a,,b] =[1,2,3];

const x =[1,2,3];

foo([...x]);

<div className ='App-header'>

return 은 () 하나의 element존재해야함

 {

   

   (function(){

​    if(time<12) return(<div>Good morning</div>);

​    if(time<18) return(<div>Good afternoon </div>);

​    if(time<22) return(<div>Good evening</div>);

   })()

   }



import logo from './logo.svg';

import './App.css';

function App() {

 return (

    <div className="App">

   <header className="App-header">

​    hello, seohwa 

   </header>

  </div>

 );

}



classname(외부에 있는 파일을 불러올때 ) / style 

props - 자식컨포너트에서 수정 x

state - 동적인 데이터 처리

68667633011266



 this.setState();



counter.js

 handleIncrease = () =>{

​    this.setState({

​      count: 200

​    });



  }

  handleDecrease = () =>{

​    this.setState({

​      count: -100

​    });



  }



 handleChange = () =>{

​    this.setState({

​      info: {

​        name: 'seohwa'

​      }

​    });