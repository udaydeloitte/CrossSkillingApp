package com.crossSkilling.testcases;

import com.crossSkilling.base.BaseClass;
import com.crossSkilling.pages.AdminLogin;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class AdminLoginTest extends BaseClass {
    AdminLogin adminLogin;
    public AdminLoginTest(){
        super();
    }
    @BeforeMethod
    public void setUp(){
        initialization();
        adminLogin=new AdminLogin();
    }
    @Test
    public void logintest() throws InterruptedException {
        adminLogin.login("mentorAdmin","abc123");
    }

}
