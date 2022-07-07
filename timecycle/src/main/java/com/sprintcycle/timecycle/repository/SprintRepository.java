package com.sprintcycle.timecycle.repository;
import java.util.List;

import com.sprintcycle.timecycle.model.Cycle;
import com.sprintcycle.timecycle.model.Sprint;

import org.springframework.data.repository.PagingAndSortingRepository;

public interface SprintRepository extends PagingAndSortingRepository<Sprint, Long>{
  List<Sprint> findByName(String name);
}
