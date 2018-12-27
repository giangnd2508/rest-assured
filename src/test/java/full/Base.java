package full;

import org.testng.annotations.BeforeTest;

import io.restassured.RestAssured;
import utilities.ReadPropertiesFile;

public class Base {

	ReadPropertiesFile prop;

	@BeforeTest(alwaysRun = true)
	public void intialize() throws Exception {
		RestAssured.baseURI = ReadPropertiesFile.getURI();
		RestAssured.port = ReadPropertiesFile.getPort();
	}

}
