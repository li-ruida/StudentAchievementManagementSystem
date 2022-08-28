package servlets;

import bean.*;
import dao.StudentDao;
import dao.StudentDaoImpl;
import utils.JDBCCRUD;
import utils.JDBCUtils;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.IOException;
import java.sql.Connection;
import java.util.HashMap;
import java.util.List;

/**
 * @author lrd
 * @date 2022-08-26 上午8:32
 */
@WebServlet("/teacher")
public class TeacherViewServlet extends ViewBaseServlet{
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        doPost(req, resp);
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        resp.setContentType("text/html;charset=UTF-8");
        // 设置响应内容类型
        req.setCharacterEncoding("utf-8");
        //保存到session作用域
        HttpSession session = req.getSession();


        String sql="select distinct scname,semid from semester order by semid desc;";
        Connection connection= JDBCUtils.getConnection();
        List<Semester> semlist = JDBCCRUD.getForList(Semester.class, sql);
        System.out.println(semlist);
        session.setAttribute("semlist",semlist);

        sql="select cid ,cname from class where tid=?;";
        connection= JDBCUtils.getConnection();
        Teacher teacher1= (Teacher) session.getAttribute("teacher");
        System.out.println(teacher1);
        List<TheClass> classlist = JDBCCRUD.getForList(TheClass.class, sql, teacher1.getTid());
        System.out.println(classlist);
        session.setAttribute("classlist",classlist);


        Teacher teacher= (Teacher) session.getAttribute("teacher");
        String semid = req.getParameter("semid1");
        String classid = req.getParameter("classid");
        if(semid==null||semid.compareTo("0")==0){
            if(classid==null||classid.compareTo("0")==0){
                System.out.println(semid);
                sql="select *from classstu where cid in (select cid from class where tid=?) order by cid;";
                connection= JDBCUtils.getConnection();
                List<Classstu> classstus = JDBCCRUD.getForList(Classstu.class, sql, teacher.getTid());

                session.setAttribute("classstus",classstus);
                System.out.println(classstus);
            }
            else{
                System.out.println(classid);
                sql="select *from classstu where cid in (select cid from class where tid=? and cid=?) order by cid;";
                connection= JDBCUtils.getConnection();
                List<Classstu> classstus = JDBCCRUD.getForList(Classstu.class, sql, teacher.getTid(),classid);

                session.setAttribute("classstus",classstus);
                System.out.println(classstus);
            }
        }
        else {
            if(classid==null||classid.compareTo("0")==0){
                System.out.println(semid);
                sql="select *from classstu where cid in (select cid from class where tid=?) and semid=? order by cid;";
                connection= JDBCUtils.getConnection();
                List<Classstu> classstus = JDBCCRUD.getForList(Classstu.class, sql, teacher.getTid(),Integer.parseInt(semid));

                session.setAttribute("classstus",classstus);
                System.out.println(classstus);
            }
            else {
                System.out.println(semid);
                sql="select *from classstu where cid in (select cid from class where tid=? and cid=?) and semid=? order by cid;";
                connection= JDBCUtils.getConnection();
                List<Classstu> classstus = JDBCCRUD.getForList(Classstu.class, sql, teacher.getTid(),classid,Integer.parseInt(semid));

                session.setAttribute("classstus",classstus);
                System.out.println(classstus);
            }


        }

        super.processTemplate("teacherview",req,resp);
    }
}
