package com.JavaTests.model.impl;

import com.JavaTests.dao.impl.BasicDaoImpl;
import com.JavaTests.entity.Test;
import com.JavaTests.model.TestModel;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

@Component
public class TestModelImpl implements TestModel{

    private String name;
    private String description;

//    Test2 test2 = new Test2();

    @Autowired
    BasicDaoImpl basicDaoImpl;

    public TestModelImpl() {
    }

//    public static void init() throws ClassNotFoundException {
//        Class.forName("com.mysql.jdbc.Driver");
//    }

    @Override
    public Test getTest() {
        Test test2 = new Test();
        basicDaoImpl.getConnection();
        String query = ("SELECT * FROM test");
//        TestModelImpl test = new TestModelImpl();
        Connection connection = null;
        Statement statement = null;
        ResultSet resultSet = null;
        try {
            connection = basicDaoImpl.getConnection();
            statement = connection.createStatement();
            resultSet = statement.executeQuery(query);
            while (resultSet.next()) {
                test2.setName(resultSet.getString("name"));
                test2.setDescription(resultSet.getString("description"));
                 }
        } catch (SQLException e) {
            e.printStackTrace();
        } finally {
            if (resultSet != null) {
                try {
                    resultSet.close();
                } catch (SQLException ignore) {
                }
                if (statement != null)
                    try {
                        statement.close();
                    } catch (SQLException ignore) {
                    }
                if (connection != null)
                    try {
                        connection.close();
                    } catch (SQLException ignore) {
                    }
            }
        }

        return test2;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }
}
