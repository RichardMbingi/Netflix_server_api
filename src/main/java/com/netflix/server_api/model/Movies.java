package com.netflix.server_api.model;

import javax.persistence.*;
import javax.validation.constraints.NotNull;

@Entity
@Table(name = "Movies")

public class Movies {
    @Column(name = "movie_name")
    @NotNull
    private String movie_name;

    @Id
    @GeneratedValue
    private long movie_id;

    @Column(name = "type")
    @NotNull
    private String type;

    public Movies(@NotNull String movie_name, @NotNull String type) {
        this.movie_name = movie_name;
        this.type = type;
    }

    public String getMovie_name() {
        return movie_name;
    }

    public void setMovie_name(String movie_name) {
        this.movie_name = movie_name;
    }

    public long getId() {
        return movie_id;
    }

    public void setId(long movie_id) {
        this.movie_id = movie_id;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }
}
