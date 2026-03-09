package com.anthonypint0.servlet;

import com.anthonypint0.util.DBConnection;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.*;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.*;

@WebServlet("/LoginServlet")
public class LoginServlet extends HttpServlet {

    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {

        String username = request.getParameter("username");
        String password = request.getParameter("password");

        response.setContentType("text/html");
        PrintWriter out = response.getWriter();

        try (Connection con = DBConnection.getConnection()) {

            PreparedStatement ps = con.prepareStatement(
                    "SELECT * FROM users WHERE username=? AND password=?");

            ps.setString(1, username);
            ps.setString(2, password);

            ResultSet rs = ps.executeQuery();

            if (rs.next()) {

                // create session
                HttpSession session = request.getSession();
                session.setAttribute("username", username);

                response.sendRedirect("welcome.jsp");

            } else {
                out.println("<h3>Invalid Username or Password</h3>");
                out.println("<a href='index.html'>Try Again</a>");
            }

        } catch (Exception e) {
            e.printStackTrace(out);
        }
    }
}