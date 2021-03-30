package club.canghao.client.test;

import java.io.IOException;
import java.util.List;

import org.junit.Test;

import club.canghao.client.model.client;
import club.canghao.client.service.clientService;

public class clientTest {
	List<client> clients;
	@Test
	public void getAllClient() throws IOException {
		
		clientService clientService = new clientService();
		clients=clientService.getAllClient();
		System.out.println(clients);
	}
	@Test
	public void addClient() throws IOException {
		client client=new client();
		client.setClientAge("20");
		client.setClientName("canghao");
		clientService clientService = new clientService();
		int i = clientService.addClient(client);
		System.out.println(client.getClientId());
		System.out.println(i);
	}
	@Test
	public void getClientByIdOrName() throws IOException {
		clientService clientService = new clientService();
		clients = clientService.getClientByIdOrName("20200056");
		System.out.println(clients);
	}
	@Test
	public void updateClientById() throws IOException {
		client client=new client();
		client.setClientId(20200000);
		client.setClientAge("1000");
		client.setClientName("仓浩");
		clientService clientService = new clientService();
		int i = clientService.updateClientById(client);
		System.out.println(i);
	}
	
	@Test
	public void deleteClientById() throws IOException {
		clientService clientService = new clientService();
		int i = clientService.deleteClientById(20120027);
		System.out.println(i);
	}
}
