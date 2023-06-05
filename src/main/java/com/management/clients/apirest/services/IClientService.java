package com.management.clients.apirest.services;

import java.util.List;

import ch.qos.logback.core.net.server.Client;

public interface IClientService {
	
	public List<Client> findAll();

}
