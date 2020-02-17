9

json 으로 전달 {"titile": "java",

"catagory": "IT"}   -> 200 번으로 전달되면 success  

const data =this.state.payload.data;

data.id =>65 {} 형식에서

복수형태 [{}]  여러세트가 오게옴   

const data =this.state.payload.data; ->array 

data[1] =65

list[] 

data.list[0].id ->65 

data.blogs[0] -> {...object }

data.blogs[0]  ->65 

switch - 어디로 이동

blogs/:id -> 가변 데이터

promise 동기화 

10

redux ->상태관리

action -명령어 결과값으로 'type'이나 payload 있어야함

container (component)=>connect () 함수를 통해 component와 reducer 연결

reducer -> 작업내용 ( 함수 )

connect(fetchPosts)와 this.props.fetchPosts -> action의 fetchPosts 연결 this.props.fetchPosts();



