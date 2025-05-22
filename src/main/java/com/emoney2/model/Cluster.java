package com.emoney2.model;


import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table
public class Cluster  {
    @Id
    private Long id;



    public void setId(Long id) {
        this.id = id;
    }

    public Long getId() {
        return id;
    }
}
