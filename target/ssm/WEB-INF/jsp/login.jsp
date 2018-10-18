<%--&lt;%&ndash;--%>
  <%--Created by IntelliJ IDEA.--%>
  <%--User: zhangxinfei--%>
  <%--Date: 2018/9/16--%>
  <%--Time: 18:09--%>
  <%--To change this template use File | Settings | File Templates.--%>
<%--&ndash;%&gt;--%>
<%--<!DOCTYPE html>--%>
<%--<html lang="en">--%>
<%--<head>--%>
    <%--<meta charset="UTF-8">--%>
    <%--<meta name="viewport" content="width=device-width, initial-scale=1.0">--%>
    <%--<script src="http://www.jq22.com/jquery/jquery-2.1.1.js"></script>--%>
    <%--<meta http-equiv="X-UA-Compatible" content="ie=edge">--%>
    <%--<title>Document</title>--%>
    <%--<!-- encrypt加密 -->--%>
    <%--<script src="js/core.js"></script>--%>
    <%--<script src="js/cipher-core.js"></script>--%>
    <%--<script src="js/tripledes.js"></script>--%>
    <%--<script src="js/mode-ecb.js"></script>--%>
    <%--<script src="http://passport.cnblogs.com/scripts/jsencrypt.min.js"></script>--%>
<%--</head>--%>
<%--<body>--%>
<%--<div>--%>
    <%--<input id="user_studentsId" type="text"/>--%>
    <%--<input id="password" type="text"/>--%>
    <%--<button id="bt1" >提交</button>--%>
    <%--<script>--%>
        <%--$("#bt1").click(function(){--%>
            <%--var a ={--%>
                <%--user_studentId : document.getElementById('user_studentsId').value,--%>
                <%--password : document.getElementById('password').value--%>
            <%--}--%>
            <%--var user=JSON.stringify(a);--%>
            <%--var encrypt = new JSEncrypt();--%>
            <%--encrypt.setPublicKey('MIGfMA0GCSqGSIb3DQEBAQUAA4GNADCBiQKBgQDA4TwAM18tp8IT8T7gGbDHSz6qv4xwj0TwezC1lVeq6O7VKelluVXk5lPn2JHP0rXn5fDvv2lBBRxf6BMhYPJmERH/HTm652LIThXcbvy5bSrmwQYtXqLUsJXyEn4Lc8HXxMFKJ9FHn3GwB5r72FVCMUfbB3Sc7kxvLXejx5AVMwIDAQAB');--%>
            <%--var data = encrypt.encrypt(user);--%>
            <%--$.ajax( {--%>
                <%--type: 'post',--%>
                <%--url : "http://localhost:8080/User/selectByKeyAndPassword",--%>
                <%--data: {--%>
                    <%--'user':data--%>
                <%--},--%>
                <%--contentType: "application/json; charset=utf-8",--%>
                <%--jsonp: "callback",//一般默认为:callback--%>
                <%--jsonpCallback:"getUser",//自定义的jsonp回调函数名称，默认为jQuery自动生成的随机函数名，也可以写"?"，jQuery会自动为你处理数据--%>
                <%--crossDomain: true,--%>
                <%--success: function(data) {--%>
                    <%--if(data && data.code == '10'){--%>
                        <%--console.log(data.data.token);--%>
                    <%--}--%>
                <%--}--%>
            <%--});--%>
        <%--});--%>
    <%--</script>--%>
<%--</div>--%>
<%--</body>--%>
<%--</html>--%>
