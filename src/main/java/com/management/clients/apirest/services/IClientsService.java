package com.management.clients.apirest.services;

import com.management.clients.apirest.models.Client;
import java.util.List;



public interface IClientsService {

	public List<Client> findAll();

	public Client findOne(String id);

}
