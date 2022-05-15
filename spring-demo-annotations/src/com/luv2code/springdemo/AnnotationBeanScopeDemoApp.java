package com.luv2code.springdemo;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class AnnotationBeanScopeDemoApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ClassPathXmlApplicationContext context = 
				new ClassPathXmlApplicationContext("applicationContext.xml");
		
		Coach theCoach = context.getBean("tennisCoach", Coach.class);

		Coach AlphaCoach = context.getBean("tennisCoach", Coach.class);
		
		
		boolean result = (theCoach == AlphaCoach);
		
		System.out.println("\nPointing the same object: "+ result);
		System.out.println("\nMemory location for the Coach: "+ theCoach);
		System.out.println("\nMemory location for the AlphaCoach: "+ AlphaCoach);
		
		context.close();

	}

}
