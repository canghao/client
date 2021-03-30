package club.canghao.client.service;

import java.io.IOException;
import java.util.List;

import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;

import club.canghao.client.dao.adminDao;
import club.canghao.client.dao.businessDao;
import club.canghao.client.model.admin;
import club.canghao.client.model.business;
import club.canghao.client.utils.mybatisUtil;

public class adminService {
	private SqlSessionFactory sqlSessionFactory;
	
	
	public admin getAdmin(admin admin) throws IOException{
		admin admin1;
		sqlSessionFactory = mybatisUtil.getSqlSessionFactory();
		try (SqlSession session = sqlSessionFactory.openSession(true)) {
			adminDao mapper = session.getMapper(adminDao.class);
			admin1 = mapper.getAdmin(admin);
		}
		return admin1;
	}

	public int updatePassword(admin admin)throws IOException{
		int i=0;
		sqlSessionFactory = mybatisUtil.getSqlSessionFactory();
		try (SqlSession session = sqlSessionFactory.openSession(true)) {
			adminDao mapper = session.getMapper(adminDao.class);
			 i = mapper.updatePassword(admin);
		}
		return i;
	}
}
