package com.JavaTests.controller;


import com.JavaTests.entity.Role;
import com.JavaTests.entity.Test;
import com.JavaTests.entity.Topic;
import com.JavaTests.model.RoleModel;
import com.JavaTests.model.TestModel;
import com.JavaTests.model.TopicModel;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestBody;
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

    @Autowired
    RoleModel roleModel;

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
    public String topicSave(Model model) {
        model.addAttribute("topicSave", topicModel.getTopicSave());
        return "topicSave";
    }

    @RequestMapping(value = "/getTestSave")
    public String testSave(Model model) {
        model.addAttribute("testSave", testModel.getTestSave());
        return "testSave";
    }

    @RequestMapping(value = "/getRole")
    public String getRole(Model model) {
        model.addAttribute("getRole", roleModel.getRole());
        return "role";
    }

    @RequestMapping(value = "/getRoleSave")
    public String roleSave(Model model) {
        model.addAttribute("roleSave", roleModel.getRoleSave());
        return "roleSave";
    }

    @RequestMapping(value = "/getTestRest", method = RequestMethod.POST, produces = "application/json;charset=UTF-8")
    @ResponseBody
    public Test getTest(@RequestBody Test test) {
        testModel.getTestRest(test);
        return test;
    }

    @RequestMapping(value = "/getTopicRest", method = RequestMethod.POST, produces = "application/json;charset=UTF-8")
    @ResponseBody
    public Topic getTopic(@RequestBody Topic topic) {
        topicModel.getTopicRest(topic);
        return topic;
    }

    @RequestMapping(value = "/getRoleRest", method = RequestMethod.POST, produces = "application/json;charset=UTF-8")
    @ResponseBody
    public Role getRole(@RequestBody Role role) {
        roleModel.getRoleRest(role);
        return role;
    }

}
