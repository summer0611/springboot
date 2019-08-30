package com.duzq.boot3;

import com.duzq.boot3.config.DBConfig;
import com.duzq.boot3.config.PersonConfig;
import com.duzq.boot3.entity.Person;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {

    public static void main(String[] args) {
        // 配置文件方式
        // 1. 读取配置文件
        ApplicationContext ac = new ClassPathXmlApplicationContext("classpath:spring.xml");
        // 2. 获取Bean对象
        Person person = (Person) ac.getBean("Person");
        person.say();

        // 注解方式
        // 1. 读取配置文件
        AnnotationConfigApplicationContext aca = new AnnotationConfigApplicationContext(PersonConfig.class);
        // 2. 获取Bean对象
        Person person1 = aca.getBean(Person.class);
        person1.say();

        // 注解方式读取配置文件
        AnnotationConfigApplicationContext acaDb = new AnnotationConfigApplicationContext(DBConfig.class);
        DBConfig dbConfig = acaDb.getBean(DBConfig.class);
        System.out.println(dbConfig.getUserName());
        System.out.println(dbConfig.getDriver());
        System.out.println(dbConfig.getUrl());
    }
}
