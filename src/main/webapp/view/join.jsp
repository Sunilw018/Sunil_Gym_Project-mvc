<html>
<head>
<meta charset="UTF-8">
<meta name="viewport" content="width=device-width, initial-scale=1.0">
<title>Join Page</title>
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
<br><br>

<form action="/join" method="post">

&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<h1><b> Joining From </b></h1>
<br>
&nbsp;&nbsp;<label for="fname">Enter Name :- </label>
&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
<input  type="text" id="fname" name="name" placeholder="Enter Name" required>
<br><br>

  &nbsp;&nbsp;<label for="phone">Enter Mobile No.:</label>
  <input type="tel" id="phone" name="mob" placeholder="123-45-678" pattern="[0-9]{3}-[0-9]{2}-[0-9]{3}" required>
 
<br><br>

&nbsp;&nbsp;<label for="emailid">Enter Email-Id :- </label> 
&nbsp;
<input type="email" id="emailid" name="email" placeholder="xyz@gmail.com" required>
<br><br>

&nbsp;&nbsp;<label for="bdate">Enter Joining Date :- </label>
&nbsp;&nbsp;
<input type="date" id="bdate" name="date">
<br><br>

&nbsp;&nbsp;<label for="gen"> Gender :- </label>
&nbsp;&nbsp;
<input type="Radio" id="gen" name="gender" value="male"> Male.
<input type="Radio" id="gen1" name="gender" value="female"> female.
<br><br>

&nbsp;&nbsp;<label for="comment">Gym Location :- </label>
<textarea id="comment" name="location" rows=3 cols=15>Enter Comments </textarea>
<br><br>

&nbsp;&nbsp;<label for="Batch">Gym Batch :- </label>
<select id="Batch" name="batch"multiple>
<option value="Morning">Morning</option>
<option value="Afternoon">Afternoon</option>
<option value="Evening">Evening</option>
</select>
<br><br><br><br>

&nbsp;&nbsp;<button class="custom-button" type="submit">Submit</button>
&nbsp;&nbsp;<button class="custom-button" type="reset">Reset</button>


</form>
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