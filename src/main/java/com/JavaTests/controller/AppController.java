package com.JavaTests.controller;

import com.JavaTests.entity.Role;
import com.JavaTests.service.RoleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;


@Controller
public class AppController {

    @Autowired
    RoleService roleService;

    @RequestMapping("/")
    public String hello() {
        return "hello2";
    }

    @RequestMapping(value = "/role/{rolePeople}", method = RequestMethod.GET)
    @ResponseBody
    public Role getRole(@PathVariable(value = "rolePeople") String rolePeople) {
        return roleService.getRole(Integer.parseInt(rolePeople));
    }


}
