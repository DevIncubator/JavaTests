package com.JavaTests.model;

import com.JavaTests.entity.Test;

public interface TestModel {
    Test getTestRest(Test test);

    String getTest();

    String getTestSave();
}
