package com.ProShark;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MainRuner {

	public static void main(String[] args) {
	
		ApplicationContext acc = new ClassPathXmlApplicationContext("beans.xml");
		ShowRoom v = acc.getBean("showroom",ShowRoom.class );
	System.out.println(	v.getBike());
	v.getbikelistBikes();
	}

}
