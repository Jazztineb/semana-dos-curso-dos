package com.anncode.amazonviewer.db;

public class Database {
	
	public static final String URL 		= "jdbc:mysql://localhost:3306/";
	public static final String DB		= "amazonviewer";
	public static final String USER		= "amazonviewer";
	public static final String PASSWORD	= "amazonviewer";
	
	//Mapeo de tablas
	//Mapear resto de tablas con campos
	
	public static final String TMOVIE			= "movie";
	public static final String TMOVIE_ID		= "id";
	public static final String TMOVIE_title		= "title";
	public static final String TMOVIE_genre		= "genre";
	public static final String TMOVIE_creator	= "creator";
	public static final String TMOVIE_duration	= "duration";
	public static final String TMOVIE_year		= "year";
	
	public static final String TMATERIAL 	= "material";
	public static final int[] ID_TMATERIALS 	= {1,2,3,4,5};
	
	public static final String TUSER 			= "user";
	public static final int TUSER_IDUSUARIO 		= 1;
	
	public static final String TVIEWED 				= "viewed";
	public static final String TVIEWED_IDMATERIAL 	= "id_material";
	public static final String TVIEWED_IDELEMENT 	= "id_element";
	public static final String TVIEWED_IDUSUARIO 	= "id_user";
	public static final String TVIEWED_DATE			= "date_viewed";
}
