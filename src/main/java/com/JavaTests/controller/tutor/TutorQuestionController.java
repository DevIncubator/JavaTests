package com.JavaTests.controller.tutor;

import com.JavaTests.entity.Answer;
import com.JavaTests.entity.Question;
import com.JavaTests.services.tutorService.AnswerService;
import com.JavaTests.services.tutorService.QuestionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Controller
public class TutorQuestionController {

    @Autowired
    private QuestionService questionService;

    @Autowired
    private AnswerService answerService;

    @RequestMapping(value = "/addQuestion", method = RequestMethod.GET, produces = "application/json;charset=UTF-8")
    public String addQuestion(@ModelAttribute("question")Question question, List<Answer> answers) {
        questionService.addQuestion(question);
        return "addQuestion";
    }

    @RequestMapping(value = "/getAnswersByQuestionId", method = RequestMethod.GET, produces = "application/json;charset=UTF-8")
    public String getAnswersById(Model model, @ModelAttribute("question") String questionDescription) {
        Question question = questionService.findByDescription(questionDescription);
        List<Answer> answerList = answerService.findByQuestionId(question.getId());
        model.addAttribute("answerList", answerList);
        return "tutor/questions";
    }

    @RequestMapping(value = "/addAnswer", method = RequestMethod.GET, produces = "application/json;charset=UTF-8")
    public String AddAnswer(Answer answer, @ModelAttribute("question") Integer questionId ) {
        answerService.addAnswer(answer, questionId);
        return "addAnswer";
    }

    @RequestMapping(value = "/getQuestionsRest", method = RequestMethod.POST, produces = "application/json;charset=UTF-8")
    @ResponseBody
    public void getQuestionssRest() {
        questionService.getQuestions();
    }

    @RequestMapping(value = "/addQuestionRest", method = RequestMethod.POST, produces = "application/json;charset=UTF-8")
    @ResponseBody
    public void addQuestionRest(@RequestBody Question question) {
        questionService.addQuestion(question);
    }
}
