package com.mahdi.flyway.model;

import javax.persistence.*;
import java.util.Date;

@Table(name = "author")
@Entity
public class Author{

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "id", nullable = false)
    private Long id;

    @Column(unique = true, length = 100, nullable = false)
    private String name;

    @Column(length = 100, nullable = false)
    private String password;

    @Column(nullable = false, columnDefinition = "tinyint not null default 0")
    private boolean enabled;

    @Column(updatable = false)
    private Date createdAt;

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

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public boolean isEnabled() {
        return enabled;
    }

    public void setEnabled(boolean enabled) {
        this.enabled = enabled;
    }

    public Date getCreatedAt() {
        return createdAt;
    }

    public void setCreatedAt(Date createdAt) {
        this.createdAt = createdAt;
    }
}
