package com.JavaTests.dao;

import com.JavaTests.entity.Role;

public interface RoleDao {

    /**
         * Find people by role
         *  @param rolePeople - role people from BD
         *  @return current role people
         */
    Role findByRole(int rolePeople);
}
