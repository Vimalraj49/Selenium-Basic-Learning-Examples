package testNG;

import org.testng.annotations.Test;

public class DependenciesManagement {
	
	@Test(enabled = true)
	public void HighSchool(){	
		System.out.println("High School");
	}
	
	@Test(dependsOnMethods = "HighSchool")
	public void HighSecSchool(){	
		System.out.println("High Secondary School");
	}
	
	@Test(dependsOnMethods = "HighSecSchool")
	public void College(){	
		System.out.println("College");
	}

}
