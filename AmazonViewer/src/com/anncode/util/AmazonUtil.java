package com.anncode.util;

import java.util.Scanner;

/**
 * <h1>AmazonUtil</h1>
 * Permite ingresar datos por consola.
 * <p>
 * Cuando se ingresa la información, valída que el dato ingresado sea de 0 a 6
 * mediante el método {@code validateUserResponseMenu()}.
 * 
 * @author 	Justine Briceño Cortez
 * @since	2021
 * @version 1.1
 * */

public class AmazonUtil {
	
	public static int validateUserResponseMenu(int min, int max) {
		//Leer la respuesta del usuario
		Scanner sc = new Scanner(System.in);
		
		//Validar respuesta int
		while(!sc.hasNextInt()) {
			sc.next();
			System.out.println("No ingresaste una opción válida");
			System.out.println("Intenta otra vez");
		}
		
		int response = sc.nextInt();
		
		//Validar rango de respuesta
		while(response < min || response > max) {
			//Solicitar de nuevo la respuesta
			System.out.println("No ingresaste una opción válida");
			System.out.println("Intenta otra vez");
			
			while(!sc.hasNextInt()) {
				sc.next();
				System.out.println("No ingresaste una opción válida");
				System.out.println("Intenta otra vez");
			}
			response = sc.nextInt();
		}
		System.out.println("Tu Respuesta fue: " + response + "\n");
		return response;
	}

}
