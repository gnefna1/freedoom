package cn.springmvc.controller;


import cn.springmvc.base.JsonBean;
import org.springframework.stereotype.Controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@RequestMapping("/")
public class LoginController {

    @RequestMapping("loginView")
    public String gotoLoginView(){
      return "loginView";
    }


    /**
     * 返回json类型数据
     *
     * @return
     */
    @RequestMapping("getJson")
    @ResponseBody
    public JsonBean getJsonData(){
        JsonBean jsonBean = new JsonBean();
        jsonBean.put("jsonData","lalalalal");
        return jsonBean;
    }
}
