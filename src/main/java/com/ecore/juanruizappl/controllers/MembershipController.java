package com.ecore.juanruizappl.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.ecore.juanruizappl.models.Membership;
import com.ecore.juanruizappl.services.MembershipServiceImpl;

import java.util.List;


@RestController
@RequestMapping("/api")
public class MembershipController {
        
    @Autowired
    MembershipServiceImpl membershipservice;

    @GetMapping("/memberships")
    public List<Membership> getMemberships() {
        return membershipservice.getAll();
    }

    @PostMapping("/memberships")
    public ResponseEntity<Membership> saveMembership(@RequestBody Membership membership) {
        Membership new_membership = membershipservice.save(membership);
        return new ResponseEntity<>(new_membership, HttpStatus.CREATED);
    }

    @GetMapping("/memberships/{id}")
    public ResponseEntity<Membership> getMembershipId(@PathVariable Integer id) {
        Membership membershipById = membershipservice.getById(id);

        return ResponseEntity.ok(membershipById);
    }

    @PutMapping("/memberships/{id}")
    public ResponseEntity<Membership> update(@PathVariable Integer id, @RequestBody Membership membership) {
        Membership membershipById = membershipservice.getById(id);
        membershipById.setUser(membership.getUser());
        membershipById.setTeam(membership.getTeam());
        membershipById.setRole(membership.getRole());

        Membership updated_rol = membershipservice.save(membershipById);
        return new ResponseEntity<>(updated_rol, HttpStatus.CREATED);
    }

    @GetMapping("role-memberships/{role}")
    public List<Membership> getMembershipsByRole(@PathVariable String role) {
        return membershipservice.getMembershipsByRole(role);
    }
    
}
