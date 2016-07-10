package sdkd.com.ec.controller;

import sdkd.com.ec.dao.impl.EbNewsDao;
import sdkd.com.ec.dao.impl.EbNoticeDao;
import sdkd.com.ec.model.EbNews;
import sdkd.com.ec.model.EbNotice;

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
@WebServlet(name = "EbNoticeController")
public class EbNoticeController extends HttpServlet {
    EbNoticeDao noticeDao = new EbNoticeDao();

    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        doGet(request,response);
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        request.setCharacterEncoding("utf-8");
        response.setCharacterEncoding("utf-8");
        String action = request.getParameter("action");
        if("list".equals(action)){   //列表
            list(request, response);
        }else if("detail".equals(action)){  //详情
            detail(request,response);
        }else{
            list(request, response);
        }
    }

    /**
     * 新闻列表
     * @param request
     * @param response
     * @throws ServletException
     * @throws IOException
     */
    public void list(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException{
        List<EbNotice> list = noticeDao.getNotice();
        request.setAttribute("noticeList",list);
        //跳转
        request.getRequestDispatcher("/news.do").forward(request,response);
    }

    /**
     * 新闻详情
     * @param request
     * @param response
     * @throws ServletException
     * @throws IOException
     */
    public void detail(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException{
        String paramsId = request.getParameter("id");
        int id = 0;
        if(paramsId!=null && !"".equals(paramsId)){
            id = Integer.valueOf(paramsId);
        }

        EbNotice notice = noticeDao.getNoticeById(id);
        request.setAttribute("notice",notice);
        request.getRequestDispatcher("/notice-view.jsp").forward(request,response);
    }
}