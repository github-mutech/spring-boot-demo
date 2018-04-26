package com.mutech.dubbo.demo.consumer;

import com.alibaba.dubbo.config.annotation.Reference;
import com.mutech.dubbo.starter.api.demo.DemoService;
import org.springframework.stereotype.Component;

@Component
public class DemoConsumer {

    @Reference(url = "dubbo://127.0.0.1:20880")
    private DemoService demoApi;
}
