package com.sprintcycle.timecycle.model;

import java.util.Set;

import javax.persistence.*;

@Entity
@Table(name = "cycles")
public class Cycle {
  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  private Long id;
  private String goal;
  private String process;
  private String blockers;
  private String energy;
  private String morale;
  private String completion_level;
  private String observations;
  private String issues;
  private String improvements;


  @ManyToOne
  @JoinColumn(name = "sprint_id" )
  public Sprint sprint;


  public Cycle() {
  }

  public Cycle(String goal, String process, String blockers, 
  String energy, String morale) {
    this.goal = goal;
    this.process = process;
    this.blockers = blockers;
    this.energy = energy;
    this.morale = morale;
  }

  // public Cycle(String completion_level, String observations, String issues, String improvements, Long id) {
  //   this.completion_level = completion_level;
  //   this.observations = observations;
  //   this.issues = issues;
  //   this.improvements = improvements;
  //   this.id = id;
  // }

  public Cycle(String goal, String process, String blockers, String energy, String morale, String completion_level,
  String observations, String issues, String improvements) {
    this.goal = goal;
    this.process = process;
    this.blockers = blockers;
    this.energy = energy;
    this.morale = morale;
    this.completion_level = completion_level;
    this.observations = observations;
    this.issues = issues;
    this.improvements = improvements;
  }

  public Cycle(String goal, String process, String blockers, String energy, String morale, String completion_level,
  String observations, String issues, String improvements, Long id, Long sprint_id) {
    this.goal = goal;
    this.process = process;
    this.blockers = blockers;
    this.energy = energy;
    this.morale = morale;
    this.completion_level = completion_level;
    this.observations = observations;
    this.issues = issues;
    this.improvements = improvements;
    this.id = id;
    
  }


  public Long getId() {
    return this.id;
  }

  public void setId(Long id) {
    this.id = id;
  }

  public String getGoal() {
    return this.goal;
  }

  public void setGoal(String goal) {
    this.goal = goal;
  }

  public String getProcess() {
    return this.process;
  }
  
  public void setProcess(String process) {
    this.process = process;
  }

  public String getBlockers() {
    return this.blockers;
  }

  public void setBlockers(String blockers) {
    this.blockers = blockers;
  }

  public String getEnergy() {
    return this.energy;
  }

  public void setEnergy(String energy) {
    this.energy = energy;
  }

  public String getMorale() {
    return this.morale;
  }

  public void setMorale(String morale) {
    this.morale = morale;
  }

  public String getCompletion_level() {
    return this.completion_level;
  }

  public void setCompletion_level(String completion_level) {
    this.completion_level = completion_level;
  }

  public String getObservations() {
    return this.observations;
  }

  public void setObservations(String observations) {
    this.observations = observations;
  }

  public String getIssues() {
    return this.issues;
  }

  public void setIssues(String issues) {
    this.issues = issues;
  }

  public String getImprovements() {
    return this.improvements;
  }

  public void setImprovements(String improvements) {
    this.improvements = improvements;
  }

  
}
