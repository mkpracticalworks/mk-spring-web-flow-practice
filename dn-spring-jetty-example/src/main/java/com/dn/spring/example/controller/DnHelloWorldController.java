package com.dn.spring.example.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class DnHelloWorldController{

    @RequestMapping(path = "/get/{name}",method = {RequestMethod.GET,RequestMethod.POST})
    @ResponseBody
    public String helloMain(@PathVariable("name") String name){
        return "Hello "+name;
    }

    @RequestMapping(path = "/home", method = {RequestMethod.GET})
    @ResponseBody
    public String successMessage(){
        return "Success mesage from jetty";
    }


}