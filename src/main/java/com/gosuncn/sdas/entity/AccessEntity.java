package com.gosuncn.sdas.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "tb_access")
public class AccessEntity {

    @Id
    long id=0;
    @Column(name="name")
    String name="";

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }
}
