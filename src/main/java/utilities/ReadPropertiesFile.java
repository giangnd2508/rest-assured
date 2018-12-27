package utilities;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

public class ReadPropertiesFile {

	String uri, port;
	Properties prop;

	public ReadPropertiesFile() throws IOException {
		prop = readProperties();
	}

	public Properties readProperties() throws IOException {
		prop = new Properties();
		String baseDir = System.getProperty("user.dir") + File.separator + "config.properties";
		FileInputStream inputStream = new FileInputStream(baseDir);
		try {
			prop.load(inputStream);
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			inputStream.close();
		}
		return prop;
	}

	public String getURI() throws FileNotFoundException {
		return uri = prop.getProperty("uri");
	}

	public int getPort() throws FileNotFoundException {
		String port = prop.getProperty("port");
		int result = Integer.parseInt(port);
		return result;
	}

}
