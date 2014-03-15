package com.kaizi99.vokabeln;

import java.io.IOException;

public class Main {

	public static void main(String[] args){
		
		int AnzahlVokabeln = 0;
		
		try {
			FirstStart fs = new FirstStart();
			AnzahlVokabeln = fs.anzahlVokabeln();
		} catch (IOException e) {
			e.printStackTrace();
		}
		
		new Program(AnzahlVokabeln);
	}

}
