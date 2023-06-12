package com.management.clients.apirest.repository;

import java.util.ArrayList;
import java.util.List;

import com.management.clients.apirest.models.Client;

public class ClientsRepositoryImpl implements IClientsRepository {

	private List<Client> clients = new ArrayList<Client>();

	public ClientsRepositoryImpl() {

		clients.add(new Client("Juliana Gutierrez Galindo", "jgutierrez", "jgutierrez", "jgutierrez@gmail.com",
				"3219876543", "20/12/2024"));
		clients.add(new Client("Luisa Ramirez Gomez", "lramirez", "lramirez", "lramirez@gmail.com", "9876543210",
				"20/06/2021"));
		clients.add(new Client("Carlos Lopez Hernandez", "clopez", "clopez", "clopez@gmail.com", "4567890123",
				"21/12/2022"));
		clients.add(
				new Client("Juan Perez Rodriguez", "jperez", "jperez", "jperez@gmail.com", "2345678901", "20/12/2020"));
		clients.add(new Client("Maria Fernandez Martinez", "mfernandez", "mfernandez", "mfernandez@gmail.com",
				"8901234567", "22/12/2020"));
		clients.add(new Client("Andres Gonzalez Castro", "agonzalez", "agonzalez", "agonzalez@gmail.com", "6789012345",
				"20/12/2020"));
		clients.add(new Client("Laura Martinez Morales", "lmartinez", "lmartinez", "lmartinez@gmail.com", "3456789012",
				"20/06/2020"));
		clients.add(new Client("Diego Sanchez Gomez", "dsanchez", "dsanchez", "dsanchez@gmail.com", "0123456789",
				"20/05/2020"));
		clients.add(
				new Client("Ana Castro Ruiz", "acastro", "acastro", "acastro@gmail.com", "5678901234", "21/12/2021"));
		clients.add(new Client("Sofia Morales Herrera", "smorales", "smorales", "smorales@gmail.com", "7890123456",
				"20/10/2020"));

	}

	@Override
	public List<Client> findAll() {
		return clients;
	}

	@Override
	public Client findOne(String id) {

		for (Client client : clients) {

			if (client.getSharedKey().equals(id) == true) {
				return client;
			}
		}
		return null;

	}

}