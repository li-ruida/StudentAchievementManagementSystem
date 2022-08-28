package servlets;


import bean.Student;
import dao.StudentDao;
import utils.*;
import dao.StudentDaoImpl;


import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.sql.Connection;

public class AddServlet extends HttpServlet {
    @Override
    public void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        //post方式下,需要在所有获取参数的语句之前,设置字符编码,防止乱码
        request.setCharacterEncoding("UTF-8");
        //get方式.tomcat8之后无需考虑乱码
        String sname = request.getParameter("sname");
        String sidstr = request.getParameter("sid");
        Integer sid=Integer.parseInt(sidstr);
        String password=request.getParameter("password");
        System.out.println(sname+sid+password);
        Student student = new Student(sid, sname, password);
        System.out.println(student);

        StudentDao studentDao = new StudentDaoImpl();
        Connection conn=JDBCUtils.getConnection();
        studentDao.saveStudent(conn,student);
    }

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        doPost(req,resp);
    }
}
/*

 */