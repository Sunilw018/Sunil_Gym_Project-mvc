<html>
<head>
<meta charset="UTF-8">
<meta name="viewport" content="width=device-width, initial-scale=1.0">
<title>Offer Page</title>
 <link rel="stylesheet" href="style.css">
</head>
<body>

<nav>
<h1><span>S</span>u<span>N</span>il<span>G</span>yM</h1>
<ul>
<li><a href="/view/SunilGym.jsp">HOME</a></li>
<li><a href="/view/offer.jsp">OFFER</a></li>
<li><a href="/view/location.jsp">LOCATIONS</a></li>
<li><a href="/view/contact.jsp">CONTACT</a></li>
<button><a href="/view/join.jsp">JOIN NOW</a></button>
</ul>
</nav>



</body>
</html>

<style>
* {
    margin: 0;
    padding: 0;
    box-sizing: border-box;
}

body {
background-image: url("/view/bg1.webp");
background-size: 100%;
color: white;
background-color: black;
}

nav{
display: flex;
justify-content: center;
justify-content: space-around;
margin-top: 30px,
}

nav h1{
font-size: 60px;
}

nav h1 span{
color:red;
}

ul {
display: flex;
list-style: none;
margin-top: 20px;
}

ul button {
width: auto;
height: 34px;
background-color: red;
color: white;
font-size: 21px;
border: none;
border-radius: 3px;
padding: 2px 3px 1.2px 3px;
cursor: pointer;
transition: .2s ease-in-out;
}

ul button:hover {
background-color: black;
color: red;
outline: .2px solid red;
}

ul li a {
margin-inline: 30px;
font-size: 25px;
text-decoration: none;
color: white;
transition: all .1s ease-in;
}

ul li a:hover{
color: red;
border-bottom: 1px solid red;
}

.text{
margin-left: 10%;
margin-top: 160PX;
}

.text h1{
font-size: 100px; 
}

.text h1 span{
color: red;
}

.text p {
font-size: 35px;
margin-top: 35px;
}


.text button{
font-size: 25px;
width: 170px;
height: 44px;
background-color: red;
color: white;
border: none;
margin-top: 50px;
border-radius: 3px;
cursor: pointer;

}

.text button:hover {
background-color: black;
color: red;
outline: .2px solid red;

}


button {
  background-color: red;
  color: white;
  width: auto;
  padding: 10px 20px; /* You can adjust the padding to change the button size */
  border: none;
  cursor: pointer;
}

.custom-button {
 background-color: black;
  color: red;
  width: auto;
  padding: 10px 20px;
  border: none;
  cursor: pointer;
  outline: .2px solid red;
}


</style>