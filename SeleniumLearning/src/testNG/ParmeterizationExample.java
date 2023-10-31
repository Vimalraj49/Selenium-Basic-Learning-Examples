package testNG;

import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class ParmeterizationExample {
	
	@Test
	@Parameters("Name")
	public void PrintName(String name) {
		System.out.println("Name is "+name);
	}

}
