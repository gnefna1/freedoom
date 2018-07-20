/*
 **********************************************************************************
 * Copyright www.ebidding.net.cn 2014-11-24 Authors: 闫广坤 <ygk@ebidding.com.cn>*
 **********************************************************************************
 */
package cn.springmvc.base;

import com.alibaba.fastjson.JSONObject;
import com.alibaba.fastjson.serializer.SerializerFeature;

import org.springframework.web.bind.WebDataBinder;
import org.springframework.web.bind.annotation.InitBinder;

import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class BaseController {

    /*@InitBinder()
    public void initBinder(WebDataBinder binder) {

        SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd");
        binder.registerCustomEditor(Date.class, new EbsCustomDateEditor(dateFormat, true));
    }*/

    /**
     * 拦截器中返回json数据
     */
    public void writeJson(String json, HttpServletResponse response) throws IOException {
        response.setContentType("application/json;charset=UTF-8");
        response.getWriter().write(json);
    }

    public void writeJson(Object obj, HttpServletResponse response) throws IOException {
        response.setContentType("application/json;charset=UTF-8");
        response.getWriter().write(JSONObject.toJSONString(obj, SerializerFeature.WriteMapNullValue, SerializerFeature.WriteNullStringAsEmpty, SerializerFeature.WriteNullBooleanAsFalse));
    }

    public void writeHtml(String html, HttpServletResponse response) throws IOException {
        response.setContentType("text/html;charset=UTF-8");
        response.getWriter().write(html);
    }

    public void writePlain(String plain, HttpServletResponse response) throws IOException {
        response.setContentType("text/plain;charset=UTF-8");
        response.getWriter().write(plain);
    }

}
