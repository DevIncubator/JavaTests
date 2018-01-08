package com.JavaTests.entity;

import javax.persistence.*;

@Entity
@Table(name = "link")
public class Link {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    @Column(name = "link")
    private String link;

    @Column(name = "literatureId")
    private int literatureId;

    public Link() {
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getLink() {
        return link;
    }

    public void setLink(String link) {
        this.link = link;
    }

    public int getLiteratureId() {
        return literatureId;
    }

    public void setLiteratureId(int literatureId) {
        this.literatureId = literatureId;
    }
}
