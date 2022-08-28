package servlets;

import bean.Student;
import bean.Teacher;
import dao.StudentDao;
import dao.StudentDaoImpl;
import dao.TeacherDao;
import dao.TeacherDaoImpl;
import utils.JDBCUtils;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.IOException;
import java.io.PrintWriter;
import java.net.URLEncoder;
import java.sql.Connection;

/**
 * @author lrd
 * @date 2022-08-25 上午10:00
 */
@WebServlet("/login")
public class LoginServlet extends ViewBaseServlet{
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        PrintWriter printWriter=response.getWriter();
        request.setCharacterEncoding("utf-8");
        response.setCharacterEncoding("utf-8");
        String sidstr = request.getParameter("id");
        Integer sid=Integer.parseInt(sidstr);
        String password=request.getParameter("password");
        System.out.println(sid+password);
        Student student = null;
        StudentDao studentDao=new StudentDaoImpl();
        Connection conn= JDBCUtils.getConnection();
        student=studentDao.getStudentById(conn,sid);
        TeacherDao teacherDao = new TeacherDaoImpl();
        Teacher teacher=null;
        conn= JDBCUtils.getConnection();
        teacher=teacherDao.getTeacherById(conn,sid);
        if((student!=null)&&(student.getPassword().equals(password))){
            System.out.println(student.getPassword());
            //保存到session作用域
            HttpSession session = request.getSession();
            System.out.println(session);
            session.setAttribute("student",student);
            String str=student.getSid()+"";

            printWriter.write("欢迎回来");


            response.sendRedirect("/student");
        }
        else if((teacher!=null)&&(teacher.getPassword().equals(password))){


                System.out.println(teacher);
                HttpSession session = request.getSession();
                System.out.println(session);
                session.setAttribute("teacher",teacher);
                printWriter.write("欢迎回来");
                response.sendRedirect("/teacher");

        }
        else{
            System.out.println("账号或密码错误");
            response.setCharacterEncoding("utf-8");
            response.setContentType("text/html;setchar=utf-8");
            String a = URLEncoder.encode("账号或密码错误！", "UTF-8");
            PrintWriter out = response.getWriter();
            out.println("<script language='javascript'>alert(decodeURIComponent('"+a+"') );window.location.href='index.html';</script>");
            out.close();

            try {
                Thread.sleep(2000);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
            response.sendRedirect("/index");


        }
        super.processTemplate("index",request,response);
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        doGet(req, resp);
    }
}
