package full;

import org.testng.annotations.BeforeTest;

import io.restassured.RestAssured;
import utilities.ReadPropertiesFile;

public class Base {

	ReadPropertiesFile prop;

	@BeforeTest(alwaysRun = true)
	public void intialize() throws Exception {
		prop = new ReadPropertiesFile();
		RestAssured.baseURI = prop.getURI();
		RestAssured.port = prop.getPort();
	}

}
