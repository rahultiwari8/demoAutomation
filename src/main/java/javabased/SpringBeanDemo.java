package javabased;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class SpringBeanDemo {


    @Bean

    public WebDriver createDriver()
    {
        return new WebDriver();
    }

    @Bean
    public PageObjectModel getPageObjectModel(WebDriver driver)
    {
        return new PageObjectModel(driver);
    }

}
