package sdkd.com.ec.controller;

import sdkd.com.ec.dao.impl.EbCategoryDao;
import sdkd.com.ec.model.EbCategory;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/**
 * Created on 2016/7/7.
 */
@WebServlet(name = "EbCategoryController")
public class EbCategoryController extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
    doGet(request, response);
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        EbCategoryDao categoryDao=new EbCategoryDao();
        List<EbCategory> categoryList=categoryDao.getCategory();
        request.setAttribute("categoryList",categoryList);
        request.getRequestDispatcher("/notice.do").forward(request,response);

    }
}
