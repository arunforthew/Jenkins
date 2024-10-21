package com.greens;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;


	@RunWith(Cucumber.class)
	@CucumberOptions(glue="",features = "src\\test\\resources",dryRun = false,   plugin = {"pretty"} )
	public class TestRunner{
	
		
		
	

}


