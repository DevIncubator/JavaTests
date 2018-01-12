package com.JavaTests.model.impl;

import com.JavaTests.model.RoleModel;
import org.springframework.stereotype.Component;

import java.sql.*;

@Component
public class RoleModelImpl implements RoleModel {

    private long user;
    private long admin;
    private long tutor;

    public RoleModelImpl() {
    }

    public static void init() throws ClassNotFoundException {
        Class.forName("com.mysql.jdbc.Driver");
    }

    @Override
    public String getRole() {
        String query = ("select * from role");
        RoleModelImpl role = new RoleModelImpl();
        Connection connection = null;
        Statement statement = null;
        ResultSet resultSet = null;
        try {
            init();
            connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/bdincubator", "root", "root");
            statement = connection.createStatement();
            resultSet = statement.executeQuery(query);
            while (resultSet.next()) {
                role.setUser(resultSet.getInt("user"));
                role.setTutor(resultSet.getInt("tutor"));
                role.setAdmin(resultSet.getInt("admin"));
            }
        } catch (SQLException | ClassNotFoundException e) {
            e.printStackTrace();
        } finally {
            if (resultSet != null)
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
        return getRole();
    }

    public long getUser() {
        return user;
    }

    public void setUser(long user) {
        this.user = user;
    }

    public long getAdmin() {
        return admin;
    }

    public void setAdmin(long admin) {
        this.admin = admin;
    }

    public long getTutor() {
        return tutor;
    }

    public void setTutor(long tutor) {
        this.tutor = tutor;
    }
}
