package com.hspedu.furns.web;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

/**
 * @author 韩顺平
 * @version 1.0
 */
public class AdminServlet extends BasicServlet {


    protected void login(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        //这里的代码，请小伙伴自己完成
        request.getRequestDispatcher("/views/manage/manage_menu.jsp")
                .forward(request, response);
    }

}
