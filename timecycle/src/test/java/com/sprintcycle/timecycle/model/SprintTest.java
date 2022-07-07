package com.sprintcycle.timecycle.model;


import static org.hamcrest.CoreMatchers.*;
import static org.hamcrest.MatcherAssert.*;
import static org.junit.jupiter.api.Assertions.assertEquals;

import org.checkerframework.checker.units.qual.C;
import org.hamcrest.Matcher;
import org.junit.jupiter.api.Test;


public class SprintTest {
  @Test
  public void sprintHasName() {
    Sprint sprint = new Sprint("Hello",null, null, null, null, null, null, null);
    assertThat(sprint.getGoals(), containsString("To finish application"));
  }

  @Test
  public void sprintHasGoals() {
    Sprint sprint = new Sprint(null, "To finish application", null, null, null, null, null, null);
    assertThat(sprint.getGoals(), containsString("To finish application"));
  }

  @Test
  public void sprintHasMeasurement() {
    Sprint sprint = new Sprint(null, null, "realistic", null, null, null, null, null);
    assertThat(sprint.getMeasurement(), containsString("realistic"));
  }

  @Test
  public void sprintHasSuccess() {
    Sprint sprint = new Sprint(null, null, null, "done", null, null, null, null);
    assertThat(sprint.getSuccess(), containsString("done"));
  }

  @Test
  public void sprintHasOther() {
    Sprint sprint = new Sprint(null, null, null, null, "Everything got done", null, null, null);
    assertThat(sprint.getOther(), containsString("Everything got done"));
  }

  @Test
  public void sprintHasCycle_amount() {
    Sprint sprint = new Sprint(null, null, null, null, null, 5 , null, null);
    assertEquals(sprint.getCycle_amount(), 5);
  }

  @Test
  public void sprintHasCycle_time() {
    Sprint sprint = new Sprint(null, null, null, null, null, null , 25 , null);
    assertEquals(sprint.getCycle_time(), 25);
  }

  @Test
  public void sprintHasBreak_time() {
    Sprint sprint = new Sprint(null, null, null, null, null, null , null , 5);
    assertEquals(sprint.getBreak_time(), 5);
  }
}