package com.mutech.dubbo.demo.controller;

import com.alibaba.dubbo.config.annotation.Reference;
import com.mutech.dubbo.starter.api.demo.DemoService;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author H
 */
@RestController
@RequestMapping("/demo")
public class DemoController {

    @Reference(url = "dubbo://127.0.0.1:20880")
    private DemoService demoApi;

    @RequestMapping("/demoFunction")
    public void demoFunction(){
        demoApi.demoFunction();
    }

}
