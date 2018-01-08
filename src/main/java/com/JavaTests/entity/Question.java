package com.JavaTests.entity;

import javax.persistence.*;

@Entity
@Table(name = "question")
public class Question {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    @Column(name = "description")
    private String description;

    @Column(name = "testid")
    private int testid;

    public Question() {
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public int getTestid() {
        return testid;
    }

    public void setTestid(int testid) {
        this.testid = testid;
    }
}
