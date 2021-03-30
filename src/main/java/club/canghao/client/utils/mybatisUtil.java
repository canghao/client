package club.canghao.client.utils;


import java.io.IOException;
import java.io.InputStream;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

public class mybatisUtil {
		public static SqlSessionFactory getSqlSessionFactory() throws IOException {
			String resource = "conf.xml";
			InputStream is = mybatisUtil.class.getClassLoader().getResourceAsStream(resource);
			SqlSessionFactory sessionFactory = new SqlSessionFactoryBuilder().build(is);
			return sessionFactory;
		}
}
