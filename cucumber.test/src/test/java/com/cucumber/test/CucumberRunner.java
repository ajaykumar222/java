package com.cucumber.test;

import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@Cucumber.Options(format={"pretty","html:reports/test-report"},tags= "@smokeTest")
public class CucumberRunner {

}
