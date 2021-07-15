package com.anncode.amazonviewer.model;

import java.util.Date;

public interface IVisualizable {
	
	/**
	 * Este método captura el tiempo exacto de inicio de visualización.
	 * @param 	dateI es un objeto de tipo {@code Date} con el tiempo de inicio exacto.
	 * @return	devuelve la fecha y hora capturada.
	 * */
	Date startToSee(Date dateI);
	
	/**
	 * Este método captura el tiempo exacto de inicio y final de visualización
	 * 
	 * @param dateI es un objeto {@code Date} con el tiempo inicio exacto.
	 * @param dateF es un objeto {@code Date} con el tiempo final exacto.
	 * */
	void stopToSee(Date dateI, Date dateF);
	
}
