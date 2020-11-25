<%@ page import ="java.util.*" %>
<!DOCTYPE html>
<html>
<body>
<center>
<h1>
    Available Brands
</h1>
<%
List result= (List) request.getAttribute("brands");
Iterator it = result.iterator();
out.println("<br>You entered <br><br>");
while(it.hasNext()){
out.println(it.next()+"<br>");
}
%>
</body>
</html>