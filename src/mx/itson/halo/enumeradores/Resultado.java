/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mx.itson.halo.enumeradores;
import com.google.gson.annotations.SerializedName;

/**
 * Esta clase define los enumeradores 
 * @author Emmanuel Rivas
 */
public enum Resultado {
    
    /**
     * Serializacion del enumerador APROBADO.
     */
     @SerializedName("1")
     APROBADO,
     
     /**
      * Serializacion del enumerador REPROBADO.
      */
     @SerializedName("2")
     REPROBADO
    
}
