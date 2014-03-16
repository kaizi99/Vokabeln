package com.kaizi99.utils;

public class Statics {

	public static final String HOME_DIR_WINDOWS = System.getenv("APPDATA") + "/Vokabeln/";
	public static final String FILE_DIR = System.getProperty("user.home") + "/Vokablen/";
	
	public static String FILE_DIR()
	{
		String system = System.getProperty("os.name");
		String[] split = system.split(" ");
		if(split[0] == "Windows")
		{
			return HOME_DIR_WINDOWS;
		} else
		{
			return FILE_DIR;
		}
	}
}
