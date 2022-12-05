package com.ecore.juanruizappl.services;

import java.util.List;

import com.ecore.juanruizappl.models.Membership;

public interface IMembershipService {

    public List<Membership> getAll();

    public Membership save(Membership membership);

    public Membership getById(Integer membershipid);
    
}
