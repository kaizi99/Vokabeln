package com.kaizi99.vokabeln;

import java.io.IOException;

public class Main {

	public static void main(String[] args){
		try {
			new FirstStart();
		} catch (IOException e) {
			e.printStackTrace();
		}
		
		VokabelManager vocMan = new VokabelManager();
		System.out.println(vocMan.getRandomVokabelID());
		System.out.println(vocMan.getRandomVokabelID());
		System.out.println(vocMan.getRandomVokabelID());
		System.out.println(vocMan.getRandomVokabelID());
		System.out.println(vocMan.getRandomVokabelID());
		System.out.println(vocMan.getRandomVokabelID());
		System.out.println(vocMan.getRandomVokabelID());
		System.out.println(vocMan.getRandomVokabelID());
		System.out.println(vocMan.getRandomVokabelID());
		System.out.println(vocMan.getRandomVokabelID());
	}

}
