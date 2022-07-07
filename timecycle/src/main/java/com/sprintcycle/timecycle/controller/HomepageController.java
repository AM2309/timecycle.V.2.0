package com.sprintcycle.timecycle.controller;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.view.RedirectView;
 
@RestController
public class HomepageController {
   
 @RequestMapping(value = "/")
//  @GetMapping("/")
 public RedirectView index() {
   return new RedirectView("sprints/new");
 }
}
