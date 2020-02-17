#### 제이쿼리

- 기본  선택자

$(document).ready(function(){

});  =$(function(){

});

- 전체선택자

   $('*').css('color','red');

- 태그선택자

    $('h1').css('color','orange');

- 아이디 선택자 

   $('#target').css(''color','blue'); 

- 클래스 선택자

   $('.item').css('color','blue');

- 자손 선택자 'div > h1' 바로 밑 h1  /span 은 div>span>h1

   $('body > *').css('color','red');

   $('div > ul').css('color','red');

- 후손 선택자 $('div h1')

   $('div li').css('color','red'); //모든것을 포함 

- setTimeout

 setTimeout(function(){

​      // let selectedItem =$('#myselect').val();

​      // let selectedItem =$('select').val();

​      let selectedItem =$('select > option:selected').val();

​      console.log(selectedItem);

​    },5000)

- setInterval
- setInterval(function(){

​      let selectedItem =$('select > option:selected').val();

​      console.log(selectedItem);

​    },5000)

selector = tag ,# , . 

   $.each(array, function(){});

​    $('선택자').each(function(){});

- forecast 

   $(document).ready(function(){

  ​      

  ​      let ParsedForecast = JSON.parse(forecast);      

  ​      

  ​      $.each(ParsedForecast.list , function(index,item){

  ​      // console.log(item.dt_txt+"/"+item.main.temp+"/"+item.weather[0].icon);

  ​        let image =document.createElement("img");

  ​        image.src ="http://openweathermap.org/img/wn/" + parsedJson.weather[0].icon + ".png" ;

    _img.appendChild(_image); 

  ​        let mydiv = document.createElement("div");

  ​        let html = "<div>";

  ​          html += item.dt_txt;

  ​        html += "</div>;"

  ​        mydiv.innerHTML = html;

  

  ​        $("#main").append(mydiv);

  

  ​      })

     

  ​    });

 <script>
    $(document).ready(function(){
      $.ajax({
          url:"./data.html",
      succes : function(data){},
      error:function(){}
      });
      $.ajax("./data.html",{
      succes : function(data){},
      error:function(){}
      });


    });
     </script>

--ajax 보안상의 문제

"C:\Program Files (x86)\Google\Chrome\Application\chrome.exe" --disable-web-security--user-data-dir=C:\Users\HPE\java

http://api.openweathermap.org/data/2.5/forecast

?q=Seoul&

APPID=05542e36559de019967088aaa2ccb705&

units=metric