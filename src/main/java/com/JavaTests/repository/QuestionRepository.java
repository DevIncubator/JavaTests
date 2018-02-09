package com.JavaTests.repository;

import com.JavaTests.entity.Question;
import com.JavaTests.entity.Test;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface QuestionRepository extends CrudRepository<Question, Integer> {

    List<Question> findByUserId(int id);

    List<Question> findByTestId(Integer testId);

    List<Question> findByTestName(String testName);

    List<Question> findByTest(Test test);
}
