package com.ecore.juanruizappl.repos;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.ecore.juanruizappl.models.Membership;

@Repository
public interface MembershipRepo extends JpaRepository<Membership, Integer>{
    
    List<Membership> findAllByRole(String role);
}
