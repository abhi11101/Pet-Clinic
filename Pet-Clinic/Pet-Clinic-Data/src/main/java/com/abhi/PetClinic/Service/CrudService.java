package com.abhi.PetClinic.Service;

import java.util.Set;

public interface CrudService<T, ID> {

	Set<T> findAll();

	T findById(Long id);

	T save(T object);

	void delete(T object);

	void deleteById(Long id);

}
