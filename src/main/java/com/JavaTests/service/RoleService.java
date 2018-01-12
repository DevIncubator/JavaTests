package com.JavaTests.service;

import com.JavaTests.entity.Role;

public interface RoleService {

    /**
         * Get role people
         * @param id - role people
         *  @return role people from BD
         */
    Role getRole(int id);
}
