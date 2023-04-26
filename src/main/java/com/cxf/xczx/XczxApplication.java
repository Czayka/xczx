package com.cxf.xczx;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import springfox.documentation.swagger2.annotations.EnableSwagger2;


@MapperScan("com.cxf.xczx.mapper")
@SpringBootApplication
public class XczxApplication {

    public static void main(String[] args) {
        SpringApplication.run(XczxApplication.class, args);
    }

}
