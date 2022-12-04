package com.ecore.juanruizappl.repos;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.ecore.juanruizappl.models.Role;

@Repository
public interface RoleRepo  extends JpaRepository<Role, Integer> {
    
}
