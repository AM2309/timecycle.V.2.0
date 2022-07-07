package com.sprintcycle.timecycle.controller;

import java.util.List;
import java.util.Set;

import com.sprintcycle.timecycle.model.Cycle;
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
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.view.RedirectView;

@Controller
public class CycleController {
  @Autowired
  CycleRepository repository;
  @Autowired 
  SprintRepository sprintRepository;

  @GetMapping("sprint/{id}")
  public String newCycle(Model model) {
    Iterable<Cycle> cycles = repository.findAll();
    model.addAttribute("cycles", cycles);
    model.addAttribute("cycle", new Cycle());
    return "cycles/settings";
  }

  @PostMapping("/cycles")
  public RedirectView save(@ModelAttribute Cycle cycle, @RequestParam String goal, @RequestParam String process, @RequestParam String blockers, @RequestParam String energy, @RequestParam String morale) {
    cycle.setGoal(goal);
    cycle.setProcess(process);
    cycle.setBlockers(blockers);
    cycle.setEnergy(energy);
    cycle.setMorale(morale);
// this could probably be done when the rest of the table gets populated, so then it is all together
// to change after I get the html sorted and start work on feed page...
    repository.save(cycle);
    return new RedirectView("/time");
  }

  
}
