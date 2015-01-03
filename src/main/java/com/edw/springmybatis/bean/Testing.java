package com.edw.springmybatis.bean;

import java.io.Serializable;

public class Testing implements Serializable  {

    private Integer id;
    private String name;
    private String address;

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "testing{" + "id=" + id + ", name=" + name + ", address=" + address + '}';
    }

    public Testing() {
    }

    public Testing(String name, String address) {
        this.name = name;
        this.address = address;
    }
}
