package com.prototype;

import static org.junit.Assert.*;

import org.junit.Test;



public class ExtractJarFileTest {

	@Test
	public void testExtractJar() {
		ExtractJarFile extractTest = new ExtractJarFile();
		extractTest.extractJar("test_dir.jar", "C:\\workspace\\com.prototype\\test_extract_dir");
		fail("Not yet implemented");
	}

}
