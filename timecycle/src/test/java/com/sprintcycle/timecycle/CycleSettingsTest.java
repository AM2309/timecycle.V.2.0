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
public class CycleSettingsTest {
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
    driver.get("http://localhost:8080/settings");

    driver.findElement(By.id("goal")).sendKeys("Write feature test for cycle");
    driver.findElement(By.id("process")).sendKeys("Look at the sprint feature test");
    driver.findElement(By.id("blockers")).sendKeys("syntax errors");
    driver.findElement(By.id("energy")).sendKeys("low");
    driver.findElement(By.id("morale")).sendKeys("low");
    driver.findElement(By.id("submit")).click();

    String time = driver.findElement(By.tagName("h1")).getText();
    Assertions.assertTrue(time.contains("Work time"));
  }
}


