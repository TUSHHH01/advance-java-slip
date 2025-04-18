<%@ page language="java" %>
<%@ page import="java.lang.*" %>
<%@ page import="java.util.*" %>


    <form method="post" action="slip17a.jsp">
      Enter Name: <input type="text" name=""><br>
      Enter Age: <input type="text" name="no"><br>
      <input type="submit" name="submit" value="Check Eligibility">
    </form>

    <%
      String ageParam = request.getParameter("no");

      if (ageParam != null && !ageParam.trim().isEmpty()) {  
          try {
              int age = Integer.parseInt(ageParam); 
              if (age >= 18) {
                  out.println("<br>You are eligible to vote.");
              } else {
                  out.println("<br>You are not eligible to vote.");
              }
          } catch (NumberFormatException e) {
              out.println("<br>Please enter a valid number for age."); 
          }
      }
    %>