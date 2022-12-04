package com.ecore.juanruizappl.services;

import java.util.List;

import com.ecore.juanruizappl.models.Role;

public interface IRoleService {

    public List<Role> getAll();

    public Role save(Role role);

    public Role getById(Integer roleid);
    
}
