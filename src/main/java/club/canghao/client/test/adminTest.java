package club.canghao.client.test;

import java.io.IOException;

import org.junit.Test;

import club.canghao.client.model.admin;
import club.canghao.client.service.adminService;

public class adminTest {
	
	@Test
	public void getAdmin() throws IOException {
		admin adminTest= new admin();
		adminTest.setUsername("canghao");
		adminTest.setPassword("123");
		adminService adminService = new adminService();
		admin admin = adminService.getAdmin(adminTest);
		System.out.println(admin);
	}
	@Test
	public void updatePassword() throws IOException {
		adminService adminService = new adminService();
		admin adminTest= new admin();
		adminTest.setUsername("canghaf");
		adminTest.setPassword("1234");
		int i = adminService.updatePassword(adminTest);
		System.out.println(i);
	}
}
