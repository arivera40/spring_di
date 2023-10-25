package com.demo.spring_di;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Hello world!
 *
 */
public class App {
    public static void main( String[] args ) {
//    	ApplicationContext context = new ClassPathXmlApplicationContext("com/demo/spring_di/AppXmlConfig.xml");
//        Vehicle obj = (Vehicle) context.getBean("car");
//        obj.drive();
        
//        Tire t = (Tire) context.getBean("tire");
//        System.out.println(t);
    	
    	AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(AppAnnoConfig.class);
    	MyApplication app = context.getBean(MyApplication.class);
    	app.processMessage("Hi Andy", "arivera40@test.com");
    	context.close();
    }
}
