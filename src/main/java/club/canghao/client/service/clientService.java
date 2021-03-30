package club.canghao.client.service;

import java.io.IOException;
import java.util.List;

import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;

import club.canghao.client.dao.clientDao;
import club.canghao.client.model.client;
import club.canghao.client.utils.mybatisUtil;


public class clientService {
	private SqlSessionFactory sqlSessionFactory;
	public List<client> getAllClient() throws IOException{
		List<client> clients;
		sqlSessionFactory = mybatisUtil.getSqlSessionFactory();
		try (SqlSession session = sqlSessionFactory.openSession(true)) {
			 clientDao mapper = session.getMapper(clientDao.class);
			 clients = mapper.getAllClient();
		}
		return clients;
	}
	
	public List<client> getClientByIdOrName(String key) throws IOException{
		List<client> clients;
		sqlSessionFactory = mybatisUtil.getSqlSessionFactory();
		try (SqlSession session = sqlSessionFactory.openSession(true)) {
			 clientDao mapper = session.getMapper(clientDao.class);
			 clients = mapper.getClientByIdOrName(key);
		}
		return clients;
	}
	
	public int addClient(client client)throws IOException{
		int i=0;
		sqlSessionFactory = mybatisUtil.getSqlSessionFactory();
		try (SqlSession session = sqlSessionFactory.openSession(true)) {
			 clientDao mapper = session.getMapper(clientDao.class);
			 i = mapper.addClient(client);
		}
		return i;
	}
	
	public int deleteClientById(int clientId)throws IOException{
		int i=0;
		sqlSessionFactory = mybatisUtil.getSqlSessionFactory();
		try (SqlSession session = sqlSessionFactory.openSession(true)) {
			 clientDao mapper = session.getMapper(clientDao.class);
			 i = mapper.deleteClientById(clientId);
		}
		return i;
	}
	
	public int updateClientById(client client)throws IOException{
		int i=0;
		sqlSessionFactory = mybatisUtil.getSqlSessionFactory();
		try (SqlSession session = sqlSessionFactory.openSession(true)) {
			 clientDao mapper = session.getMapper(clientDao.class);
			 i = mapper.updateClientById(client);
		}
		return i;
	}
}
