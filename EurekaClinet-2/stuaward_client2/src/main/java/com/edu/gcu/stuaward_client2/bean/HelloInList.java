package com.edu.gcu.stuaward_client2.bean;

import com.fasterxml.jackson.annotation.JsonProperty;
import org.springframework.stereotype.Repository;

import java.io.Serializable;

@Repository
public class HelloInList implements Serializable {
    @Override
    public String toString() {
        return "HelloInList{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", money=" + money +
                ", content='" + content + '\'' +
                '}';
    }

    @JsonProperty("id")
    private Integer id;
    @JsonProperty("name")
    private String name;
    @JsonProperty("money")
    private Double money;
    @JsonProperty("content")
    private String content;

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

    public Double getMoney() {
        return money;
    }

    public void setMoney(Double money) {
        this.money = money;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }
}
