package com.maven.project.TestProject;

import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class TestExample {

	@Test
	@Parameters("Env")
	public void testMethod(String name) {
        System.out.println("Name that was passed in via Jenkins job " + name);
    }
	
}
