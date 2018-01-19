package com.JavaTests.dao.impl;

import com.JavaTests.dao.BasicDao;
import com.JavaTests.model.impl.TopicModelImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import java.sql.*;

@Component
public class BasicDaoImpl implements BasicDao {

    @Autowired
    TopicModelImpl topicModelImpl;

    public static void init() throws ClassNotFoundException {
        Class.forName("com.mysql.jdbc.Driver");
    }

    @Override
    public Connection getConnection() {
        Connection connection = null;
        Statement statement = null;
        ResultSet resultSet = null;
        try {
            init();
            connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/bdincubator", "root", "root");
        } catch (SQLException | ClassNotFoundException e) {
            e.printStackTrace();
        }
        return connection;
    }

}
