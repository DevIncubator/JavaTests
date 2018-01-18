/*
package com.JavaTests.service.impl;

import com.JavaTests.entity.Role;
import com.JavaTests.repository.RoleRepository;
import com.JavaTests.service.RoleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Component
public class RoleServiceImpl {

//    @Autowired
//    RoleDao roleDao;

    @Autowired
    RoleRepository roleRepository;

//    @Override
//    public Role getRole(int rolePeople) {
//        return roleDao.findByRole(rolePeople);
//    }

    public Role getRole (int id) {
        return roleRepository.findOne(id);
    }
}
*/
