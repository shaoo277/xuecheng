package com.xuecheng.content;

import com.spring4all.swagger.EnableSwagger2Doc;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * @author Mr.M
 * @version 1.0
 * @description 内容管理服务启动类
 * @date 2023/2/12 9:03
 */

//@EnableSwagger2Doc 是一个注解，用于启用 Swagger 文档生成功能。其主要作用是：
//自动扫描项目中的接口定义。
//生成 RESTful API 的在线文档和测试界面
@EnableSwagger2Doc
@SpringBootApplication
public class ContentApplication {
    public static void main(String[] args) {
        SpringApplication.run(ContentApplication.class, args);
    }
}
