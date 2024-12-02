package config;

import customAlias.AutomationTestConfig;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Configuration;

@AutomationTestConfig
public class SeleniumConfig {

    @Value("${selenium.browser:chromium}")
    private String browser;

    @Value("${selenium.url}")
    private String url;

    public String getBrowser()
    {
        return browser;
    }

    public String getUrl()
    {
        return url;
    }
}
