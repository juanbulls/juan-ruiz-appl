package com.ecore.juanruizappl.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ecore.juanruizappl.models.Membership;
import com.ecore.juanruizappl.repos.MembershipRepo;

@Service
public class MembershipServiceImpl implements IMembershipService{

    @Autowired
    MembershipRepo membershiprepo;

    @Override
    public List<Membership> getAll() {
        return membershiprepo.findAll();
    }

    @Override
    public Membership save(Membership membership) {
        return membershiprepo.save(membership);
    }

    @Override
    public Membership getById(Integer membershipid) {
        return membershiprepo.findById(membershipid).orElse(null);
    }
    
}
