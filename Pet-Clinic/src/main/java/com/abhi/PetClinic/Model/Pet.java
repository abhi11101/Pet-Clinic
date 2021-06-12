package com.abhi.PetClinic.Model;

import java.time.LocalDate;

public class Pet {

	private PetType petType;
	private Owner owener;
	private LocalDate birthDate;

	public PetType getPetType() {
		return petType;
	}

	public void setPetType(PetType petType) {
		this.petType = petType;
	}

	public Owner getOwener() {
		return owener;
	}

	public void setOwener(Owner owener) {
		this.owener = owener;
	}

	public LocalDate getBirthDate() {
		return birthDate;
	}

	public void setBirthDate(LocalDate birthDate) {
		this.birthDate = birthDate;
	}

}
