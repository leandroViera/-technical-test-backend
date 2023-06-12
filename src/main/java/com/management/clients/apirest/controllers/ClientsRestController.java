package com.management.clients.apirest.controllers;

import java.util.ArrayList;
import java.util.List;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.management.clients.apirest.models.Client;
import com.management.clients.apirest.services.ClientsServiceImpl;

@CrossOrigin(origins = { "http://localhost:4200" })
@RestController
@RequestMapping("/api")
public class ClientsRestController {

	private ClientsServiceImpl clientsServiceImpl;

	public ClientsRestController(ClientsServiceImpl clientsServiceImpl) {
		this.clientsServiceImpl = clientsServiceImpl;
	}

	@GetMapping("/clients")
	public List<Client> index() {
		return clientsServiceImpl.findAll();

	}

	@GetMapping("/clients/{id}")
	public List<Client> findOne(@PathVariable String id) {
		List<Client> client = new ArrayList<Client>();
		client.add(clientsServiceImpl.findOne(id));
		return client;
	}

}
