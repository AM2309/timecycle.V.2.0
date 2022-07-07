package com.sprintcycle.timecycle;

import com.github.javafaker.Faker;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestInstance;
import org.junit.jupiter.api.TestInstance.Lifecycle;
import org.junit.jupiter.api.extension.ExtendWith;
import org.junit.jupiter.params.provider.ValueSource;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Assertions;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit.jupiter.SpringExtension;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.test.context.junit4.SpringRunner;
import org.openqa.selenium.support.pagefactory.ByAll;
import org.openqa.selenium.support.ui.Select;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;

@ExtendWith(SpringExtension.class)
@SpringBootTest(classes = TimecycleApplication.class)
@TestInstance(Lifecycle.PER_CLASS)
public class SprintNewTest {
  WebDriver driver;

  @BeforeAll
  public void setup() {
    System.setProperty("webdriver.chrome.driver", "/usr/local/bin/chromedriver");
    driver = new ChromeDriver();
  }

  @AfterAll
  public void tearDown() {
    driver.close();
  }

  @Test
  public void successfullInstantiationOfNewSprint() {
    driver.get("http://localhost:8080/sprints/new");

    driver.findElement(By.id("goals")).sendKeys("Write feature test for sprint");
    driver.findElement(By.id("measurement")).sendKeys("Realistic");
    driver.findElement(By.id("success")).sendKeys("I will know I have achieved this when the test runs");
    driver.findElement(By.id("cycle_amount")).sendKeys(String.valueOf(5));
    driver.findElement(By.id("cycle_time")).sendKeys(String.valueOf(20));
    driver.findElement(By.id("break_time")).sendKeys(String.valueOf(5));
    driver.findElement(By.id("submit")).click();

    String cycle = driver.findElement(By.tagName("h1")).getText();
    Assertions.assertTrue(cycle.contains("Cycle"));
  }
}
