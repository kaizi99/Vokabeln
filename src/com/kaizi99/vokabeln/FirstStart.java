package com.kaizi99.vokabeln;

import java.io.File;
import java.io.IOException;
import com.kaizi99.utils.*;

public class FirstStart {

	private static final String FILE_DIR = Statics.FILE_DIR();
	
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
