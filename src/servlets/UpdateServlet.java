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
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.IOException;
import java.sql.Connection;
import java.util.List;

/**
 * @author lrd
 * @date 2022-08-27 下午4:36
 */
@WebServlet("/update")
public class UpdateServlet extends ViewBaseServlet{

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        resp.setContentType("text/html;charset=UTF-8");
        // 设置响应内容类型
        req.setCharacterEncoding("utf-8");
        String sid = req.getParameter("sid");
        String cid = req.getParameter("cid");
        String grade = req.getParameter("grade");

        String sql="update classstu set sgrad =? where cid =? and sid=?;";
        JDBCCRUD.update(sql,grade,cid,sid);
        resp.sendRedirect("/teacher");
        super.processTemplate("teacherview",req,resp);
    }

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        doPost(req, resp);
    }
}
