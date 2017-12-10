    $(document).ready(function (){
       $("li").each(function(index){
       $(this).click(function(){ 
       $("li").removeClass("chosen");
       $("li").eq(index).addClass("chosen");
       });
     });
     });