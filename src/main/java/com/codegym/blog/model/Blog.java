package com.codegym.blog.model;

import javax.persistence.*;

@Entity
@Table(name = "blogs")
public class Blog {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String yourName;
    private String yourContent;

    public Blog() {
    }

    public Blog(Long id, String yourName, String yourContent) {
        this.id = id;
        this.yourName = yourName;
        this.yourContent = yourContent;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getYourName() {
        return yourName;
    }

    public void setYourName(String yourName) {
        this.yourName = yourName;
    }

    public String getYourContent() {
        return yourContent;
    }

    public void setYourContent(String yourContent) {
        this.yourContent = yourContent;
    }
}
