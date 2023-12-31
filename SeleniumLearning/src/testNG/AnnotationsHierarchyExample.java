package testNG;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.AfterSuite;

public class AnnotationsHierarchyExample {
  @Test
  public void f() {
	  System.out.println("im Test");
  }
  @BeforeMethod
  public void beforeMethod() {
	  System.out.println("im Before method");
  }

  @AfterMethod
  public void afterMethod() {
	  System.out.println("im After method");
  }

  @BeforeClass
  public void beforeClass() {
	  System.out.println("im Before class");
  }

  @AfterClass
  public void afterClass() {
	  System.out.println("im After class");
  }

  @BeforeTest
  public void beforeTest() {
	  System.out.println("im Before Test");
  }

  @AfterTest
  public void afterTest() {
	  System.out.println("im After Test");
  }

  @BeforeSuite
  public void beforeSuite() {
	  System.out.println("im Before Suite");
  }

  @AfterSuite
  public void afterSuite() {
	  System.out.println("im After Suite");
  }

}
