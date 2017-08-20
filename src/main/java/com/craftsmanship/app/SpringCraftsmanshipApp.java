package com.craftsmanship.app;

import java.util.List;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.craftsmanship.domain.Dvd;
import com.craftsmanship.domain.ISearchDvd;

public class SpringCraftsmanshipApp {

	public static void main(String[] args) {
        ApplicationContext context = new AnnotationConfigApplicationContext(AppConfig.class);

		ISearchDvd searchDvdService = (ISearchDvd) context.getBean("iSearchDvd");

		
		List<Dvd> dvdsResult = searchDvdService.findByTitle("x-men");
		for (Dvd dvd : dvdsResult) {
			System.out.println(dvd.toString());
		}

	}
}
