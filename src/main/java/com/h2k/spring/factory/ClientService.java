package com.h2k.spring.factory;

public class ClientService {
	
	private static ClientService clientService = new ClientService();
	
	private ClientService() {
		System.out.println("Creating ClientService Singleton Object");
	}
	
	public static ClientService getInstance() {
		System.out.println("Calling ClientService getInstance ");
		return clientService;
	}

}
