<%@page import="com.dao.UploadnDownloaddao"%>
<%@page import="com.model.*"%>
<%@page import="java.util.List"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Transitional//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd">
<html xmlns="http://www.w3.org/1999/xhtml">
<head>
<title>Education</title>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8" />
<link href="style.css" rel="stylesheet" type="text/css" />
<link href="style1.css" rel="stylesheet" type="text/css" />
</head>
<body>
<div id="header_wrapper">
  <div id="header">
    <div id="site_title">
      <h1><a href="adminLogin.jsp"> <img src="images/bim.png" alt="" /> <span>free css templates</span> </a></h1>
    </div>
    <p>This is developed solely for BIM students to access note from where they want</p>
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
<div class="table-title">
<h3>1st SEMESTER</h3>
</div>
   
<table class="table-fill">
<thead>
<tr>
<th class="text-left">SN</th>
<th class="text-left">FILENAME</th>
<th class="text-left">DOWNLOAD</th>
</tr>
</thead>
     <% 
     UploadnDownloaddao upd1=new UploadnDownloaddao();
   List<BIM1stSem> l1=upd1.selectBIM1stSem();
   int i1=0;
    for(BIM1stSem b1:l1){
    %>
<tbody class="table-hover">
<tr>
<td class="text-left"><%=++i1 %> </td>
<td class="text-left"><%= b1.getFilename() %></td>
<td class="text-left"><a href="UploadnDownload?down=download&filename=<%= b1.getFilename() %>" >Download</a></td>
</tr>
<%
    }
%>
</tbody>
</table>
  <div class="table-title">
<h3>2nd SEMESTER</h3>
</div>
   
<table class="table-fill">
<thead>
<tr>
<th class="text-left">SN</th>
<th class="text-left">FILENAME</th>
<th class="text-left">DOWNLOAD</th>
</tr>
</thead>
     <% 
     UploadnDownloaddao upd2=new UploadnDownloaddao();
   List<BIM2ndSem> l2=upd2.selectBIM2ndSem();
   int i2=0;
    for(BIM2ndSem b2:l2){
    %>
<tbody class="table-hover">
<tr>
<td class="text-left"><%=++i2 %> </td>
<td class="text-left"><%= b2.getFilename() %></td>
<td class="text-left"><a href="UploadnDownload?down=download&filename=<%= b2.getFilename() %>" >Download</a></td>
</tr>
<%
    }
%>
</tbody>
</table>
    <div class="table-title">
<h3>3rd SEMESTER</h3>
</div>
   
<table class="table-fill">
<thead>
<tr>
<th class="text-left">SN</th>
<th class="text-left">FILENAME</th>
<th class="text-left">DOWNLOAD</th>
</tr>
</thead>
     <% 
     UploadnDownloaddao upd3=new UploadnDownloaddao();
   List<BIM3rdSem> l3=upd3.selectBIM3rdSem();
   int i3=0;
    for(BIM3rdSem b3:l3){
    %>
<tbody class="table-hover">
<tr>
<td class="text-left"><%=++i3 %> </td>
<td class="text-left"><%= b3.getFilename() %></td>
<td class="text-left"><a href="UploadnDownload?down=download&filename=<%= b3.getFilename() %>" >Download</a></td>
</tr>
<%
    }
%>
</tbody>
</table>
    <div class="table-title">
<h3>4th SEMESTER</h3>
</div>
   
<table class="table-fill">
<thead>
<tr>
<th class="text-left">SN</th>
<th class="text-left">FILENAME</th>
<th class="text-left">DOWNLOAD</th>
</tr>
</thead>
     <% 
     UploadnDownloaddao upd4=new UploadnDownloaddao();
   List<BIM4thSem> l4=upd4.selectBIM4thSem();
   int i4=0;
    for(BIM4thSem b4:l4){
    %>
<tbody class="table-hover">
<tr>
<td class="text-left"><%=++i4 %> </td>
<td class="text-left"><%= b4.getFilename() %></td>
<td class="text-left"><a href="UploadnDownload?down=download&filename=<%= b4.getFilename() %>" >Download</a></td>
</tr>
<%
    }
%>
</tbody>
</table>
   <div class="table-title">
<h3>5th SEMESTER</h3>
</div>
   
<table class="table-fill">
<thead>
<tr>
<th class="text-left">SN</th>
<th class="text-left">FILENAME</th>
<th class="text-left">DOWNLOAD</th>
</tr>
</thead>
     <% 
     UploadnDownloaddao upd5=new UploadnDownloaddao();
   List<BIM5thSem> l5=upd5.selectBIM5thSem();
   int i5=0;
    for(BIM5thSem b5:l5){
    %>
<tbody class="table-hover">
<tr>
<td class="text-left"><%=++i5 %> </td>
<td class="text-left"><%= b5.getFilename() %></td>
<td class="text-left"><a href="UploadnDownload?down=download&filename=<%= b5.getFilename() %>" >Download</a></td>
</tr>
<%
    }
%>
</tbody>
</table>
  <div class="table-title">
<h3>6th SEMESTER</h3>
</div>
   
<table class="table-fill">
<thead>
<tr>
<th class="text-left">SN</th>
<th class="text-left">FILENAME</th>
<th class="text-left">DOWNLOAD</th>
</tr>
</thead>
     <% 
     UploadnDownloaddao upd6=new UploadnDownloaddao();
   List<BIM6thSem> l6=upd6.selectBIM6thSem();
   int i6=0;
    for(BIM6thSem b6:l6){
    %>
<tbody class="table-hover">
<tr>
<td class="text-left"><%=++i6 %> </td>
<td class="text-left"><%= b6.getFilename() %></td>
<td class="text-left"><a href="UploadnDownload?down=download&filename=<%= b6.getFilename() %>" >Download</a></td>
</tr>
<%
    }
%>
</tbody>
</table>
 <div class="table-title">
<h3>7th SEMESTER</h3>
</div>
   
<table class="table-fill">
<thead>
<tr>
<th class="text-left">SN</th>
<th class="text-left">FILENAME</th>
<th class="text-left">DOWNLOAD</th>
</tr>
</thead>
     <% 
     UploadnDownloaddao upd7=new UploadnDownloaddao();
   List<BIM7thSem> l7=upd7.selectBIM7thSem();
   int i7=0;
    for(BIM7thSem b7:l7){
    %>
<tbody class="table-hover">
<tr>
<td class="text-left"><%=++i7 %> </td>
<td class="text-left"><%= b7.getFilename() %></td>
<td class="text-left"><a href="UploadnDownload?down=download&filename=<%= b7.getFilename() %>" >Download</a></td>
</tr>
<%
    }
%>
</tbody>
</table>
  <div class="table-title">
<h3>8th SEMESTER</h3>
</div>
   
<table class="table-fill">
<thead>
<tr>
<th class="text-left">SN</th>
<th class="text-left">FILENAME</th>
<th class="text-left">DOWNLOAD</th>
</tr>
</thead>
     <% 
     UploadnDownloaddao upd8=new UploadnDownloaddao();
   List<BIM8thSem> l8=upd8.selectBIM8thSem();
   int i8=0;
    for(BIM8thSem b8:l8){
    %>
<tbody class="table-hover">
<tr>
<td class="text-left"><%=++i8 %> </td>
<td class="text-left"><%= b8.getFilename() %></td>
<td class="text-left"><a href="UploadnDownload?down=download&filename=<%= b8.getFilename() %>" >Download</a></td>
</tr>
<%
    }
%>
</tbody>
</table>
      
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
