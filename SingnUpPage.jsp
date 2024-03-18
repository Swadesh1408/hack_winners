<head>
    <title>
        SignUp Page
    </title>
     <link rel="stylesheet" href="Stylesheets/SignUp_style.css">
</head>
<body>
   <%@include file="index_header.jsp" %>
   <div class="login_side">Already User? 
       <input id="button_login" type="button" value="Login" action=""></div>
   <div class="box_one">
       <div class="text">
       <h3 id="text_one">Welcome to SELLLADA</h3>
       <p id="text_two">create a account to start selling
           <br><br><br>
       </p>
       </div>
       <form action="" method="">
           <input id="field_one" type="text" placeholder="Enter your mobile number" name="mobileNo"><br>
           <input id="field_one" type="text" placeholder="Enter Seller Name" name="sellerName"><br>
           <input id="field_one" type="text" placeholder="Enter Company Name" name="compNameS"><br>
           <input id="field_one" type="text" placeholder="Enter Email" name=compEmail""><br>
           <input id="field_one" type="password" placeholder="Set Password" name="password"><br><br>
          <div class="text_one">
               <h4>
                   Make your Password  strong by adding :</h4><br>
          </div>
                <div class="text_one">
           <p>
               <br>
               Minimum * characters (letters & numbers)<br>
               Minimum 1 special character ( @ # $ % ^ & * )<br>
               Minimum 1 capital letter ( A-Z )<br>
               `         Minimum 1 number (10-9)<br><br>
           </p>
           </div>
           <input id="field_two" type="button" value="Sign Up" action=""/>
       </form>
   </div>
</body>