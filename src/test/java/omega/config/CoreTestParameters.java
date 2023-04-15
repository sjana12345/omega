package omega.config;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.util.Properties;
import java.util.Set;

public class CoreTestParameters {
	
	private final static Properties configurationProperties = new Properties();
	
	private static class LazyHolder{
		private static final CoreTestParameters INSTANCE = new CoreTestParameters();
	}
	
	public static CoreTestParameters getInstance() {
		return LazyHolder.INSTANCE;
	}
	
	public String getProperty(String key) {
		return configurationProperties.getProperty(key);
	}
	
	public Set<String> getAllPropertyNames(){
		return configurationProperties.stringPropertyNames();
	}
	
	public void setTestParam(String key, String value) {
		configurationProperties.put(key, value);
		commit();
	}
	
	public void deleteTestParam(String key) {
		configurationProperties.remove(key);
		commit();
	}
	
	public void containsKey(String key) {
		configurationProperties.containsKey(key);
	}
	
	public CoreTestParameters() {
		try {
			final InputStream inputstream = new FileInputStream(System.getProperty("user.dir")+"\\src\\main\\resources\\application.properties");
			configurationProperties.load(inputstream);
		} catch (Exception e) {
			// TODO: handle exception
		}
	}
	
	public void setProperty(String key, String value) {
		configurationProperties.setProperty(key, value);
		commit();
	}
	public void commit() {
		try (final OutputStream outputstream = new FileOutputStream(System.getProperty("user.dir")+"\\src\\main\\resources\\application.properties");){
			configurationProperties.store(outputstream, "File Updated");
			outputstream.close();
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
