package com.ecore.juanruizappl.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ecore.juanruizappl.models.Role;
import com.ecore.juanruizappl.repos.RoleRepo;

@Service
public class RoleServiceImpl implements IRoleService {

    @Autowired
    RoleRepo rolerepo;

    @Override
    public List<Role> getAll() {
        return rolerepo.findAll();
    }

    @Override
    public Role save(Role role) {
        return rolerepo.save(role);
    }

    @Override
    public Role getById(Integer roleid) {
        return rolerepo.findById(roleid).orElse(null);
    }
    
}
