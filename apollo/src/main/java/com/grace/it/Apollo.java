package com.grace.it;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.config.server.EnableConfigServer;

/**
 * @description:
 * @project: grace
 * @date: 2019/8/17
 * @author: Wenxin
 * @version: 1.0
 */
@SpringBootApplication
@EnableConfigServer
public class Apollo {
    public static void main(String[] args) {
        SpringApplication.run(Apollo.class,args);
    }
}
