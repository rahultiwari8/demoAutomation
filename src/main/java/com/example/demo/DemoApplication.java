package com.example.demo;

import config.PlaywrightConfig;
import config.SeleniumConfig;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Import;

@SpringBootApplication
//@ComponentScan(basePackages = "config")
@Import({SeleniumConfig.class, PlaywrightConfig.class})
public class DemoApplication {

	public static void main(String[] args) {
		var context = SpringApplication.run(DemoApplication.class, args);
//		var firstClass = context.getBean(FirstClass.class);
//		firstClass.firstMethod();


//		FirstClass firstClass = new FirstClass();
//		firstClass.firstMethod();

//		var runClass = context.getBean(RunningClass.class);
//		runClass.getSecondMehtod();

		//value injection
		SeleniumConfig bean = context.getBean(SeleniumConfig.class);
		PlaywrightConfig playWrightbean = context.getBean(PlaywrightConfig.class);
		String browser = bean.getBrowser();
		System.out.println("Browser - > "+browser );
		System.out.println(bean.getUrl());

		String PlayWrightBrowser = playWrightbean.getBrowser();
		System.out.println("Browser - > "+PlayWrightBrowser );
		System.out.println(playWrightbean.getmode());


	}
}
