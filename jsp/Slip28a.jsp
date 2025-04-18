<html>
<body>
    <form action="Slip28a.jsp" method="get">
        Enter a number: <input type="text" name="num">
        <input type="submit" name="calculate" value="Calculate">
    </form>
</body>
</html>

<%@ page language="java" import="java.util.*" %>
<%! int temp, n, sum = 0, mod = 0; %>
<%
    try {
        String numStr = request.getParameter("num");
        if (numStr != null && !numStr.isEmpty()) {
            n = Integer.parseInt(numStr);
            temp = n;

            while (temp != 0) {
                mod = temp % 10; // Get the last digit
                sum += (mod * mod * mod); // Cube the digit and add to sum
                temp /= 10; // Remove the last digit
            }

            if (sum == n) {
                out.println(n + " is an Armstrong number.");
            } else {
                out.println(n + " is not an Armstrong number.");
            }
        } else {
            out.println("Please enter a valid number.");
        }
    } catch (NumberFormatException e) {
        out.println("Invalid input. Please enter a numeric value.");
    } catch (Exception e) {
        out.println("Error: " + e.getMessage());
    }
%>
