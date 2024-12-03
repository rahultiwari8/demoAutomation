package annotationBased;

import org.springframework.stereotype.Component;

@Component
public class PageObjectModelA {

    private WebDriverA driver;

    public PageObjectModelA(WebDriverA driver)
    {
        this.driver = driver;
    }

    public void  validatePageHeading(String heading)
    {
        driver.getPageHeading(heading);
    }
}
