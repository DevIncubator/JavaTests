package com.JavaTests.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "question_statistic")
public class QuestionStatistic {

    @Id
    @Column(name = "questionId")
    private int questionId;
    @Column(name = "description")
    private String description;
    @Column(name = "count")
    private int count;
    @Column(name = "correct")
    private int correct;
    @Column(name = "incorrect")
    private int incorrect;

    public QuestionStatistic(){

    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public int getCount() {
        return count;
    }

    public void setCount(int count) {
        this.count = count;
    }

    public int getCorrect() {
        return correct;
    }

    public void setCorrect(int correct) {
        this.correct = correct;
    }

    public int getQuestionId() {
        return questionId;
    }

    public void setQuestionId(int questionId) {
        this.questionId = questionId;
    }

    public int getIncorrect() {
        return incorrect;
    }

    public void setIncorrect(int incorrect) {
        this.incorrect = incorrect;
    }
}
