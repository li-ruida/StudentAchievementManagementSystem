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
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.IOException;
import java.sql.Connection;
import java.util.List;

/**
 * @author lrd
 * @date 2022-08-24 下午4:13
 */
@WebServlet("/index")
public class IndexServlet extends ViewBaseServlet{
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        request.setCharacterEncoding("UTF-8");
        //get方式.tomcat8之后无需考虑乱码

        //保存到session作用域
        HttpSession session = request.getSession();
        System.out.println(session);
        super.processTemplate("index",request,response);
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        super.doPost(req, resp);
    }
}
