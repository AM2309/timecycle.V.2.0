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

  
}
