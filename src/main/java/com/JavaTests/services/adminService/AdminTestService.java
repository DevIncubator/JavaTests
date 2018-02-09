package com.JavaTests.services.adminService;

import com.JavaTests.entity.Test;
import com.JavaTests.repository.TestRepository;
import com.google.common.collect.Lists;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
@Transactional
public class AdminTestService {

    @Autowired
    TestRepository testRepository;

    public List<Test> getTests() {
        return Lists.newArrayList(testRepository.findAll());
    }

}
