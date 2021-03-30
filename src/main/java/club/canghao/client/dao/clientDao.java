package club.canghao.client.dao;

import java.util.List;

import club.canghao.client.model.client;

public interface clientDao {

	//获取所有客户的信息
	public List<client> getAllClient();
	
	//添加客户信息
	int addClient(client client);
	
	//删除某个用户的信息
	int deleteClientById(int clientId);
	
	//按条件查询用户的信息
	public List<client> getClientByIdOrName(String key);
	
	//更新用户信息
	int updateClientById(client client);

}
