package com.ecore.juanruizappl.models;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Membership implements Serializable {

    private static final long serialVersionUID = 1L;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer membershipid;
    private String user;
    private String team;
    private String role;

    public Membership() {

    }

    public Integer getMembershipId() { return membershipid; }
    public void setMembershipId(Integer membershipid) { this.membershipid = membershipid; }

    public String getUser() { return user; }
    public void setUser(String user) { this.user = user; }

    public String getTeam() { return team; }
    public void setTeam(String team) { this.team = team; }

    public String getRole() { return role; }
    public void setRole(String role) { this.role = role; }
    
}
