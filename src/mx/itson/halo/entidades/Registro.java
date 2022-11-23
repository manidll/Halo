/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mx.itson.halo.entidades;

import com.google.gson.Gson;
import java.util.Date;
import java.util.List;


/**
 * Clase principal del paquete entidades y define las propiedades de Registro.
 * @author Emmanuel Rivas Q.
 */
public class Registro {
    
    private String titulo;
    private String descripcion;
    private String nombreEscuela;
    private Date fecha;
    private List<Alumno> alumnos;
    
    /**
     * Deserealiza una cadena JSON 
     * @param json busca el formato JSON
     * @return registro
     */
    
    public Registro deserializar (String json){
        Registro registro = new Registro();
        try{
            registro = new Gson().fromJson(json, Registro.class);
        }catch(Exception ex){
            System.err.print("Ocurrio un error: " + ex.getMessage());
        }
        return registro;
    }
    /**
     * Recibe un valor llamado Titulo desde la cadena JSON.
     * @return titulo
     */
    public String getTitulo() {
        return titulo;
    }
    /**
     * Asigna un valor a Titulo.
     * @param titulo 
     */
    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }
    /**
     * Recibe un valor llamado Descripcion desde la cadena JSON.
     * @return descripcion
     */
    public String getDescripcion() {
        return descripcion;
    }
    /**
     * Asigna un valor a Descripcion.
     * @param descripcion 
     */
    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }
    /**
     * Recibe un valor llamado nombreEscuela desde la cadena JSON.
     * @return nombreEscuela
     */
    public String getNombreEscuela() {
        return nombreEscuela;
    }
    /**
     * Asigna un valor a nombreEscuela.
     * @param nombreEscuela 
     */
    public void setNombreEscuela(String nombreEscuela) {
        this.nombreEscuela = nombreEscuela;
    }
    /**
     * Recibe un valor llamado Fecha desde la cadena JSON.
     * @return fecha
     */
    public Date getFecha() {
        return fecha;
    }
    /**
     * Asigna un valor a Fecha.
     * @param fecha 
     */
    public void setFecha(Date fecha) {
        this.fecha = fecha;
    }
    /**
     * Recibe las propiedades de la lista Alumnos en la cadena JSON.
     * @return alumnos
     */
    public List<Alumno> getAlumnos() {
        return alumnos;
    }
    /**
     * Asigna los valores a la lista Alumnos.
     * @param alumnos 
     */
    public void setAlumnos(List<Alumno> alumnos) {
        this.alumnos = alumnos;
    }

   

    
    
}
