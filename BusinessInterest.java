package com.epam.Logger;
import java.lang.Math;
public class BusinessInterest extends Client{

	public float simple_interest(int p,int t,float r) {
	
		return  (p*t*r/100);
	}
	public float compound_interest(int p,int t,float r) {
		
		float c;
		c=(float) (p*Math.pow(1+(r/100),t));
		return c;
	}
	
	
}