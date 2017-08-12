package com.hitek.struts2.login;

import com.opensymphony.xwork2.ActionSupport;
import org.apache.struts2.interceptor.SessionAware;
import org.apache.struts2.interceptor.validation.SkipValidation;

import java.util.Date;
import java.util.HashMap;
import java.util.Map;

public class LoginAction extends ActionSupport  implements SessionAware {

    private  Map<String, Object> session;

    public LoginAction() {
        session = new HashMap<String, Object>();
    }

    private String name;
    private String password;

    private Date nowDate;

    @SkipValidation
    public String kuku() {
        session.put("test", 5);
        return System.currentTimeMillis() % 2 == 0 ? "tiger" : "lion";
    }

    @Override
    public void validate() {
        if (name == null || name.length() == 0)
            addActionError(getText("error.name.message"));
        if (password == null || password.length() == 0)
            addActionError(getText("error.password.message"));
    }

    @Override
    public String execute() throws Exception {
        nowDate = new Date();
        return ActionSupport.SUCCESS;
    }



    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public Date getNowDate() {
        return nowDate;
    }

    public String tiger() {
        return "tiger";
    }

    public String lion() {
        return "lion";
    }

    @Override
    public void setSession(Map<String, Object> map) {

    }
}
