package com.cuit.WatermelonCloud;


import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.scheduling.annotation.EnableScheduling;
import org.springframework.web.bind.annotation.CrossOrigin;
import tk.mybatis.spring.annotation.MapperScan;
import org.springframework.transaction.annotation.EnableTransactionManagement;

@SpringBootApplication
@MapperScan("com.cuit.WatermelonCloud.mapper")
@EnableScheduling
@EnableTransactionManagement
@CrossOrigin
public class WatermelonCloudApplication {


    public static void main(String[] args) {


        SpringApplication.run(WatermelonCloudApplication.class, args);
    }
}
