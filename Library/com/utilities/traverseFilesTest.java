package com.utlities;

import static org.junit.Assert.*;

import org.junit.Test;

public class traverseFilesTest {

	@Test
	public void test() {
		traverseFiles tree = new traverseFiles();
		tree.traverseAllFiles("C:\\workspace\\com.prototype\\test_dir");
		assertEquals(5, tree.getFileCount());
	}

}
