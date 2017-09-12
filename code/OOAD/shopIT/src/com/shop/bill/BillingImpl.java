package com.shop.bill;

import com.shop.pm.PriceMatrix;

/*
 *  design & performance issues
 *  ---------------------------
 *  
 *  1. tight-coupling b/w dependent & dependency
 *  2. too many dependencies created & destructed o repeated oprns
 *  3. Unit-Testing not possible
 *  
 *  
 *  why these issues happening here?
 *  
 *  ==> dependent itself creating it's own dependency..
 *  
 *  soln : dont create dependency in dependent's class , do lookup
 *  
 *  limitation on lookup ?
 *  
 *  ==> location tight-coupling..
 *  
 *  best soln : Dont create,lookup , get/inject by 'some-one' (IOC) ( Inversion Of Control )
 *  
 *  
 *  How to implement IOC ?
 *  
 *  using 'Dependency Injection' ( DI )
 *  
 *  	
 *  how to do dependency Injection ?
 *  
 *  	--> constructor
 *  --> setter
 *  
 *  
 *  
 *  
 *       
 *       
 *  S - Single-responsiblity principle.
 *  O - Open-closed principle.
 *  L - Liskov substitution principle.
 *  I - Interface segregation principle.
 *  D - Dependency Inversion Principle.
 *  
 * 
 * 
 * 
 */

public class BillingImpl {

	private PriceMatrix priceMatrix;

	public BillingImpl(PriceMatrix priceMatrix) {
		this.priceMatrix = priceMatrix;
	}

	public double getTotalPrice(String[] cart) {
		double total = 0.0;
		for (String item : cart) {
			total += priceMatrix.getPrice(item);
		}
		return total;

	}

}
