package com.kaizi99.vokabeln;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class VokabelReader {

	private static final String FILE_DIR = System.getProperty("user.home") + "/Vokablen/";
	
	private int id;
	private String deutsch;
	private String english;
	
	public VokabelReader(String id) throws IOException
	{
		String file = FILE_DIR + id + ".voc";
		
		FileReader fr = new FileReader(file);
		BufferedReader reader = new BufferedReader(fr);
		
		this.id = Integer.parseInt(id);
		deutsch = reader.readLine();
		english = reader.readLine();
		
		reader.close();
		fr.close();
	}
	
	public String getDeutsch()
	{
		return deutsch;
	}
	
	public String getEnglish()
	{
		return english;
	}
	
	public int id()
	{
		return id;
	}
	
}
