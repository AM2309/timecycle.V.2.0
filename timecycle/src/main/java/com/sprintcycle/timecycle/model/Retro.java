// package com.sprintcycle.timecycle.model;

// import java.util.Set;

// import javax.persistence.Entity;
// import javax.persistence.GeneratedValue;
// import javax.persistence.GenerationType;
// import javax.persistence.Id;
// import javax.persistence.JoinColumn;
// import javax.persistence.ManyToOne;
// import javax.persistence.OneToMany;
// import javax.persistence.Table;

// @Entity
// @Table(name ="retros")
// public class Retro {
//   @Id
//   @GeneratedValue(strategy = GenerationType.IDENTITY)
//   private Long id;
//   private String achievement;
//   private String issues;
//   private String went_well;
//   private String anything_else;
  

//   @ManyToOne
//   @JoinColumn(name = "sprint_id")
//   Sprint sprint;

//   @ManyToOne
//   @JoinColumn(name = "cycle_id")
//   Cycle cycle;
//   // public Set<Retro> session;

//   // @OneToMany(mappedBy = "retro")
//   // public Set<Sprint> session;
  
//   public Retro() {

//   }

//   public Retro(String achievement, String issues, String went_well, String anything_else) {
//     this.achievement = achievement;
//     this.issues = issues;
//     this.went_well = went_well;
//     this.anything_else = anything_else;
//   }

//   public Retro(String achievement, String issues, String went_well, String anything_else, Long id) {
//     this.achievement = achievement;
//     this.issues = issues;
//     this.went_well = went_well;
//     this.anything_else = anything_else;
//     this.id = id;
//   }


//   public Long getId() {
//     return this.id;
//   }

//   public void setId(Long id) {
//     this.id = id;
//   }

//   public String getAchievement() {
//     return this.achievement;
//   }

//   public void setAchievement(String achievement) {
//     this.achievement = achievement;
//   }

//   public String getIssues() {
//     return this.issues;
//   }

//   public void setIssues(String issues) {
//     this.issues =issues;
//   }

//   public String getWent_well() {
//     return this.went_well;
//   }

//   public void setWent_well(String went_well) {
//     this.went_well = went_well;
//   }

//   public String getAnything_else() {
//     return this.anything_else;
//   }

//   public void setAnything_else(String anything_else) {
//     this.anything_else = anything_else;
//   }
  
// }
