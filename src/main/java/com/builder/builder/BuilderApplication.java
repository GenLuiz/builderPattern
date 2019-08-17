package com.builder.builder;

import com.builder.builder.DAO.*;

//@SpringBootApplication
public class BuilderApplication {

	public static void main(String[] args) {
		//SpringApplication.run(BuilderApplication.class, args);

		 ICheeseBurger cheeseBurgerbuilder = new CheeseBurgerImp();

		CheeseBurgerDirector CheeseBurgerDirector = new CheeseBurgerDirector(cheeseBurgerbuilder);

		System.out.println(CheeseBurgerDirector.construct());

		IFrenchFries frenchFriesbuilder = new FrenchFriesImp();

		FrenchFriesDirector frenchFriesDirector = new FrenchFriesDirector(frenchFriesbuilder);

		System.out.println(frenchFriesDirector.construct());
	}

}
