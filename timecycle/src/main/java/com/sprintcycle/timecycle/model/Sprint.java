package com.sprintcycle.timecycle.model;

import java.math.BigDecimal;
import java.util.Set;

import javax.persistence.*;


import lombok.Data;

@Data
@Entity
@Table(name = "SPRINTS")
@SecondaryTable(name = "retros", pkJoinColumns = @PrimaryKeyJoinColumn(name = "sprints_id"))
public class Sprint {
  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  private Long id;
  private String name;
  private String goals;
  private String measurement;
  private String success;
  private String other;
  private Integer cycle_amount;
  private Integer cycle_time;
  private Integer break_time;
  @Column(name = "achievement", table = "retros")
  String achievement;
  @Column(name = "issues", table = "retros")
  String issues;
  @Column(name = "went_well", table = "retros")
  String went_well;
  @Column(name = "anything_else", table = "retros")
  String anything_else;


  @OneToMany(cascade = CascadeType.ALL)
  @JoinTable(name = "session",
              joinColumns = @JoinColumn(name = "sprint_id"),
              inverseJoinColumns = @JoinColumn(name = "cycle_id"))
  public Set<Cycle> cycles;
  

  // @ManyToOne
  // @JoinColumn(name = "cycle_id")
  // Cycle cycle;



  @OneToMany(mappedBy="sprint")
  private Set<Cycle> cycle;
  
  public Sprint() {
  }

  public Sprint(String name, String goals, String measurement, String success, 
  String other, Integer cycle_amount, Integer cycle_time,Integer break_time) {
    this.name = name;
    this.goals = goals;
    this.measurement = measurement;
    this.success = success;
    this.other = other;
    this.cycle_amount = cycle_amount;
    this.cycle_time = cycle_time;
    this.break_time = break_time;
  }

  public Sprint(String name, String goals, String measurement, String success, 
  String other, Integer cycle_amount, Integer cycle_time,Integer break_time, String achievement, String issues, String went_well, String anything_else) {
    this.name = name;
    this.goals = goals;
    this.measurement = measurement;
    this.success = success;
    this.other = other;
    this.cycle_amount = cycle_amount;
    this.cycle_time = cycle_time;
    this.break_time = break_time;
    this.achievement = achievement;
    this.issues = issues;
    this.went_well = went_well;
    this.anything_else = anything_else;
  }
  public Sprint(String name, String goals, String measurement, String success, 
  String other, Integer cycle_amount,Integer cycle_time,Integer break_time, Long id) {
    this.name = name;
    this.goals = goals;
    this.measurement = measurement;
    this.success = success;
    this.other = other;
    this.cycle_amount = cycle_amount;
    this.cycle_time = cycle_time;
    this.break_time = break_time;
    this.id = id;
  }

  public Sprint(String name, String goals, String measurement, String success, 
  String other, Integer cycle_amount,Integer cycle_time,Integer break_time, String achievement, String issues, String went_well, String anything_else, Long id) {
    this.name = name;
    this.goals = goals;
    this.measurement = measurement;
    this.success = success;
    this.other = other;
    this.cycle_amount = cycle_amount;
    this.cycle_time = cycle_time;
    this.break_time = break_time;
    this.achievement = achievement;
    this.issues = issues;
    this.went_well = went_well;
    this.anything_else = anything_else;
    this.id = id;
  }


  public Long getId() {
    return this.id;
  }

  public void setId(Long id) {
    this.id = id;
  }

  public String getName() {
    return this.name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public String getGoals() {
    return this.goals;
  }

  public void setGoals(String goals) {
    this.goals = goals;
  }

  public String getMeasurement() {
    return this.measurement;
  }

  public void setMeasurement(String measurement) {
    this.measurement = measurement;
  }

  public String getSuccess() {
    return this.success;
  }

  public void setSuccess(String success) {
    this.success = success;
  }

  public String getOther() {
    return this.other;
  }

  public void setOther(String other) {
    this.other = other;
  }

  public Integer getCycle_amount() {
    return cycle_amount;
  }

  public void setCycle_amount(Integer cycle_amount) {
    this.cycle_amount = cycle_amount;
  }

  public Integer getCycle_time() {
    return cycle_time;
  }

  public void setCycle_time(Integer cycle_time) {
    this.cycle_time = cycle_time;
  }

  public Integer getBreak_time() {
    return break_time;
  }

  public void setBreak_time(Integer break_time) {
    this.break_time = break_time;
  }

  public String getAchievement() {
    return this.achievement;
  }

  public void setAchievement(String achievement) {
    this.achievement = achievement;
  }

  public String getIssues() {
    return this.issues;
  }

  public void setIssues(String issues) {
    this.issues =issues;
  }

  public String getWent_well() {
    return this.went_well;
  }

  public void setWent_well(String went_well) {
    this.went_well = went_well;
  }

  public String getAnything_else() {
    return this.anything_else;
  }

  public void setAnything_else(String anything_else) {
    this.anything_else = anything_else;
  }
}
