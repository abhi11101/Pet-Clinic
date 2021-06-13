package com.abhi.PetClinic.Bootstrap;

import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import com.abhi.PetClinic.Model.Owner;
import com.abhi.PetClinic.Model.Vet;
import com.abhi.PetClinic.Service.OwnerService;
import com.abhi.PetClinic.Service.VetService;
import com.abhi.PetClinic.Service.map.OwnerServiceMap;
import com.abhi.PetClinic.Service.map.VetServiceMap;

@Component
public class DataLoader implements CommandLineRunner {

	private final OwnerService ownerService;
	private final VetService vetService;

	public DataLoader() {

		ownerService = new OwnerServiceMap();
		vetService = new VetServiceMap();
	}

	@Override
	public void run(String... args) throws Exception {

		Owner owner = new Owner();
		owner.setId(1l);
		owner.setFirstName("Abhi");
		owner.setLastName("Singh");
		ownerService.save(owner);

		Owner owner2 = new Owner();
		owner.setId(2l);
		owner.setFirstName("Abhi");
		owner.setLastName("Singh");
		ownerService.save(owner2);

		System.out.println("Owners Loaded..");

		Vet vet = new Vet();
		vet.setId(1L);
		vet.setFirstName("Tom");
		vet.setLastName("Hanks");
		vetService.save(vet);

		Vet vet2 = new Vet();
		vet.setId(2L);
		vet.setFirstName("Tom");
		vet.setLastName("Hanks");
		vetService.save(vet2);

		System.out.println("Vet Loaded...");
	}

}
