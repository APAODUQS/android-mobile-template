package automation.test;

import automation.cucumber.steps.Constants;

import cucumber.api.CucumberOptions;

@CucumberOptions(
        features = {"features"}, // Test scenarios
        glue = {"automation.cucumber.steps"}, // Steps definitions
        format = {"pretty", // Cucumber report formats and location to store them in phone
                "html:" + Constants.REPORT_PATH + "cucumber-html-report",
                "json:" + Constants.REPORT_PATH + "cucumber.json",
                "junit:" + Constants.REPORT_PATH + "cucumber.xml"
        }
)
// This class must be in a different package than the glue code
// (this class is in '...cucumber.test' and glue is in '...cucumber.steps')
class CucumberTestCase {
}
