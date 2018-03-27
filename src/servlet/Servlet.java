package servlet;

import controll.UserDAOImpl;
import java.io.IOException;
import java.io.PrintWriter;
import java.sql.SQLException;

public class Servlet extends javax.servlet.http.HttpServlet {
    protected void doPost(javax.servlet.http.HttpServletRequest request, javax.servlet.http.HttpServletResponse response)
            throws javax.servlet.ServletException, IOException {
        String id = request.getParameter("id");
        String password = request.getParameter("password");
        UserDAOImpl userDAOImpl = new UserDAOImpl();
        response.setCharacterEncoding("gbk");
        PrintWriter out = response.getWriter();

        try {
            if (id == null || id.equals("")) {
                out.println("id=" + id);
                return;
            }
            if (password == null || password.equals("")) {
                out.println("password=" + password);
                return;
            }
            if (userDAOImpl.isLand(id, password)) {
                out.println("<h1 >登录成功</h1>");

            } else {
                out.println("登录失败");

            }
        } catch (SQLException e) {
            e.printStackTrace();
        } finally {
            out.close();
        }


    }

    protected void doGet(javax.servlet.http.HttpServletRequest request, javax.servlet.http.HttpServletResponse response)
            throws javax.servlet.ServletException, IOException {
        doPost(request, response);
    }
}
