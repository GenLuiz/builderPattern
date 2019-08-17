package com.builder.builder;

import com.builder.builder.DAO.CheeseBurgerImp;
import com.builder.builder.DAO.CheeseBurguerDirector;
import com.builder.builder.DAO.ICheeseBurger;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

//@SpringBootApplication
public class BuilderApplication {

	public static void main(String[] args) {
		//SpringApplication.run(BuilderApplication.class, args);

		 ICheeseBurger builder = new CheeseBurgerImp();

		CheeseBurguerDirector CheeseBuildDirector = new CheeseBurguerDirector(builder);

		System.out.println(CheeseBuildDirector.construct());
	}

}
