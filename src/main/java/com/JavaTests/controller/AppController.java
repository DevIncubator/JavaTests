package com.JavaTests.controller;


import com.JavaTests.entity.Role;
import com.JavaTests.entity.Test;
import com.JavaTests.entity.Topic;
import com.JavaTests.model.RoleModel;
import com.JavaTests.model.TestModel;
import com.JavaTests.model.TopicModel;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;


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

    @RequestMapping(value = "/secure")
    public String secure() {
        return "/secure";
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
    public Test getTestRest(@RequestBody Test test) {
        return testModel.getTestRest(test);
    }

    @RequestMapping(value = "/getTestSaveRest", method = RequestMethod.POST, produces = "application/json;charset=UTF-8")
    @ResponseBody
    public Test getTestSaveRest(@RequestBody Test test) {
        return testModel.getTestSaveRest(test);
    }

    @RequestMapping(value = "/getTopicRest", method = RequestMethod.POST, produces = "application/json;charset=UTF-8")
    @ResponseBody
    public Topic getTopicRest(@RequestBody Topic topic) {
        return topicModel.getTopicRest(topic);
    }

    @RequestMapping(value = "/getTopicSaveRest", method = RequestMethod.POST, produces = "application/json;charset=UTF-8")
    @ResponseBody
    public Topic getTopicSaveRest(@RequestBody Topic topic) {
        return topicModel.getTopicSaveRest(topic);
    }

    @RequestMapping(value = "/getRoleRest", method = RequestMethod.POST, produces = "application/json;charset=UTF-8")
    @ResponseBody
    public Role getRoleRest(@RequestBody Role role) {
        return roleModel.getRoleRest(role);
    }

    @RequestMapping(value = "/getRoleSaveRest", method = RequestMethod.POST, produces = "application/json;charset=UTF-8")
    @ResponseBody
    public Role getRoleSaveRest(@RequestBody Role role) {
        return roleModel.getRoleSaveRest(role);
    }

    @RequestMapping(value = {"/password/{password}"}, method = RequestMethod.GET)
    public ModelAndView passwordEncode(@PathVariable("password") String password) {
        ModelAndView modelAndView = new ModelAndView();
        modelAndView.setViewName("password");
        modelAndView.addObject("crypt", new BCryptPasswordEncoder().encode(password));
        return modelAndView;  // вернем пароль в закриптовонном виде
    }

}
