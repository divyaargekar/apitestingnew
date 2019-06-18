package Utility;

public class UserDefinedFunctions {
	public static String getTestCaseName(String sTestCase) {
		String value = sTestCase;
		try {

			int position = value.indexOf("@");
			value = value.substring(0, position);
			position = value.lastIndexOf(".");
			value = value.substring(position + 1);
			return value;
		} catch (Exception e) {

			Log.error("Class Utils | Method getTestCaseName | Exception desc : " + e.getMessage());

			throw (e);
		}
	}
}