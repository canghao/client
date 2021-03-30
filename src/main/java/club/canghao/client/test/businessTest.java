package club.canghao.client.test;

import java.io.IOException;
import java.util.List;

import org.junit.Test;

import club.canghao.client.model.business;
import club.canghao.client.service.businessService;


public class businessTest {
	List<business> businesses;
	businessService businessService = new businessService();
	@Test
	public void getAllBusiness() throws IOException {
		
		businesses=businessService.getAllBusiness();
		System.out.println(businesses);
	}
	@Test
	public void addBusiness() throws IOException {
		business business = new business();
		business.setBusinessName("业务二");
		int i = businessService.addBusiness(business);
		System.out.println(i);
	}
	@Test
	public void getClientByIdOrName() throws IOException {
		businesses=businessService.getBusinessByIdOrName("10");
		System.out.println(businesses);
	}
	@Test
	public void updateBusinessById() throws IOException {
		business business = new business();
		business.setBusinessId(1);
		business.setBusinessName("business01");
		int i=businessService.updateBusinessById(business);
		System.out.println(i);
	}
	
	@Test
	public void deleteBusinessById() throws IOException {
		int i=businessService.deleteBusinessById(2);
		System.out.println(i);
	}
}
