package com.JavaTests.entity;

import javax.persistence.*;
import java.util.HashSet;
import java.util.Set;

@Entity
@Table(name = "question")
public class Question {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    @Column(name = "description")
    private String description;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "testId")
    private Test test;

    @OneToMany(mappedBy = "question", fetch = FetchType.LAZY)
    private Set<Literature> listLiterature = new HashSet<>();

    @OneToMany(mappedBy = "quest", fetch = FetchType.LAZY)
    private Set<Answer> listAnswer = new HashSet<>();

    @OneToMany(mappedBy = "question", fetch = FetchType.LAZY)
    private Set<Statistic> listStatistics = new HashSet<>();

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

    public Test getTest() {
        return test;
    }

    public void setTest(Test test) {
        this.test = test;
    }

    public Set<Literature> getListLiterature() {
        return listLiterature;
    }

    public void setListLiterature(Set<Literature> listQuestion) {
        this.listLiterature = listQuestion;
    }

    public Set<Answer> getListAnswer() {
        return listAnswer;
    }

    public void setListAnswer(Set<Answer> listAnswer) {
        this.listAnswer = listAnswer;
    }

    public Set<Statistic> getListStatistics() {
        return listStatistics;
    }

    public void setListStatistics(Set<Statistic> listStatistics) {
        this.listStatistics = listStatistics;
    }
}
