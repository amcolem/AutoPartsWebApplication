package Servlets;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import java.io.*;

@WebServlet("/employeeLogin")
public class EmployeeLoginServlet extends HttpServlet {
    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        String username = req.getParameter("username");
        String password = req.getParameter("password");

        if (correctLogin(username, password)) {
            resp.setStatus(200);
            System.out.println("Login successful!");
        } else resp.setStatus(400);
    }

    public boolean correctLogin(String username, String password) {
        if (username.equals("admin") && password.equals("123")) {
            return true;
        } else return false;
    }
}
