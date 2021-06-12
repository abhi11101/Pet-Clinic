package com.abhi.PetClinic.Service;

import java.util.Set;

import com.abhi.PetClinic.Model.Pet;

public interface PetService {

	Pet findById(int id);

	Pet save(Pet pet);

	Set<Pet> findAll();
}
