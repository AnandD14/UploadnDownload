
<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Transitional//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd">
<html xmlns="http://www.w3.org/1999/xhtml">
<head>
<title>Education</title>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8" />
<link href="style.css" rel="stylesheet" type="text/css" />
<link href="style2.css" rel="stylesheet" type="text/css" />
</head>
<body>
<div id="header_wrapper">
  <div id="header">
    <div id="site_title">
      <h1><a href="adminLogin.jsp"> <img src="images/bim.png" alt="" /> <span>free css templates</span> </a></h1>
    </div>
     <p>This is developed solely for BIM students to acess note from where they want</p>
  </div>
  <!-- end of header -->
</div>
<!-- end of menu_wrapper -->
<div id="menu_wrapper">
  <div id="menu">
    <ul>
      <li><a href="home.jsp" class="current">Home</a></li>
      
      <li><a href="contact.jsp">Contact</a></li>
    </ul>
  </div>
  <!-- end of menu -->
</div>
<div id="content_wrapper">
<div id="registration-form">
	<div class='fieldset'>
    <legend>ADMIN LOGIN!</legend>
		<form action="UploadnDownload" method="post" >
			<div class='row'>
				<label for='firstname'>Admin Name</label>
				<input type="text" placeholder="admin name" name="adminame" id='firstname' data-required="true" data-error-message="Your First Name is required">
			</div>
			<div class='row'>
				<label for="email">Password</label>
				<input type="password" placeholder="password"  name="password" data-required="true" data-type="email" data-error-message="Your E-mail is required">
			</div>
			
			<input type="submit" value="Login" name="sub">
		</form>
	</div>
</div>

</div>
<div id="footer_wrapper">
  <div id="footer">
    <ul class="footer_menu">
      <li><a href="home.jsp">Home</a></li>
      <li class="last_menu"><a href="contact.jsp">Contact Us</a></li>
    </ul>
   </div>
</div>
</body>
</html>
