package com.sprintcycle.timecycle.repository;


import java.util.List;
import java.util.Set;

import com.sprintcycle.timecycle.model.Cycle;

import org.springframework.data.repository.PagingAndSortingRepository;

public interface CycleRepository extends PagingAndSortingRepository<Cycle, Long > {
  // Set<Cycle> findBySprintId(Long id);
  // Set<Cycle> findAllBySprintId(Long sprint_id);
}
