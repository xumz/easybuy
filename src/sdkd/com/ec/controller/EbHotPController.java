package sdkd.com.ec.controller;

import sdkd.com.ec.dao.impl.EbHotProductDao;
import sdkd.com.ec.model.EbProduct;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.List;

/**
 * Created by xmz on 2016/7/7.
 */
@WebServlet(name = "EbHotPController")
public class EbHotPController extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        doGet(request, response);
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        request.setCharacterEncoding("utf-8");
        response.setCharacterEncoding("utf-8");
        EbHotProductDao hotProductDao=new EbHotProductDao();
        List<EbProduct> hotproductList=hotProductDao.getHotProduct();
        request.setAttribute("hotproductList",hotproductList);
        request.getRequestDispatcher("/product.do").forward(request,response);
    }
}
