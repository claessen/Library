package com.prototype;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.jar.*;
import java.util.Enumeration;

public class ExtractJarFile {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
	}
	
	public void extractJar(String jarFile, String extractDir) {
		File destDir = new File(extractDir); 
		JarFile jar = null;
		try {
			jar = new java.util.jar.JarFile(jarFile);
		} catch (IOException e2) {
			// TODO Auto-generated catch block
			e2.printStackTrace();
		}
		
		// Create the base directory
		if (destDir.exists) {
			
		}
		
		Enumeration a = jar.entries(); 
		while (a.hasMoreElements()) {
		    java.util.jar.JarEntry file = (JarEntry) a.nextElement();
		    java.io.File f = new java.io.File(destDir + java.io.File.separator + file.getName());
		    if (file.isDirectory()) { // if its a directory, create it
		        f.mkdir();
		        continue;
		    }
		    java.io.InputStream is = null;
			try {
				is = jar.getInputStream(file);
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			} // get the input stream
		    java.io.FileOutputStream fos = null;
			try {
				fos = new java.io.FileOutputStream(f);
			} catch (FileNotFoundException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		    try {
				while (is.available() > 0) {  // write contents of 'is' to 'fos'
				    fos.write(is.read());
				}
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		    try {
				fos.close();
			} catch (IOException e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
			}
		    try {
				is.close();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}

	}

	

}
