



alert("start123 456....");

document.addEventListener('deviceready', onDeviceReady, false);
//通过 cordova.exec (success,failed,serviceName,action,args)函数调用插件
//cordova.exec(success,failed,"Device","getPlatform",[])
function onDeviceReady() {
    //alert(device.getInfo(success,failed));

}




function success(result){
    console.log(result);
}

function failed(){}



$("#button").click(function(){
     alert("start ....");
     var name="name";
     var dream="age";
      //通过 cordova.exec (success,failed,serviceName,action,args)函数调用插件
     cordova.exec(success,failed,"ShowMessage","mydream",[name,dream]);


});

//成功调用插件，获取返回值后的页面处理函数
                 function success(result){
                      if(result!=null)
                          alert("sucess");
                      else
                          alert("no message");
                 }

                 //调用失败后的处理函数
                 function failed(msg){
                      alert("fail.....");
                 }



/*
$("#click").click(function(){
     alert("start ....");
     var name=$("#txt1").val();
     var dream=$("#txt2").val();
      //通过 cordova.exec (success,failed,serviceName,action,args)函数调用插件
     cordova.exec(success,failed,"ShowMessage","mydream",[name,dream]);


});

//成功调用插件，获取返回值后的页面处理函数
                 function success(result){
                      if(result!=null)
                          $("#label").html(result);
                      else
                          alert("no message");
                 }

                 //调用失败后的处理函数
                 function failed(msg){
                      alert("fail.....");
                 }

*/
