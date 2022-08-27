package servlets;

import bean.Classstu;
import bean.Semester;
import bean.Student;
import dao.StudentDao;
import dao.StudentDaoImpl;
import utils.JDBCCRUD;
import utils.JDBCUtils;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.IOException;
import java.net.CookieHandler;
import java.net.URLDecoder;
import java.sql.Connection;
import java.util.List;

/**
 * @author lrd
 * @date 2022-08-25 上午10:34
 */
@WebServlet("/student")
public class StudentViewServlet extends ViewBaseServlet{
    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        resp.setContentType("text/html;charset=UTF-8");
        // 设置响应内容类型
        req.setCharacterEncoding("utf-8");
        StudentDao studentDao=new StudentDaoImpl();
        List<Student> student = studentDao.getStudent();
        System.out.println(student);
        //保存到session作用域
        HttpSession session = req.getSession();

        session.setAttribute("studentList",student);

        String sql="select distinct scname,semid from semester order by semid desc;";
        Connection connection= JDBCUtils.getConnection();
        List<Semester> semlist = JDBCCRUD.getForList(Semester.class, sql);
        System.out.println(semlist);
        session.setAttribute("semlist",semlist);

        Student student1= (Student) session.getAttribute("student");
        String semid = req.getParameter("semid1");
        if(semid==null||semid.compareTo("0")==0){
            System.out.println(semid);
            sql="select * from classstu where sid=?;";
            connection= JDBCUtils.getConnection();
            List<Classstu> gradelist = JDBCCRUD.getForList(Classstu.class, sql, student1.getSid());

            session.setAttribute("gradelist",gradelist);
            System.out.println(gradelist);

        }
        else {
            System.out.println(semid);
            sql="select * from classstu where sid=? and semid=?;";
            connection= JDBCUtils.getConnection();
            List<Classstu> gradelist = JDBCCRUD.getForList(Classstu.class, sql, student1.getSid(),Integer.parseInt(semid));

            session.setAttribute("gradelist",gradelist);
            System.out.println(gradelist);

        }

        super.processTemplate("studentview",req,resp);
    }

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        doPost(req,resp);
    }
}
