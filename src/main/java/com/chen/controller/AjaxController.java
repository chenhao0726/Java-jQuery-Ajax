package com.chen.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class AjaxController {
    /**
     * 原生ajax的登陆操作  ajax请求不需要响应页面给前端,只需要告知前端结果就好了
     * @return
     */
    @RequestMapping("/ajaxLogin")
    @ResponseBody
    public String ajaxLogin(String username,String password){
        if("zs".equals(username) && "123".equals(password)){
            return "success";
        }
        return "error";
    }

    /**
     * 原生ajax的登陆操作  ajax请求不需要响应页面给前端,只需要告知前端结果就好了
     * @return
     */
    @RequestMapping("/jqueryAjaxLogin")
    @ResponseBody
    public String jqueryAjaxLogin(String username,String password){
        if("zs".equals(username) && "123".equals(password)){
            return "{\"success\":true}";
        }
        return "{\"success\":false}";
    }

}
