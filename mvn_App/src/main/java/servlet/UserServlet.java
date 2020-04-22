package servlet;

import pojo.Dev_user;
import service.UsersService;
import service.serviceimp.UserServiceimp;


import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.IOException;
import java.io.PrintWriter;
import java.lang.reflect.Method;


@WebServlet(name = "UsersServlet", urlPatterns = "*.actionUsers")
public class UserServlet extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        doGet(request, response);
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        //具体操作
        //获得提交路径  /save.action
        String path = request.getServletPath();
        //截取文件名 save
        String fileName = path.substring(1, path.lastIndexOf("."));
        try {
            //利用反射机制
            Method method = this.getClass().getDeclaredMethod(fileName, HttpServletRequest.class, HttpServletResponse.class);
            //调用
            method.invoke(this, request, response);

        } catch (Exception e) {
            e.printStackTrace();
        }

    }
    //登录
    protected void UsersLogin(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        response.setContentType("text/html;charset=utf-8");

        PrintWriter writer = response.getWriter();


        String name = request.getParameter("devName");
        String password = request.getParameter("devPassword");

        Dev_user users = new Dev_user(name, password);

       UsersService service=new UserServiceimp();

        int count = service.login(users);

//        创建会话对象
        HttpSession session = request.getSession();

        session.setAttribute("users", users);


        if (count > 0) {
            response.sendRedirect("main.jsp");

        } else {
            response.sendRedirect("devlogin.jsp");
        }


        writer.flush();
        writer.close();
    }

//    //    退出系统
//    protected void UsersExit(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
//        response.setContentType("text/html;charset=utf-8");
//
//        PrintWriter writer = response.getWriter();
//
//        HttpSession session = request.getSession();
//
////        移除登录时的用户
//        session.removeAttribute("users");
//
////        会话销毁
//        session.invalidate();
//
////        跳转到登录的界面
//        response.sendRedirect("login.html");
//
//        writer.flush();
//        writer.close();
//    }

}