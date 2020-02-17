MVC (MODEL / VIEW / CONTROLLER)

model - 비즈니스 로직 (기능 ) 렌더링을위해 view 로 데이터 전달

view 에서 모델데이터의 업데이트 발생

fulx  데이터는 단방향으로 전달 / 새로운 데이터가 발생하면 처음부터 흐름이 다시시작 

store- 변경사항이 남아있음  / 어플리케이션 내의 모든 상태와 관련 로직을 가짐

action -> dispatcher 의 과정으로 전달

view화면에 출력

redux 

1

2 flux action 과 state 분리



---

1. reducer 

   ​	biz logic (데이터 처리, 상태처리)

      root reducer 에 reducer 를 추가

   ​	src/redusers/reducer-book.js

   ​	src/redusers/reducer-active-book.js

2. src/index.js 

   ​	reducer 가지고 store 생성

   ​	app.js 실행시  store 지정

3.  사용자 요청 작업

   ​	src/actions/index.js 등록 -> selectBook

   ​	action -> type(BOOK_SELECTED) , payload 

4. 사용자 view 

   ​	src/containers/book-list.js

   ​	src/containers/book-detail .js

   5. component 하고 reducer (store) 하고연결

      mapStateToProps(state)

      mapDipathchToProps(dispatch)

      connet ()함수 사용 

   