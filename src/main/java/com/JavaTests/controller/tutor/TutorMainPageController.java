package com.JavaTests.controller.tutor;

import com.JavaTests.entity.Answer;
import com.JavaTests.entity.Question;
import com.JavaTests.entity.Topic;
import com.JavaTests.services.tutorService.AnswerService;
import com.JavaTests.services.tutorService.QuestionService;
import com.JavaTests.services.tutorService.TestService;
import com.JavaTests.services.tutorService.TopicService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import java.util.List;

@Controller
public class TutorMainPageController {

    @Autowired
    public TutorMainPageController(TopicService topicService, TestService testService, QuestionService questionService, AnswerService answerService) {
        this.topicService = topicService;
        this.testService = testService;
        this.questionService = questionService;
        this.answerService = answerService;
    }

    private TopicService topicService;
    private TestService testService;
    private QuestionService questionService;
    private AnswerService answerService;

    @RequestMapping(value = "/getTopics", method = RequestMethod.GET, produces = "application/json;charset=UTF-8")
    public String getTopicPage(Model model) {
        List<Topic> topicList = topicService.getTopics();
        model.addAttribute("topicList", topicList);
        return "tutor/tests";
    }

    @RequestMapping(value = "/getQuestions", method = RequestMethod.GET, produces = "application/json;charset=UTF-8")
    public String getQuestionPage(Model model) {
        List<Question> questionList = questionService.getQuestions();
        List<Answer> answerList = answerService.findByQuestionId(6);
        model.addAttribute("questionList", questionList);
    //    model.addAttribute("answerList", answerList);
        return "tutor/questions";
    }

    @RequestMapping(value = "/getStatistics", method = RequestMethod.GET, produces = "application/json;charset=UTF-8")
    public String getStatisticPage() {
        return "tutor/statistics";
    }

}
