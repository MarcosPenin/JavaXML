/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package EjercicioSerializacion;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author a20marcosgp
 */
public class ListaPersonas implements Serializable{
      private List <Person> lista = new ArrayList<Person> ();
	
    public ListaPersonas() {
	super();
    }

    public void add(Person persona) {
    	lista.add(persona);
    }

    public List<Person> getListaPersona() {
    	return lista;
    }
}  