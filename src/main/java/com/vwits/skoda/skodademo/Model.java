package com.vwits.skoda.skodademo;

import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
@Component
// to create object

@Entity

@Table(name="Employee")
public class Model {
    @Id
    @GeneratedValue(strategy= GenerationType.IDENTITY)
    private long id;


    @Column(name="emp_name")
    private String name;

  public Model()
  {
  }

    public Model(long id, String name) {
        super();
        this.id = id;
        this.name = name;
    }

    public void setId(int id) {
        this.id = id;
    }

    public long getId() {
        return id;
    }


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Id "+id+"Name"+name;
    }
}
