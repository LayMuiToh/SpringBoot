package com.frankmoley.landon.data.entity;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
@Scope(value="prototype")
public class Alien {
    private int id;
    private String name;
    private String tech;
    @Autowired
    @Qualifier(value = "lap1")
    private Laptop mylaptop;

    public Alien() {
        super();
        System.out.println("Object created");
    }

    public Laptop getMylaptop() {
        return mylaptop;
    }

    public void setMylaptop(Laptop mylaptop) {
        this.mylaptop = mylaptop;
    }
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getTech() {
        return tech;
    }

    public void setTech(String tech) {
        this.tech = tech;
    }

    public void show() {
        System.out.println("Show me");
        this.mylaptop.compile();
    }
}
