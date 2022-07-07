// package com.sprintcycle.timecycle.model;


// import org.junit.jupiter.api.Test;
// import static org.hamcrest.CoreMatchers.*;
// import static org.hamcrest.MatcherAssert.*;

// public class RetroTest {
//   @Test
//   public void retroHasAchievement() {
//     Retro retro = new Retro("Finished everything", null, null, null);
//     assertThat(retro.getAchievement(), containsString("Finished everything"));
//   }

//   @Test
//   public void retroHasIssues() {
//     Retro retro = new Retro(null, "no internet", null, null);
//     assertThat(retro.getIssues(), containsString("no internet"));
//   }

//   @Test
//   public void retroHasWent_well() {
//     Retro retro = new Retro(null, null, "made table", null);
//     assertThat(retro.getWent_well(), containsString("made table"));
//   }

//   @Test
//   public void retroHasAnything_else() {
//     Retro retro = new Retro(null, null, null, "nope");
//     assertThat(retro.getAnything_else(), containsString("nope"));
//   }
// }
