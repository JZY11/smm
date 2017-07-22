package ssm.controller;

import org.springframework.web.bind.annotation.ModelAttribute;

import javax.servlet.ServletContext;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 * Created by zhenya.1291813139.com
 * on 2017/7/22.
 * smm.
 */
//将来所有控制器的父类
public class BaseController {

    HttpServletRequest request;
    HttpServletResponse response;
    HttpSession session;
    ServletContext application;

    @ModelAttribute//方法级别的注解
    private void set(HttpServletRequest request, HttpServletResponse response){
        this.request = request;
        this.response = response;
        //下面两个是通过request来取得的
        session = request.getSession();
        application = request.getServletContext();
    }
}
