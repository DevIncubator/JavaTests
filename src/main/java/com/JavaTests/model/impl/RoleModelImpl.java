package com.JavaTests.model.impl;

import com.JavaTests.model.RoleModel;
import org.springframework.stereotype.Component;

@Component
public class RoleModelImpl implements RoleModel {

    private long user;
    private long admin;
    private long tutor;

    public RoleModelImpl() {
    }

    @Override
    public String getRole() {

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
