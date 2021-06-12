package com.abhi.PetClinic.Service;

import java.util.Set;

import com.abhi.PetClinic.Model.Owner;

public interface OwnerService {

	Owner findByLastName(String lastName);

	Owner findById(int id);

	Owner save(Owner owner);

	Set<Owner> findAll();

}
