package com.management.clients.apirest.repository;

import java.util.List;

import com.management.clients.apirest.models.Client;

public interface IClientsRepository {

	public List<Client> findAll();

	public Client findOne(String id);

}