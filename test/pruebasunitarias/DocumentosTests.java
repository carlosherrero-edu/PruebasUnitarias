package pruebasunitarias;

import org.junit.platform.runner.JUnitPlatform;
import org.junit.platform.suite.api.SelectClasses;
import org.junit.runner.RunWith;


@RunWith(JUnitPlatform.class)
@SelectClasses({LetrasNIFTest.class, LetrasNIETest.class})

public class DocumentosTests {
	

}
