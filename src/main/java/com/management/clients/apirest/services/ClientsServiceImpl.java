package com.management.clients.apirest.services;

import java.util.List;

import org.springframework.stereotype.Service;

import com.management.clients.apirest.repository.ClientsRepositoryImpl;

import com.management.clients.apirest.models.Client;

@Service
public class ClientsServiceImpl implements IClientsService {

	@Override
	public List<Client> findAll() {
		return new ClientsRepositoryImpl().findAll();
	}

	@Override
	public Client findOne(String id) {
		return new ClientsRepositoryImpl().findOne(id);
	}

}
