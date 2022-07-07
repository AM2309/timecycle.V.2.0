package com.sprintcycle.timecycle.model;

import org.junit.jupiter.api.Test;

import static org.hamcrest.CoreMatchers.*;
import static org.hamcrest.MatcherAssert.*;

public class CycleTest {
  @Test
  public void cycleHasGoal() {
    Cycle cycle = new Cycle ("To start the model", null, null, null, null);
    assertThat(cycle.getGoal(), containsString("To start the model"));
  }

  @Test
  public void cycleHasProcess() {
    Cycle cycle = new Cycle (null, "Will follow sprint.java patterns", null, null, null);
    assertThat(cycle.getProcess(), containsString("Will follow sprint.java patterns"));
  }

  @Test
  public void cycleHasBlockers() {
    Cycle cycle = new Cycle (null, null, "No internet to check on google in case of issues", null, null);
    assertThat(cycle.getBlockers(), containsString("No internet to check on google in case of issues"));
  }

  @Test
  public void cycleHasEnergy() {
    Cycle cycle = new Cycle (null, null, null, "low", null);
    assertThat(cycle.getEnergy(), containsString("low"));
  }

  @Test
  public void cycleHasMorale() {
    Cycle cycle = new Cycle (null, null, null, null, "low");
    assertThat(cycle.getMorale(), containsString("low"));
  }
}
