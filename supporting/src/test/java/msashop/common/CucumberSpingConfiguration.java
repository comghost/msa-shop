package msashop.common;

import io.cucumber.spring.CucumberContextConfiguration;
import msashop.SupportingApplication;
import org.springframework.boot.test.context.SpringBootTest;

@CucumberContextConfiguration
@SpringBootTest(classes = { SupportingApplication.class })
public class CucumberSpingConfiguration {}
