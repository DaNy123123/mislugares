/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package info.developia.mis.lugares;

/**
 *
 * @author manugarcia
 */
public class GeoPunto {

    private final int longitud;
    private final int latitud;

    public GeoPunto(double longitud, double latitud) {
        this.longitud = (int) (longitud * 1E6);
        this.latitud = (int) (latitud * 1E6);
    }
}
