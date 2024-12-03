package javabased;

import org.springframework.stereotype.Component;


public class PageObjectModel {

    private WebDriver driver;

    public PageObjectModel(WebDriver driver)
    {
        this.driver = driver;
    }

    public void  validatePageHeading(String heading)
    {
        driver.getPageHeading(heading);
    }
}
