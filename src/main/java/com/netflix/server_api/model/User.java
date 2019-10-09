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
    private long user_id;

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
        return user_id;
    }

    public void setId(long user_id) {
        this.user_id = user_id;
    }

}
