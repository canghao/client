package club.canghao.client.service;

import java.io.IOException;
import java.util.List;

import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import club.canghao.client.dao.client_businessDao;
import club.canghao.client.model.client_business;
import club.canghao.client.utils.mybatisUtil;

public class client_businessService {
	private SqlSessionFactory sqlSessionFactory;
	public int add(List<client_business> list)throws IOException{
		int i=0;
		sqlSessionFactory = mybatisUtil.getSqlSessionFactory();
		try (SqlSession session = sqlSessionFactory.openSession(true)) {
			 client_businessDao mapper = session.getMapper(client_businessDao.class);
			 i = mapper.add(list);
		}
		return i;
	}
}
