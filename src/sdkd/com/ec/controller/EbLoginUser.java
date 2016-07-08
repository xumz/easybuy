package sdkd.com.ec.controller;


import sdkd.com.ec.dao.impl.EbUserDao;
import sdkd.com.ec.model.EbUser;


import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

/**
 * Created  by xmz on 2016/7/7.
 */
@WebServlet(name = "EbLoginUser")
public class EbLoginUser extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        doGet(request,response);
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        EbUserDao ebu=new EbUserDao();
        request.setCharacterEncoding("utf-8");
        String Id=(String)request.getParameter("userName");
        String Pass=(String)request.getParameter("passWord");

        EbUser user=ebu.getUser(Id);

    if(Pass.equals(user.getEuPassword()))
        {
            request.setAttribute("user",user);
            request.getRequestDispatcher("/hpro.do").forward(request,response);
        }
        else
        {
            request.getRequestDispatcher("/login.jsp").forward(request,response);
        }

    }
}
