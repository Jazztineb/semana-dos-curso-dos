package com.anncode.lambdas;

import java.security.MessageDigest;

public class Main {

	public static void main(String[] args) {
		
		OnOneListener oneListener = new OnOneListener() { //Funci�n anonima
			
			@Override
			public void onOne(String message) {
				// TODO Auto-generated method stub
				System.out.println("One: " + message);
			}
		};
		
		//Definici�n del cuerpo de lambda.
		OnOneListener oneListener2 = (String message) -> {
			System.out.println("One lambda :)" + message);
		};
		
		oneListener.onOne("Sin lambda :c");
		oneListener2.onOne("Con lambda :D");
		
		//Reacomodaci�n de lambda asignada a una variable
		OnOneListener oneListener3 = message -> System.out.println("Mi mensaje." + message);
	}

}
