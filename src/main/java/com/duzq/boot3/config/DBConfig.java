package com.duzq.boot3.config;

import lombok.Getter;
import lombok.Setter;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

@Getter
@Setter
@Configuration
@PropertySource("classpath:db.properties")
public class DBConfig {
    @Value("${username1}")
    private String userName;
    @Value("${password}")
    private String password;
    @Value("${url}")
    private String url;
    @Value("${driver}")
    private String driver;
}




