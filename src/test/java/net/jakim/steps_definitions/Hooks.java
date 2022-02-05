package net.jakim.steps_definitions;

import io.cucumber.java.*;
import lombok.extern.slf4j.Slf4j;

@Slf4j
public class Hooks {

    @BeforeAll
    public static void beforeAll() {
        log.info("Run before all tests");
    }

    @AfterAll
    public static void afterAll() {
        log.info("Run after all tests");
    }

    @BeforeStep
    public void doSomethingBeforeStep(Scenario scenario){
        log.info("Run before step on line {}", scenario.getLine());
    }

    @AfterStep
    public void doSomethingAfterStep(Scenario scenario){
        log.info("Run after step on line {}", scenario.getLine());
    }

    @Before(order = 10)
    public void doSomething(Scenario scenario){
        log.info("Run before scenario {}", scenario.getName());
    }

    @After
    public void doSomethingAfter(Scenario scenario){
        log.info("Run after scenario {}", scenario.getName());
    }
}
