<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<!DOCTYPE html>
<html>
<head>
    <meta charset="utf-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge,chrome=1">
    <title>login</title>
    <meta name="description" content="">
    <meta name="keywords" content="">
    <link href="" rel="stylesheet">
</head>
<body>

<div class="contariner login">

    <form role="form" class="form" method="POST" action="login">

        <div class="input"> <input type="text" name="username" autocomplete="off" placeholder="username"></div>
        <div class="input"> <input type="password" name="password" autocomplete="off" placeholder="password"></div>

        <div class="button" type="submit"><button>登陆</button></div>

    </form>

</div>

<style type="text/css">
    *{
        margin: 0px;
        padding: 0px;

    }

    body,html{
        width: 100%;
        height: 100%;
    }
    .login{
        width: 100%;
        height: 100%;
        background: url(images/login.jpg);
        background-size: cover;
        position: relative;

    }

    .form{
        width: 400px;
        margin: 0 auto;
        position: absolute;
        top:50%;
        left: 50%;
        margin-top: -100px;
        margin-left: -200px;
        text-align: center;
    }

    input,button{
        width: 400px;
        height: 40px;
        background: none;
        outline: none;
        margin-top: 10px;
        color:#fbf8fe;
        text-align: center;
        font-size: 22px;
        border: 1px solid #f0ddf8;
        background-color: rgba(193,149,228,0.3);
        cursor: pointer;

    }

    ::-webkit-input-placeholder { /* WebKit browsers */
        color: #fbf8fe;
        font-size: 22px;
    }

    ::-moz-placeholder { /* Mozilla Firefox 19+ */
        color: #fbf8fe;
        font-size: 22px;
    }

    :-ms-input-placeholder { /* Internet Explorer 10+ */
        color: #fbf8fe;
        font-size: 22px;
    }

    input:-webkit-autofill,
    input:-webkit-autofill:hover,
    input:-webkit-autofill:focus {
        box-shadow:0 0 0 60px #eee inset;
        -webkit-text-fill-color: #878787;
    }

</style>

</body>
</html>
