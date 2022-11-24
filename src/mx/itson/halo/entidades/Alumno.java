/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mx.itson.halo.entidades;

import mx.itson.halo.enumeradores.Resultado;

/**
 *  Define propiedades de alumno.
 * @author Emmanuel Rivas Q.
 */
public class Alumno {
   
    private String id;
    private String nombre;
    private Double calificacion;
    private Resultado resultado;

    /**
     * Recibe un valor llamado Id de la cadena JSON.
     * @return id
     */
    public String getId() {
        return id;
    }
    /**
     * Asigna un valor a id.
     * @param id 
     */
    public void setId(String id) {
        this.id = id;
    }
    /**
     * Recibe un valor llamado Nombre de la cadena JSON.
     * @return nombre
     */
    public String getNombre() {
        return nombre;
    }
    /**
     * Asigna un valor a Nombre.
     * @param nombre 
     */
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    /**
     * Recibe un valor llamado Calificacion de la cadena JSON.
     * @return calificacion
     */
    public Double getCalificacion() {
        return calificacion;
    }
    /**
     * Asigna un valor a Calificacion.
     * @param calificacion 
     */
    public void setCalificacion(Double calificacion) {
        this.calificacion = calificacion;
    }
    /**
     * Recibe un valor llamado Resultado (Enumerador) de la cadena JSON.
     * @return resultado
     */
    public Resultado getResultado() {
        return resultado;
    }
    /**
     * Asigna un valor a Resultado
     * @param resultado 
     */
    public void setResultado(Resultado resultado) {
        this.resultado = resultado;
    }
    
}
