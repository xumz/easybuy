package sdkd.com.ec.controller;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

import  sdkd.com.ec.model.EbUser;
import  sdkd.com.ec.dao.impl.EbUserDao;

/**
 * Created on 2016/7/7.
 */
@WebServlet(name = "EbRegistUser")
public class EbRegistUser extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        doGet(request,response);
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        EbUser user = new EbUser();
        EbUserDao ebu=new EbUserDao();
        String Id=request.getParameter("userName");
        String Pass=request.getParameter("passWord");
        String RePass=request.getParameter("rePassWord");
        if(Pass.equals(RePass))
        {
            if(ebu.IsExistId(Id)==false)
            {
                user.setEuId(Id);
                user.setEuPassword(Pass);
                user.setEuStatus(1);
                ebu.setUser(user);
                //跳转
                request.getRequestDispatcher("register.html").forward(request,response);
            }
            else
            {
                request.getRequestDispatcher("register.html").forward(request,response);
            }
        }
        else
        {
            request.getRequestDispatcher("register.html").forward(request,response);
        }

    }
}
