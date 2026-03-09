package com.anthonypint0.servlet;

import com.anthonypint0.util.DBConnection;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.*;
import java.io.IOException;
import java.io.PrintWriter;
import java.sql.*;

@WebServlet("/StudentServlet")
public class StudentServlet extends HttpServlet {

    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {

        String action = request.getParameter("action");
        response.setContentType("text/html");
        PrintWriter out = response.getWriter();

        try (Connection con = DBConnection.getConnection()) {

            switch (action) {

                case "insert": {
                    CallableStatement cs = con.prepareCall("{call insertStudent(?,?,?)}");

                    cs.setString(1, request.getParameter("name"));
                    cs.setString(2, request.getParameter("email"));
                    cs.setInt(3, Integer.parseInt(request.getParameter("age")));

                    cs.execute();
                    out.println("Record Inserted Successfully");
                    break;
                }

                case "update": {
                    CallableStatement cs = con.prepareCall("{call updateStudent(?,?,?,?)}");

                    cs.setInt(1, Integer.parseInt(request.getParameter("id")));
                    cs.setString(2, request.getParameter("name"));
                    cs.setString(3, request.getParameter("email"));
                    cs.setInt(4, Integer.parseInt(request.getParameter("age")));

                    cs.execute();
                    out.println("Record Updated Successfully");
                    break;
                }

                case "delete": {
                    CallableStatement cs = con.prepareCall("{call deleteStudent(?)}");

                    cs.setInt(1, Integer.parseInt(request.getParameter("id")));

                    cs.execute();
                    out.println("Record Deleted Successfully");
                    break;
                }

                case "view": {
                    CallableStatement cs = con.prepareCall("{call viewStudents()}");

                    ResultSet rs = cs.executeQuery();

                    out.println("<h2>Student Records</h2>");
                    out.println("<table border='1'>");
                    out.println("<tr><th>ID</th><th>Name</th><th>Email</th><th>Age</th></tr>");

                    while (rs.next()) {
                        out.println("<tr>");
                        out.println("<td>" + rs.getInt("id") + "</td>");
                        out.println("<td>" + rs.getString("name") + "</td>");
                        out.println("<td>" + rs.getString("email") + "</td>");
                        out.println("<td>" + rs.getInt("age") + "</td>");
                        out.println("</tr>");
                    }

                    out.println("</table>");
                    break;
                }

                default:
                    out.println("Invalid action");
            }

        } catch (Exception e) {
            e.printStackTrace(out);
        }
    }
}