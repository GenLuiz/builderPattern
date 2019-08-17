package com.builder.builder;

import com.builder.builder.Directors.MilkshakeDirector;
import com.builder.builder.Implementations.CheeseBurgerImp;
import com.builder.builder.Implementations.FrenchFriesImp;
import com.builder.builder.Directors.CheeseBurgerDirector;
import com.builder.builder.Directors.FrenchFriesDirector;
import com.builder.builder.Implementations.MilkshakeImp;
import com.builder.builder.Interfaces.ICheeseBurger;
import com.builder.builder.Interfaces.IFrenchFries;
import com.builder.builder.Interfaces.IMilkshake;

public class BuilderApplication {

	public static void main(String[] args) {

		ICheeseBurger cheeseBurgerBuilder = new CheeseBurgerImp();
		CheeseBurgerDirector CheeseBurgerDirector = new CheeseBurgerDirector(cheeseBurgerBuilder);
		System.out.println(CheeseBurgerDirector.construct());
		System.out.println(CheeseBurgerDirector.constructB());

		IFrenchFries frenchFriesBuilder = new FrenchFriesImp();
		FrenchFriesDirector frenchFriesDirector = new FrenchFriesDirector(frenchFriesBuilder);
		System.out.println(frenchFriesDirector.construct());
		System.out.println(frenchFriesDirector.constructB());


		IMilkshake milkShakeBuilder = new MilkshakeImp();
		MilkshakeDirector milkshakeDirector = new MilkshakeDirector(milkShakeBuilder);
		System.out.println(milkshakeDirector.construct());
		System.out.println(milkshakeDirector.constructB());

	}

}
