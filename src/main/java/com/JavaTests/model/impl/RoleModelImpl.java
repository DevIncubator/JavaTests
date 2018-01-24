package com.JavaTests.model.impl;

import com.JavaTests.dao.impl.BasicDaoImpl;
import com.JavaTests.entity.Role;
import com.JavaTests.model.RoleModel;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.sql.*;

@Component
public class RoleModelImpl implements RoleModel {

    private long user;
    private long admin;
    private long tutor;

    @Autowired
    BasicDaoImpl basicDaoImpl;

    public RoleModelImpl() {
    }

    @Override
    public String getRole() {
        basicDaoImpl.getConnection();
        String query = ("select * from role");
        RoleModelImpl role = new RoleModelImpl();
        Connection connection = null;
        Statement statement = null;
        ResultSet resultSet = null;
        try {
            connection = basicDaoImpl.getConnection();
            statement = connection.createStatement();
            resultSet = statement.executeQuery(query);
            while (resultSet.next()) {
                role.setUser(resultSet.getInt("user"));
                role.setTutor(resultSet.getInt("tutor"));
                role.setAdmin(resultSet.getInt("admin"));
            }
        } catch (SQLException e) {
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
        return role.getAdmin() + " " + role.getUser() + " " + getTutor();
    }

    @Override
    public String getRoleSave() {
        basicDaoImpl.getConnection();
        String query = ("select * from role");
        RoleModelImpl role = new RoleModelImpl();
        Connection connection = null;
        Statement statement = null;
        ResultSet resultSet = null;
        try {
            connection = basicDaoImpl.getConnection();
            statement = connection.createStatement();
            resultSet = statement.executeQuery(query);
            while (resultSet.next()) {
                role.setUser(resultSet.getInt("user"));
                role.setTutor(resultSet.getInt("tutor"));
                role.setAdmin(resultSet.getInt("admin"));
            }
        } catch (SQLException e) {
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
        return role.getAdmin() + " " + role.getUser() + " " + role.getTutor();
    }

    @Override
    public Role getRoleRest(Role role) {
        Role role2 = new Role();
        basicDaoImpl.getConnection();
        String query = ("SELECT * FROM role");
        Connection connection = null;
        Statement statement = null;
        ResultSet resultSet = null;
        try {
            connection = basicDaoImpl.getConnection();
            statement = connection.createStatement();
            resultSet = statement.executeQuery(query);
            while (resultSet.next()) {
                role2.setUser(resultSet.getInt("user"));
                role2.setTutor(resultSet.getInt("tutor"));
                role2.setAdmin(resultSet.getInt("admin"));
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
        return role2;
    }

    @Override
    public Role getRoleSaveRest(Role role) {
        Role role3 = new Role();
        basicDaoImpl.getConnection();
        String query = ("SELECT * FROM role");
        Connection connection = null;
        Statement statement = null;
        ResultSet resultSet = null;
        try {
            connection = basicDaoImpl.getConnection();
            statement = connection.createStatement();
            resultSet = statement.executeQuery(query);
            while (resultSet.next()) {
                role3.setUser(resultSet.getInt("user"));
                role3.setTutor(resultSet.getInt("tutor"));
                role3.setAdmin(resultSet.getInt("admin"));
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
        return role3;
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
