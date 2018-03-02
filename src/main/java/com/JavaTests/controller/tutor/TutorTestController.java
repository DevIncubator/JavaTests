package com.JavaTests.controller.tutor;

import com.JavaTests.entity.Test;
import com.JavaTests.services.tutorService.TestService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;


@Controller
public class TutorTestController {

    @Autowired
    private TestService testService;

    @RequestMapping(value = "/deleteTest", method = RequestMethod.GET, produces = "application/json;charset=UTF-8")
    public String deleteTest(@ModelAttribute("test") Test test) {
        testService.deleteTest(test);
        return "deleteTest";
    }

    @RequestMapping(value = "/editTest", method = RequestMethod.GET, produces = "application/json;charset=UTF-8")
    public String editTest(@ModelAttribute("test") Test test) {
        testService.editTest(test);
        return "editTest";
    }

    @RequestMapping(value = "/getTestsRest", method = RequestMethod.POST, produces = "application/json;charset=UTF-8")
    @ResponseBody
    public void getTestsRest() {
        testService.getTests();
    }

   /* @RequestMapping(value = "/addTestRest", method = RequestMethod.POST, produces = "application/json;charset=UTF-8")
    @ResponseBody
    public void addTestRest(@RequestBody Test test) {
        testService.addTest(test);
    }*/

    @RequestMapping(value = "/deleteTestRest", method = RequestMethod.POST, produces = "application/json;charset=UTF-8")
    @ResponseBody
    public void deleteTestRest(@RequestBody Test test) {
        testService.deleteTest(test);
    }

    @RequestMapping(value = "/editTestRest", method = RequestMethod.POST, produces = "application/json;charset=UTF-8")
    @ResponseBody
    public void editTestRest(@RequestBody Test test) {
        testService.editTest(test);
    }
}
