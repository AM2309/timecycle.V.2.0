package com.sprintcycle.timecycle.controller;

import java.security.Principal;
import java.util.Optional;
import java.util.Set;

import com.sprintcycle.timecycle.model.Sprint;
import com.sprintcycle.timecycle.repository.CycleRepository;
import com.sprintcycle.timecycle.repository.SprintRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.view.RedirectView;

@Controller
public class SprintController {
  @Autowired 
  SprintRepository repository;
  @Autowired
  CycleRepository cycleRepository;

  @GetMapping("sprints/new")
  public String createSprint(Model model) {
    Iterable<Sprint> sprints = repository.findAll();
    model.addAttribute("sprints", sprints);
    model.addAttribute("sprint", new Sprint());
    return "sprints/new";
  }

  @PostMapping("sprints")
  public RedirectView save(@ModelAttribute Sprint sprint, @RequestParam String name, @RequestParam String goals, @RequestParam String measurement, 
  @RequestParam String success, @RequestParam String other, @RequestParam Integer cycle_amount, 
  @RequestParam Integer cycle_time, @RequestParam Integer break_time) {
    sprint.setName(name);
    sprint.setGoals(goals);
    sprint.setMeasurement(measurement);
    sprint.setSuccess(success);
    sprint.setOther(other);
    sprint.setCycle_amount(cycle_amount);
    sprint.setCycle_time(cycle_time);
    sprint.setBreak_time(break_time);

    repository.save(sprint);
    return new RedirectView("/total");
  }
  
  @GetMapping("total")
  public String showAll(Model model) {
    // Iterable<Sprint> sprint = repository.findByName(name);
    // model.addAttribute("sprint", sprint);
    Iterable<Sprint> sprints = repository.findAll();
    model.addAttribute("sprints", sprints);
    return "sprints/total";
  }  

}

