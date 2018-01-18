package com.JavaTests.controller;


import com.JavaTests.model.TopicModel;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;


@Controller
public class AppController {

//    @Autowired
//    Example example;

//    @Autowired
//    RoleModel roleModel;
//
//    @Autowired
//    TopicServiceImpl topicServiceImpl;

    @Autowired
    TopicModel topicModel;

    @RequestMapping("/")
    public String hello() {
        return "hello2";
    }

//    @RequestMapping(value = "/role/{rolePeople}", method = RequestMethod.GET)
//    @ResponseBody
//    public Role getRole(@PathVariable(value = "rolePeople") String rolePeople) {
//        return roleServiceImpl.getRole(Integer.parseInt(rolePeople));
//    }

/*    @RequestMapping(value = "/getRole/{id}", method = RequestMethod.GET, headers = "Accept=application/json")
    public Role getRole(@PathVariable int id) {
        return roleServiceImpl.getRole(id);
    }*/

//    @RequestMapping(value = "/getUsers/{id}", method = RequestMethod.GET, headers = "Accept=application/json")
//    public ArrayList<User> getRole(@PathVariable int id) {
//        System.out.println("User : " + id);
//        return (ArrayList<User>) example.getUsers();
//    }

//    @RequestMapping(value = "/getTheme/{id}", method = RequestMethod.GET, headers = "Accept=application/json")
//    public ArrayList<Topic> getTheme(@PathVariable int id) {
//        System.out.println("Theme : " + id);
//        return (ArrayList<Topic>) topicServiceImpl.getTheme();
//    }

//    @RequestMapping(value = "/getRole")
//    public String getRole(Model model) {
//        model.addAttribute("rolePeople", roleServiceImpl.getRole());
//        return "role";
//    }

    @RequestMapping(value = "/getTopic")
    public String getRole(Model model) {
        model.addAttribute("getTopic", topicModel.getTopic());
        return "topic";
    }



}
