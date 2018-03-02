package com.JavaTests.services.tutorService;

import com.JavaTests.entity.Question;

import java.util.List;

public interface QuestionService {

    void addQuestion(Question question);

    Question findByDescription(String description);

    List<Question> getQuestions();

 //   Question editQuestion(Question question);


}
