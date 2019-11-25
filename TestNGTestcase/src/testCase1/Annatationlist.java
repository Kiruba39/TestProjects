package testCase1;
import org.testng.annotations.AfterClass;
import org.testng.annotations.Test;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;

public class Annatationlist {

@Test
public void testCase1()

	{
	System.out.println("This is Testcase1");
	}

@Test
public void testCase2()

{
System.out.println("This is Testcase2");
}

@BeforeMethod
public void beforeMethod()

{
System.out.println("Before every Method");
}

@AfterMethod
public void afterMethod()

{
System.out.println("After every Method");
}



@BeforeClass
public void beforeClass()

{
System.out.println("Before every Class");
}

@AfterClass
public void afterClass()

{
System.out.println("After every Class");
}

@BeforeSuite
public void beforeSuite()

{
System.out.println("Before every Suite");
}

@AfterSuite
public void afterSuite()

{
System.out.println("After every Suite");
}


}
