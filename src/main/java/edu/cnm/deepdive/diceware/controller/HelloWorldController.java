package edu.cnm.deepdive.diceware.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/")
public class HelloWorldController {

  public static final String GREETING = "Hello, %s!";
  public static final String COMPLIMENT_FORMAT = "Good job in making it to week %d! You now know much more Java than 99+%% of the population.";
  public static final String EXPLANATION_FORMAT = "This is a simple Spring MVC-based web servic.";

  @GetMapping(value = "greet")
  public String greet(
      @RequestParam(name = "t", required = false, defaultValue = "World") String target) {
    return String.format(GREETING, target);
  }

  @GetMapping("compliment")
  public String beNice(@RequestParam(name = "w", defaultValue = "5") int week) {
    return String.format (
        COMPLIMENT_FORMAT, week);
  }

  @GetMapping
  public String explain() {
    return EXPLANATION_FORMAT;
  }

}
