package com.JavaTests.controller.tutor;

import com.JavaTests.entity.QuestionStatistic;
import com.JavaTests.services.tutorService.StatisticService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import java.util.List;

@Controller
public class TutorStatisticController {

    @Autowired
    public TutorStatisticController(StatisticService statisticService) {
        this.statisticService=statisticService;
    }

    private StatisticService statisticService;

    @RequestMapping(value = "/getTestStatistic", method = RequestMethod.GET, produces = "application/json;charset=UTF-8")
    public String getTestStatistic() {
        return "tutor/testsStatistic";
    }

    @RequestMapping(value = "/getQuestionStatistic", method = RequestMethod.GET, produces = "application/json;charset=UTF-8")
    public String getQuestionStatistic(Model model) {
    List<QuestionStatistic> questionStatisticList = statisticService.getQuestionStatistic();
    model.addAttribute("questionStatistic", questionStatisticList);
        return "tutor/questionStatistic";
    }

    @RequestMapping(value = "/getUserStatistic", method = RequestMethod.GET, produces = "application/json;charset=UTF-8")
    public String getUserStatistic() {
        return "tutor/userStatistic";
    }
}
