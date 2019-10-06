package com.netflix.server_api.model;

import javax.persistence.*;
import javax.validation.constraints.NotNull;

@Entity
@Table(name = "User")

public class User {
    @Column(name = "user_name")
    @NotNull
    private String user_name;

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;

    public User(@NotNull String user_name) {
        this.user_name = user_name;
    }

    public String getUser_name() {
        return user_name;
    }

    public void setUser_name(String user_name) {
        this.user_name = user_name;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

}
