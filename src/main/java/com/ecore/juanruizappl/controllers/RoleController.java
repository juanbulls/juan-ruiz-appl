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

import com.ecore.juanruizappl.models.Role;
import com.ecore.juanruizappl.services.RoleServiceImpl;

import java.util.List;

@RestController
@RequestMapping("/api")
public class RoleController {
    
    @Autowired
    RoleServiceImpl rolservice;

    @GetMapping("/roles")
    public List<Role> getRoles() {
        return rolservice.getAll();
    }

    @PostMapping("/roles")
    public ResponseEntity<Role> saveRole(@RequestBody Role role) {
        Role new_role = rolservice.save(role);
        return new ResponseEntity<>(new_role, HttpStatus.CREATED);
    }

    @GetMapping("/roles/{id}")
    public ResponseEntity<Role> getRoleId(@PathVariable Integer id) {
        Role roleById = rolservice.getById(id);

        return ResponseEntity.ok(roleById);
    }

    @PutMapping("/roles/{id}")
    public ResponseEntity<Role> update(@PathVariable Integer id, @RequestBody Role role) {
        Role roleById = rolservice.getById(id);
        roleById.setRole(role.getRole());

        Role updated_rol = rolservice.save(roleById);
        return new ResponseEntity<>(updated_rol, HttpStatus.CREATED);
    }
    
}
