package club.canghao.client.dao;

import club.canghao.client.model.admin;

public interface adminDao {

	//管理员修改密码
	public int updatePassword(admin admin);
	
	//查询管理员账号和密码
	public admin getAdmin(admin admin);
}
