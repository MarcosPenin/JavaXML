/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Serializacion;

/**
 *
 * @author a20marcosgp
 */
import java.io.Serializable;
class Alumno implements Serializable{
    public String dni;
    public String nombre;
    public String telefono;
   

    String getDni() {
        return dni;
    }
    
    String getNombre() {
        return nombre;
    }

    String getTelefono() {
        return telefono;
    }

}

