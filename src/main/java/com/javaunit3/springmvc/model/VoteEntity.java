package com.javaunit3.springmvc.model;


import javax.persistence.*;

@Entity
@Table(name = "votes")
public class VoteEntity {

    @Id
    @GeneratedValue
    private Integer id;

    @Column(name = "voterName")
    private String voterName;

    public VoteEntity() {
    }

    public VoteEntity(Integer id, String voterName) {
        this.id = id;
        this.voterName = voterName;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getVoterName() {
        return voterName;
    }

    public void setVoterName(String voterName) {
        this.voterName = voterName;
    }
}
