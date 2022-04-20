package com.crossSkilling.base;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

public class BaseClass {
    public static WebDriver driver;
    public static Properties prop;

    public BaseClass(){
        try{
            prop=new Properties();
            FileInputStream ip=new FileInputStream("C:\\Users\\udayprsingh" +
                    "\\IdeaProjects\\CrossSkillingApp\\src\\main\\java\\com\\crossSkilling\\config\\config.properties");
            prop.load(ip);
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static void initialization(){
        String browserName=prop.getProperty("browser");

        if(browserName.equals("chrome")){
            System.setProperty("webdriver.chrome.driver","C:\\Users\\udayprsingh\\Downloads\\chromedriver.exe");
            driver=new ChromeDriver();
        }
        driver.manage().window().maximize();
//        JavascriptExecutor js = (JavascriptExecutor) driver;
//        js.executeScript("document.body.style.zoom='90%'");
        driver.get(prop.getProperty("url"));
    }

}
