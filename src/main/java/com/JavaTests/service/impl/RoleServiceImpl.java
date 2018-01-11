package com.JavaTests.service.impl;

import com.JavaTests.dao.RoleDao;
import com.JavaTests.entity.Role;
import com.JavaTests.service.RoleService;
import org.springframework.beans.factory.annotation.Autowired;

public class RoleServiceImpl implements RoleService {

    @Autowired
    RoleDao roleDao;

    @Override
    public Role getRole(int rolePeople) {
        return roleDao.findByRole(rolePeople);
    }
}
