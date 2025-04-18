    <%@ page language="java" import="java.sql.*" %>
    <%! int i=0; %>
    <%! Connection con; %>
    <%! Statement st; %>
    <%! ResultSet rs; %>
    <% Class.forName("sun.jdbc.odbc.JdbcOdbcDriver");
        con=DriverManager.getConnection("jdbc:odbc:mydsn"); st=con.createStatement();
        rs=st.executeQuery("select * from hospital"); %>

                        <table border="1">
                            <th>HNO</th>
                            <th>HNAME</th>
                            <th>Address</th>

                            <% while(rs.next()) {%>
                                <tr>
                                    <td>
                                        <%=rs.getInt(1)%>
                                    </td>
                                    <td>
                                        <%=rs.getString(2)%>
                                    </td>
                                    <td>
                                        <%=rs.getString(3)%>
                                    </td>
                                </tr>
                                <%}%>
                        </table>