package com.duzq.boot3.entity;

public class Person {
    private String name;
    private Integer age;

    public void setName(String name) {
        this.name = name;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public void say() {
        System.out.println("我的名字是："+name+"，今年"+age+"岁！");
    }
}
