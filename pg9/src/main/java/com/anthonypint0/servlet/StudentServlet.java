/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.anthonypint0.servlet;

/**
 *
 * @author LENOVO
 */
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
                    PreparedStatement ps = con.prepareStatement(
                            "INSERT INTO students(name, email, age) VALUES (?, ?, ?)");
                    ps.setString(1, request.getParameter("name"));
                    ps.setString(2, request.getParameter("email"));
                    ps.setInt(3, Integer.parseInt(request.getParameter("age")));
                    ps.executeUpdate();
                    out.println("Record Inserted Successfully");
                    break;
                }

                case "update": {
                    PreparedStatement ps = con.prepareStatement(
                            "UPDATE students SET name=?, email=?, age=? WHERE id=?");
                    ps.setString(1, request.getParameter("name"));
                    ps.setString(2, request.getParameter("email"));
                    ps.setInt(3, Integer.parseInt(request.getParameter("age")));
                    ps.setInt(4, Integer.parseInt(request.getParameter("id")));
                    ps.executeUpdate();
                    out.println("Record Updated Successfully");
                    break;
                }

                case "delete": {
                    PreparedStatement ps = con.prepareStatement(
                            "DELETE FROM students WHERE id=?");
                    ps.setInt(1, Integer.parseInt(request.getParameter("id")));
                    ps.executeUpdate();
                    out.println("Record Deleted Successfully");
                    break;
                }

                case "view": {
                    PreparedStatement ps = con.prepareStatement("SELECT * FROM students");
                    ResultSet rs = ps.executeQuery();

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
