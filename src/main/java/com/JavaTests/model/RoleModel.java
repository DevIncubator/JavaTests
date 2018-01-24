package com.JavaTests.model;

import com.JavaTests.entity.Role;

public interface RoleModel {
    String getRole();

    String getRoleSave();

    Role getRoleRest(Role role);

    Role getRoleSaveRest(Role role);
}
