package com.hopcroft.examples.domain;

import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@StaticMetamodel(Car.class)
public abstract class Car_ {

	public static volatile SingularAttribute<Car, Long> id;
	public static volatile SingularAttribute<Car, String> model;
	public static volatile SingularAttribute<Car, Long> price;
	public static volatile SingularAttribute<Car, String> company;

}

