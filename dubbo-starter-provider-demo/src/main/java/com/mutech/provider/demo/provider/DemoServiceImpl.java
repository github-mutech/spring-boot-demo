package com.mutech.provider.demo.provider;

import com.alibaba.dubbo.config.annotation.Service;
import com.mutech.dubbo.starter.api.demo.DemoService;
import org.springframework.stereotype.Component;

/**
 * @author H
 */
@Service(interfaceClass = DemoService.class)
@Component
public class DemoServiceImpl implements DemoService {
    @Override
    public void demoFunction() {
        System.out.println("hello world!");
    }
}
