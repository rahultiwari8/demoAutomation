package annotationBased;

import org.springframework.stereotype.Component;

@Component
public class WebDriverA {

    public void getPageHeading(String heading)
    {
        System.out.println("Pgae Heading: " + heading);
    }
}
