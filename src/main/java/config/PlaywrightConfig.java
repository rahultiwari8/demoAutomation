package config;

import customAlias.AutomationTestConfig;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Configuration;

@AutomationTestConfig
public class PlaywrightConfig {

    @Value("${playwright.browser:chromium}")
    private String browser;

   

    @Value("${playwright.headless:false}")
    private String mode;
    public String getBrowser()
    {
        return browser;
    }


    public String getmode()
    {
        return mode;
    }


}
