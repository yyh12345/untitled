package servlet;

import controll.UserDAOImpl;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.SQLException;

public class Servlet extends javax.servlet.http.HttpServlet {
    protected void doPost(javax.servlet.http.HttpServletRequest request, javax.servlet.http.HttpServletResponse response)
            throws javax.servlet.ServletException, IOException {
       String id =  request.getParameter("id");
        String password =  request.getParameter("password");
        System.out.println(id);
        System.out.println(password);
        UserDAOImpl  userDAOImpl = new UserDAOImpl();

      //  PrintWriter out = response.getWriter();

        try {

            if (userDAOImpl.isLand(id,password)){
                    System.out.println("��¼�ɹ�");

            }else{
                    System.out.println("��¼ʧ��");

            }

        } catch (SQLException e) {
            e.printStackTrace();
        }

    }

    protected void doGet(javax.servlet.http.HttpServletRequest request, javax.servlet.http.HttpServletResponse response)
            throws javax.servlet.ServletException, IOException {
                doPost(request,response);
    }
}
