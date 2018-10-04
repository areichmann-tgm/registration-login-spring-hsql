package com.hellokoding.auth.model;

import org.hibernate.validator.constraints.Email;

import javax.persistence.*;
import javax.validation.constraints.NotNull;
import java.util.Set;

@Entity
@Table(name = "role")
public class Role {
    private Long id;
    private String name;
    private Set<User> users;
    private String benutzername;

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    @Email
    @NotNull
    public String getName() {
        return name;
    }

    @Email
    @NotNull
    public void setName(String name) {
        this.name = name;
    }



    @ManyToMany(mappedBy = "roles")
    public Set<User> getUsers() {
        return users;
    }

    public void setUsers(Set<User> users) {
        this.users = users;
    }

    public String getBenutzername() {
        return benutzername;
    }


    public void setBenutzername(String benutzername) {
        this.benutzername = benutzername;
    }
}
