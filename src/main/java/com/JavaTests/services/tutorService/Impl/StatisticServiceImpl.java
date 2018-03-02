package com.JavaTests.services.tutorService.Impl;

import com.JavaTests.entity.QuestionStatistic;
import com.JavaTests.repository.QuestioStatisticRepository;
import com.JavaTests.services.tutorService.StatisticService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

@Service
public class StatisticServiceImpl implements StatisticService {

    @Autowired
    private QuestioStatisticRepository questioStatisticRepository;

    @Transactional
    public List<QuestionStatistic> getQuestionStatistic() {
        List<QuestionStatistic> resultList = new ArrayList<>();
        Iterator<QuestionStatistic> it = questioStatisticRepository.findAll().iterator();
        while (it.hasNext())
            resultList.add(it.next());
        return resultList;
    }
}
