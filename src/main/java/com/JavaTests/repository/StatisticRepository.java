package com.JavaTests.repository;

import com.JavaTests.entity.Statistic;
import org.springframework.data.repository.CrudRepository;

public interface StatisticRepository extends CrudRepository<Statistic, Integer> {
}
