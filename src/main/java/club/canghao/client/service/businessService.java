package club.canghao.client.service;

import java.io.IOException;
import java.util.List;

import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;

import club.canghao.client.dao.businessDao;
import club.canghao.client.dao.clientDao;
import club.canghao.client.model.business;
import club.canghao.client.model.client;
import club.canghao.client.utils.mybatisUtil;

public class businessService {
	private SqlSessionFactory sqlSessionFactory;
	public List<business> getAllBusiness() throws IOException{
		List<business> business;
		sqlSessionFactory = mybatisUtil.getSqlSessionFactory();
		try (SqlSession session = sqlSessionFactory.openSession(true)) {
			 businessDao mapper = session.getMapper(businessDao.class);
			 business = mapper.getAllBusiness();
		}
		return business;
	}
	
	public List<business> getBusinessByIdOrName(String key) throws IOException{
		List<business> business;
		sqlSessionFactory = mybatisUtil.getSqlSessionFactory();
		try (SqlSession session = sqlSessionFactory.openSession(true)) {
			businessDao mapper = session.getMapper(businessDao.class);
			business = mapper.getBusinessByIdOrName(key);
		}
		return business;
	}
	
	public int addBusiness(business business)throws IOException{
		int i=0;
		sqlSessionFactory = mybatisUtil.getSqlSessionFactory();
		try (SqlSession session = sqlSessionFactory.openSession(true)) {
			businessDao mapper = session.getMapper(businessDao.class);
			 i = mapper.addBusiness(business);
		}
		return i;
	}
	
	public int deleteBusinessById(int businessId)throws IOException{
		int i=0;
		sqlSessionFactory = mybatisUtil.getSqlSessionFactory();
		try (SqlSession session = sqlSessionFactory.openSession(true)) {
			businessDao mapper = session.getMapper(businessDao.class);
			 i = mapper.deleteBusinessById(businessId);
		}
		return i;
	}
	
	public int updateBusinessById(business business)throws IOException{
		int i=0;
		sqlSessionFactory = mybatisUtil.getSqlSessionFactory();
		try (SqlSession session = sqlSessionFactory.openSession(true)) {
			businessDao mapper = session.getMapper(businessDao.class);
			 i = mapper.updateBusinessById(business);
		}
		return i;
	}
}
