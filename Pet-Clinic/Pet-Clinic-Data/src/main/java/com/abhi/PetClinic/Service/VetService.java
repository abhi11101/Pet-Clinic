package com.abhi.PetClinic.Service;

import java.util.Set;

import com.abhi.PetClinic.Model.Vet;

public interface VetService {

	Vet findById(int id);

	Vet save(Vet pet);

	Set<Vet> findAll();
}
