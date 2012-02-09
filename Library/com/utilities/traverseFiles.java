package com.utilities;

import java.io.File;
import java.util.ArrayList;


public class traverseFiles {

	ArrayList<String> files = new ArrayList<String>();
	int i = 0;
	
	// Process only files under dir
	public void traverseAllFiles(File dir) {
	    if (dir.isDirectory()) {
	        String[] children = dir.list();
	        for (int i=0; i<children.length; i++) {
	        	traverseAllFiles(new File(dir, children[i]));
	        }
	    } else {
	    	files.add(i++,dir.toString());
	    }
	}
	
	public void traverseAllFiles(String dirString) {
		File dir = new File(dirString);
		traverseAllFiles(dir);
	}
	
	public int getFileCount() {
		return files.size();
	}
	
}
