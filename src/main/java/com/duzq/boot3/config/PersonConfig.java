package com.duzq.boot3.config;

import com.duzq.boot3.entity.Person;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * @Configuration
 * 相当于声明一个xml配置文件 [ spring.xml ]
 */
@Configuration
public class PersonConfig {

    /**
     * @Bean
     * 相当于在xml文件中写的bean标签 [ <bean><bean/> ]
     */
    @Bean
    public Person getPerson() {
        Person p = new Person();
        p.setName("李四");
        p.setAge(19);
        return p;
    }
}
