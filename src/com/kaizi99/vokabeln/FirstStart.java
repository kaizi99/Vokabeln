package com.kaizi99.vokabeln;

import java.io.File;
import java.io.IOException;

public class FirstStart {

	private static final String FILE_DIR = System.getProperty("user.home") + "/Vokablen/";
	
	File f;
	
	public FirstStart() throws IOException
	{
		f = new File(FILE_DIR);
		if(firstStart())
		{
			f.mkdir();
		}
	}
	
	boolean firstStart()
	{
		if(f.exists())
		{
			return false;
		}
		return true;
	}
	
	public int anzahlVokabeln()
	{
		int i = 0;
		
		do
		{
			i++;
		}
		while(new File(FILE_DIR + i + ".voc").exists());
		
		return i;
	}
}
