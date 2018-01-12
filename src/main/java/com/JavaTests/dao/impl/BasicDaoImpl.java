package com.JavaTests.dao.impl;

import com.JavaTests.dao.BasicDao;
import org.springframework.context.annotation.Bean;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class BasicDaoImpl implements BasicDao {

    public static void init() throws ClassNotFoundException {
        Class.forName("com.mysql.jdbc.Driver");
    }

    @Override
    public Connection getConnection() {
        Connection connection = null;
        Statement statement = null;
        try {
            init();
            connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/jdeath", "root", "root");
            statement = connection.createStatement();
        } catch (SQLException | ClassNotFoundException e) {
            e.printStackTrace();
        }
        return getConnection();
    }

}
