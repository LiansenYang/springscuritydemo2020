package com.example.springscuritydemo2020.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;
import java.util.*;
/**
 * @description:
 * @author: yangLs
 * @create: 2020-07-27 19:04
 **/
@RestController
@RequestMapping("/test")
public class testController {

    @GetMapping("easy")
    @ResponseBody
    public List<String> testResuslt(){
        List<String> we =   new ArrayList<>();
        we.add("sd");
        we.add("sde");
        return we;
    }

    @GetMapping("easy1")
    @ResponseBody
    public String testResusl2t(){
        return "sdsd";
    }
}
