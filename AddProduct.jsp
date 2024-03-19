<head>
    <title>Add Product Page</title>
    <link rel="stylesheet" href="Stylesheets/addProduct_style.css">

</head>
<body>
    <%@include file="header.jsp" %>
    <div class="product_add">
    <form action="" method="">
        <div class="field_one_one">
        <span id="name">Product name :</span>
        <input id="text_field_one" type="text" placeholder="Enter Product name" ><br>
        </div>
        
        <div class="field_one_one">
            <span id="name">Product Description : </span>
        <textarea  type="text" placeholder="Enter the  description of your products" rows="5" cols="60" ></textarea><br>
        </div>
        
        <div class="field_one_one">  
            <span id="name">Select Image :</span>
        <input  type="file"  accept="image/png, image/gif, image/jpeg" /><br>
        </div>
        
        <div class="field_one_one">
            <span id="name">Dimensions :</span>
        <input id="text_field_three" type="text" placeholder="XX x YY x ZZ"  ><br>
        <p><br>Please Enter dimensions in the format provided :[XX x YY x ZZ]</p>
        </div>
        
        <div  class="field_one_one">
            <span id="name"> Weight :</span>
         <input id="text_field_four" type="text" placeholder="in KG" ><br>
        </div>
        
        <div  class="field_one_one">
            <span id="name">Price :</span>
            <input id="text_field_five" type="text" placeholder="INR" ><br><br>
        <span id="name">Available stock :</span>
        <input id="text_field_eight" type="text" placeholder="quantity" ><br>
        </div>
        
        <div class="field_one_one">
            <span id="name">Age Group :</span>
         <input id="text_field_six" type="text" placeholder="quantity" ><br>
        </div>
        
        <div  class="field_one_one">
            <span id="name">Country of Origin :</span>
         <input id="text_field_seven" type="text" placeholder="quantity" ><br>
        </div>
        
         <input id="field_one_two" type="submit" value="Upload">
           
    </form>
    </div>
</body>