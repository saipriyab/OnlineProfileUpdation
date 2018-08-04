<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<h3 style="color:red">${filesuccess}</h3> 
<h3>Please save your resume with your profile id and in format of pdf only</h3> 
<form action="/OnlineProfileUpdation/savefile" method="post" enctype="multipart/form-data">  
Select File: <input type="file" name="file"/>  
<input type="submit" value="Upload File"/>  
</form>  
</body>
</html>