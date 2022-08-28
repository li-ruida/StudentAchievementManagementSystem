package servlets;

import bean.Student;
import dao.StudentDao;
import dao.StudentDaoImpl;


import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.IOException;
import java.util.List;

/**
 * @author lrd
 * @date 2022-08-22 下午3:08
 */
//servlet3.0开始支持注解方式注册
@WebServlet("/stuselectservlet")
public class StuSelectServlet extends ViewBaseServlet{
    @Override
    public void doGet(HttpServletRequest req, HttpServletResponse resp) throws IOException {
        StudentDao studentDao=new StudentDaoImpl();
        List<Student> student = studentDao.getStudent();
        System.out.println(student);
        //保存到session作用域
        HttpSession session = req.getSession();
        session.setAttribute("studentList",student);
        //此处视图名称是studentviewtest
        //thymeleaf会将这个逻辑视图名称studentviewtest 对应到物理视图名称  view-prefix+ 逻辑视图名称 +view-presuffix
        super.processTemplate("studentviewtest",req,resp);
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        doGet(req, resp);
    }
}
