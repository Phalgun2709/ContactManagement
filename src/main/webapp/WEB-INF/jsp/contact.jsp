<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/4.4.1/css/bootstrap.min.css">  
<style>  
html {   
    height: 100%;   
}  
body {   
    height: 100%;   
}  
.global-container {  
    height: 100%;  
    display: flex;  
    align-items: center;  
    justify-content: center;  
    background-color: #f5f5f5;  
}  
form {  
    padding-top: 10px;  
    font-size: 14px;  
    margin-top: 30px;  
}  
.card-title {   
font-weight: 300;  
 }  
.btn {  
    font-size: 14px;  
    margin-top: 20px;  
}  
.login-form {   
    width: 330px;  
    margin: 20px;  
}  
.sign-up {  
    text-align: center;  
    padding: 20px 0 0;  
}  
.alert {  
    margin-bottom: -30px;  
    font-size: 13px;  
    margin-top: 20px;  
}  
</style>  
</head>
<body>
<div class="pt-5">  
  <div class="global-container">  
    <div class="card login-form">  
    <div class="card-body">  
        <h3 class="card-title text-center"> Contact Details </h3>  
        <div class="card-text">  
            <form  action="addcontact.jsp" method="post">  
                <div class="form-group">  
                    <label for="exampleInputUsername"> Contact Name </label>  
                    <input type="text" class="form-control form-control-sm" id="cname" name="cname">  
                </div>  
                <div class="form-group">  
                    <label for="exampleInputPassword1">Phone number </label>  
                  
                    <input type="text" class="form-control form-control-sm" id="pnumber" name="pnumber">  
                </div>  
                <button type="submit" class="btn btn-primary btn-block"> Save</button>  
                  
              
            </form>  
             
                
        </div>  
    </div>  
</div>  
</div>  
</body>
</html>