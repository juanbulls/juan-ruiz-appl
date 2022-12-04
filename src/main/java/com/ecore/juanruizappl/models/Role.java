package com.ecore.juanruizappl.models;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Role implements Serializable{
    
    private static final long serialVersionUID = 1L;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer roleid;

    private String role;

    public Role() {

    }

    public Integer getRoleId() { return roleid; }
    public void setRoleId(Integer roleid) { this.roleid = roleid; }

    public String getRole() { return role; }
    public void setRole(String role) { this.role = role; }
}
