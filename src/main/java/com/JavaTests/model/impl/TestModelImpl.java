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

    @Autowired
    BasicDaoImpl basicDaoImpl;

    public TestModelImpl() {
    }

    @Override
    public String getTest() {
        basicDaoImpl.getConnection();
        String query = ("SELECT * FROM test");
        TestModelImpl test = new TestModelImpl();
        Connection connection = null;
        Statement statement = null;
        ResultSet resultSet = null;

        try {
            connection = basicDaoImpl.getConnection();
            statement = connection.createStatement();
            resultSet = statement.executeQuery(query);
            while (resultSet.next()) {
                test.setName(resultSet.getString("name"));
                test.setDescription(resultSet.getString("description"));
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
        return test.getName() + " " + test.getDescription();
    }




    @Override
    public Test getTestRest(Test test) {
        Test test2 = new Test();
        basicDaoImpl.getConnection();
        String query = ("SELECT * FROM test");
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

    @Override
    public Test getTestSaveRest(Test test) {
        Test test3 = new Test();
        basicDaoImpl.getConnection();
        String query = ("SELECT * FROM test");
        Connection connection = null;
        Statement statement = null;
        ResultSet resultSet = null;
        try {
            connection = basicDaoImpl.getConnection();
            statement = connection.createStatement();
            resultSet = statement.executeQuery(query);
            while (resultSet.next()) {
                test3.setName(resultSet.getString("name"));
                test3.setDescription(resultSet.getString("description"));
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
        return test3;
    }

    @Override
    public String getTestSave() {
        basicDaoImpl.getConnection();
        String query = ("SELECT * FROM test");
        TestModelImpl test = new TestModelImpl();
        Connection connection = null;
        Statement statement = null;
        ResultSet resultSet = null;

        try {
            connection = basicDaoImpl.getConnection();
            statement = connection.createStatement();
            resultSet = statement.executeQuery(query);
            while (resultSet.next()) {
                test.setName(resultSet.getString("name"));
                test.setDescription(resultSet.getString("description"));
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
        return test.getName() + " " + test.getDescription();
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
