package com.example.webjsf.beans;

import jakarta.annotation.ManagedBean;
import jakarta.inject.Named;
import jdk.jfr.Name;

import jakarta.enterprise.context.RequestScoped;
@Named
@RequestScoped
public class ExampleBean {
    private String message = "The first manage bean";
    public ExampleBean(){}
    public String getMessage() {
        return message;
    }
    public void setMessage(String message) {
        this.message = message;
    }
}
