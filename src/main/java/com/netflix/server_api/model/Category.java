package com.netflix.server_api.model;

import javax.persistence.*;
import javax.validation.constraints.NotNull;

@Entity
@Table(name = "Category")

public class Category {
    @Column(name = "category_name")
    @NotNull
    private String category_name;

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;

    public Category(@NotNull String category_name) {
        this.category_name = category_name;
    }

    public String getCategory_name() {
        return category_name;
    }

    public void setCategory_name(String category_name) {
        this.category_name = category_name;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }
}
