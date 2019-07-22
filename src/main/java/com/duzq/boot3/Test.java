package com.duzq.boot3;

import com.duzq.boot3.entity.Person;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {

    public static void main(String[] args) {
        ApplicationContext ac = new ClassPathXmlApplicationContext("classpath:spring.xml");
        Person person = (Person) ac.getBean("Person");
        person.say();
    }
}
