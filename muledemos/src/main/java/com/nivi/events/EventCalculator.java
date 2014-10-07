package com.nivi.events;


import java.util.Random;

import org.mule.api.MuleContext;
import org.mule.api.annotations.expressions.Lookup;
import org.mule.api.registry.MuleRegistry;
import org.mule.api.registry.RegistrationException;

public class EventCalculator {

	
	@Lookup
	private MuleContext muleContext;
	public void getEventId() throws RegistrationException
	{
		
		System.out.println("getEventId   - starts ");		
		MuleRegistry muleRegistry = muleContext.getRegistry();		
        String globalVarValue = muleContext.getRegistry().get("valueFromTheLastRun");	
		System.out.println("first global value ::::: before changed ::"+globalVarValue);		
		Random rand = new Random();
	    int randomNum = rand.nextInt(10) ;		
		muleRegistry.registerObject("valueFromTheLastRun", Integer.toString(randomNum));		
        globalVarValue = muleContext.getRegistry().get("valueFromTheLastRun");		
		System.out.println("After global value changed ::::::      "+globalVarValue);
		System.out.println("getEventId   - ends ");
		//return "success";	    
	}

}
