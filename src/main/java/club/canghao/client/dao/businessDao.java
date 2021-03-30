package club.canghao.client.dao;

import java.util.List;

import club.canghao.client.model.business;

public interface businessDao {
	//添加新业务
	public int addBusiness(business business);
	
	//删除业务
	public int deleteBusinessById(int businessId);
	
	//修改业务
	public int updateBusinessById(business business);
	
	//查询所有业务
	public List<business> getAllBusiness();
	
	//条件查询某个业务
	public List<business> getBusinessByIdOrName(String key);
}
