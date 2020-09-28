package io.zbc.motorecord;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan({"io.zbc.motorecord"})
@MapperScan({"io.zbc.motorecord.mapper"})
public class MotorecordApplication {

    public static void main(String[] args) {
        SpringApplication.run(MotorecordApplication.class, args);
    }

}
