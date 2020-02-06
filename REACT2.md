#### - day 02 react

rpm /rpx 

```visual basic
npx create-react-app contact-app

cd contact-app

npm starat
```

coverage - 실행여부를 퍼센트



console.log(this.state); //{contacts:[]}

console.log(this.state.contacts); // [...]

console.log(contacts) //[...]





 const data =this.props; //contact-> data.contact

const {data} =this.props; //contact-> contact



키값사용  - 데이터 수정이나 삭제에 쉬움 



const info =this.props.info;

​    console.log(info.id);

​    console.log(info.name);

​    console.log(info.phone);

------같은 방법---

​    const {name ,phone, id} =this.props.info;

​    console.log(id);

​    console.log(name);

​    console.log(phone);



 const list =data.map(value =>

​    (

​      <PhoneItem key ={value.id}

​        info={value}/>



​    )

​    );

-----같은 방식 --- 햣

​    // for(let i=0; i<data.length; i++){

​    //   console.log(data[i]);

​    // }



 myarray.map(v =>console.log('<div>' + v + '<div>'));
<div>1<div>
<div>2<div>
<div>3<div>
<div>4<div>
<div>5<div>





- 이벤트 만들기

1. 이벤트 주체 결정 
2. 이벤트 종류 결정
3. 이벤트 핸들러 구현
4. 이벤트 주체 <-> 핸들러 연결

onRemove={onRemove} //앞쪽은 마음대로 지정해도 무방



- 수정버튼 추가
- 수정버튼 클릭시 해당하는 item 의 name ,phone값을 콘솔에 출력 

 const modifiedarray3 =myTag.map(v => v.id === 1 ? ({...v, text: React}) : v);