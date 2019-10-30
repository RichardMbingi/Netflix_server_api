package com.netflix.server_api.model;

import com.fasterxml.jackson.annotation.JsonIgnore;
import org.hibernate.annotations.GenericGenerator;

import javax.persistence.*;
import javax.validation.constraints.NotNull;
import java.util.Set;

@Entity
@Table(name = "movies")
public class Movies {

    @Id
    @GeneratedValue(
            strategy= GenerationType.AUTO,
            generator="native"
    )
    @GenericGenerator(
            name = "native",
            strategy = "native"
    )
    @NotNull(groups = Update.class)
    @Column(name = "id")
    private Long id;

    @Column(name = "name")
    @NotNull(groups = Create.class)
    private String name;

    @ManyToOne
    @JsonIgnore
    @JoinColumn(name="type_id")
    private Type type;

    @ManyToOne
    @JsonIgnore
    @JoinColumn(name="category_id")
    private MovieClass movieClass;

    @ManyToOne
    @JsonIgnore
    @JoinColumn(name="owner_id")
    private User user;

    @ManyToMany(mappedBy = "movieSet")
    Set<MovieClass> movieClassSet;


    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public MovieClass getMovieClass() {
        return movieClass;
    }

    public void setMovieClass(MovieClass movieClass) {
        this.movieClass = movieClass;
    }

    public Type getType() {
        return type;
    }

    public void setType(Type type) {
        this.type = type;
    }


    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    public Movies(String name, String actor, Type type, MovieClass movieClass, User user) {
        this.name = name;
        this.type = type;
        this.movieClass = movieClass;
        this.user = user;
    }

    public Movies(){}

    public interface Create{}
    public interface  Update{}

}