package programingknowledge;
//import org.junit.*;

//import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.*;

public class BacisAnotationTest {
	
	@BeforeAll
	public static void RunOnceBeforeEachClass() 
	{
	         System.out.println ("@BeforeClass -RunOnceBeforeEachClas");
	}
	@AfterAll
	public static void RunOnceAfterEachClass() 
	{
	         System.out.println ("@AfterClass -RunOnceAfterEachClass");
	}
	@BeforeEach
	public  void RunOnceBefore() 
	{
	         System.out.println ("@Before -RunOnceBefore");
	}
	@AfterEach
	public void RunOnceAfter() 
	{
	         System.out.println ("@After -RunOnceAfter");
	}
	
	@Test
	void testMethod_1() 
	{
		System.out.println ("@testMethod -testMethod_1");
	}
	@Test
	void testMethod_2() 
	{
		System.out.println ("@testMethod -testMethod_2");
	}@Disabled
	@Test
	void testMethod_3() 
	{
		System.out.println ("@testMethod test-testMethod_3");
	}
}
