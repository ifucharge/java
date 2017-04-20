package com.lax.properties;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;

public class TestProperties {
	public static void main(String[] args) throws FileNotFoundException, IOException {
		Properties ppt=new Properties();
		//ppt.load(new FileInputStream("d:/新建文件夹/test.properties"));
		InputStream in=TestProperties.class.getResourceAsStream("test.properties");
		ppt.load(in);
		System.out.println(ppt.getProperty("name"));
		
	}

}
