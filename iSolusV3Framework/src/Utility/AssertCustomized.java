package Utility;

import org.testng.asserts.SoftAssert;

public class AssertCustomized {
	
	public static void softAssert(Boolean  Actualvalue)
	{
		 SoftAssert softAssertion= new SoftAssert();
		 softAssertion.assertEquals(Actualvalue, "True");
	}
	

}
