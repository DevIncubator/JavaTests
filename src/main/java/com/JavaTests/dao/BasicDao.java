package com.JavaTests.dao;

import java.sql.Connection;

public interface BasicDao {
    /**
     * @return current connection BD
     **/
    Connection getConnection();

}