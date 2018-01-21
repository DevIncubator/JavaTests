package com.JavaTests.controller;


import com.JavaTests.entity.Test;
import com.JavaTests.model.TestModel;
import com.JavaTests.model.TopicModel;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;


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

    @Autowired
    TestModel testModel;

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
    public String getTopic(Model model) {
        model.addAttribute("getTopic", topicModel.getTopic());
        return "topic";
    }

    @RequestMapping(value = "/getTest")
    public String getTest(Model model) {
        model.addAttribute("getTest", testModel.getTest());
        return "test";
    }

    @RequestMapping(value = "/getTopicSave")
    public String save(Model model) {
        model.addAttribute("save", topicModel.getTopicSave());
        return "topicSave";
    }




    @RequestMapping(value = "/getTestRest", method = RequestMethod.POST, headers = "Accept=application/json")
    public Test getTest() {
        return testModel.getTest();
    }


}
