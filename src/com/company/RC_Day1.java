package com.company;

import com.thoughtworks.selenium.DefaultSelenium;
import com.thoughtworks.selenium.Selenium;
public class RC_Day1 {
    public static void main(String[] args) {
        Selenium selenium=new DefaultSelenium("localhost",4444,"*firefox","https://google.com");
        selenium.start();
        selenium.open("/");
    }
}
