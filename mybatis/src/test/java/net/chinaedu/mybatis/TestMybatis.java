package net.chinaedu.mybatis;

import net.chinaedu.mybatis.dao.UserMapper;
import net.chinaedu.mybatis.model.User;
import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.junit.Before;
import org.junit.Test;

import java.io.IOException;
import java.io.Reader;


/**
 * Created by chenxuan on 2016/9/28.
 */
public class TestMybatis {

    private SqlSessionFactory factory;

    @Before
    public void before() throws IOException {
        String resource = "mybatis-config.xml";
        Reader reader = Resources.getResourceAsReader(resource);
        factory = new SqlSessionFactoryBuilder().build(reader);
    }

    @Test
    public void testInsert() {
        User u = new User("chenxuan", "123", 20);
        SqlSession session = factory.openSession();
        UserMapper mapper = session.getMapper(UserMapper.class);
        mapper.insertUser(u);
    }

    @Test
    public void updateUser() {
        User newU = new User(1, "cxa", "345", 30);
        SqlSession session = factory.openSession();
        UserMapper mapper = session.getMapper(UserMapper.class);
        mapper.updateUser(newU);
    }

    @Test
    public void deleteUser() {
        SqlSession session = factory.openSession();
        UserMapper mapper = session.getMapper(UserMapper.class);
        mapper.removeUser(1);
    }

    @Test
    public void testSelect() {
        SqlSession session = factory.openSession();
        UserMapper mapper = session.getMapper(UserMapper.class);
        User u = mapper.getUser(1);
        System.out.println(u);
    }


}
