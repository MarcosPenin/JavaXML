/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Serializacion;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
/**
 *
 * @author a20marcosgp
 */
public class ListaAlumnos {
      private List <Alumno> lista = new ArrayList<Alumno> ();
	
    public ListaAlumnos() {
	super();
    }

    public void add(Alumno alumno) {
    	lista.add(alumno);
    }

    public List<Alumno> getListaAlumno() {
    	return lista;
    }
}  

