package com.edu.gcu.stuaward_client2.bean;

import com.fasterxml.jackson.annotation.JsonProperty;
import org.springframework.stereotype.Repository;

import java.io.Serializable;
import java.util.List;
@Repository
public class Hello implements Serializable {
    @Override
    public String toString() {
        return "Hello{" +
                "name='" + name + '\'' +
                ", id=" + id +
                ", helloInLists=" + helloInLists +
                ", cash=" + cash +
                '}';
    }

    @JsonProperty("name")
    private String name;
    @JsonProperty("id")
    private Integer id;
    @JsonProperty("hellolist")
    private List<HelloInList> helloInLists;
    @JsonProperty("cash")
    private Double cash;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public List<HelloInList> getHelloInLists() {
        return helloInLists;
    }

    public void setHelloInLists(List<HelloInList> helloInLists) {
        this.helloInLists = helloInLists;
    }

    public Double getCash() {
        return cash;
    }

    public void setCash(Double cash) {
        this.cash = cash;
    }
}
