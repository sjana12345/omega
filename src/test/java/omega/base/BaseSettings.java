package omega.base;

import omega.config.CoreTestParameters;

public class BaseSettings extends CoreTestParameters{
	
	public static String getPropertyValue(String key) {
		String value=getInstance().getProperty(key);
		return value;
	}
	
	public static void setPropertyValue(String key,String value) {
		getInstance().setProperty(key, value);
	}
	
	public static void setPropertyParam(String key,String value) {
		getInstance().setTestParam(key, value);
	}
	
	public static void deletePropertyParam(String key) {
		getInstance().deleteTestParam(key);
	}

}
