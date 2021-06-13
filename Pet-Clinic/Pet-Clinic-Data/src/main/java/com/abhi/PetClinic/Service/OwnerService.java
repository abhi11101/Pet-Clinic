package com.abhi.PetClinic.Service;

import java.util.Set;

import com.abhi.PetClinic.Model.Owner;

public interface OwnerService extends CrudService<Owner, Long> {

	Owner findByLastName(String lastName);

}
