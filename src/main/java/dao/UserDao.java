package dao;

import com.alibaba.druid.pool.DruidDataSourceFactory;
import domain.User;
import org.apache.commons.dbutils.QueryRunner;
import org.apache.commons.dbutils.handlers.BeanListHandler;

import javax.sql.DataSource;
import java.io.InputStream;
import java.util.List;
import java.util.Properties;

public class UserDao {
        public List<User> findAllUser() throws Exception {
            InputStream in = UserDao.class.getClassLoader().getResourceAsStream("druid.properties");
            Properties properties = new Properties();
            properties.load(in);
            DataSource ds = new DruidDataSourceFactory().createDataSource(properties);
            QueryRunner queryRunner = new QueryRunner(ds);
            List<User> list = queryRunner.query("select * from users", new BeanListHandler<User>(User.class));
            return list;
    }
}


