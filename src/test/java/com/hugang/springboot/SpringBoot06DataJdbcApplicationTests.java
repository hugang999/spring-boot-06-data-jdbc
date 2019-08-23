package com.hugang.springboot;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import javax.sql.DataSource;
import java.sql.Connection;
import java.sql.SQLException;

@RunWith(SpringRunner.class)
@SpringBootTest
public class SpringBoot06DataJdbcApplicationTests {

    @Autowired
    DataSource source;

    @Test
    public void contextLoads() throws SQLException {
        System.out.println("datasource.class--------------->" + source.getClass());
        Connection connection = source.getConnection();
        System.out.println("connection----------------->" + connection);
    }

}
