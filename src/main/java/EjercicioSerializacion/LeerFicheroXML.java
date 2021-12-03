
package EjercicioSerializacion;

import Serializacion.ListaAlumnos;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import com.thoughtworks.xstream.XStream;

public class LeerFicheroXML {
     public static void main(final String[] args) throws FileNotFoundException {
        //crear una instancia de la clase XStream
        XStream xstream = new XStream();
        
        //Para que no de Errores de acceso de Tipos
        xstream.allowTypes(new Class[] {Person.class,ListaPersonas.class});
        
        //cambiar de nombre a las etiquetas XML
        xstream.alias("ListadoPersonas", ListaPersonas.class);
        xstream.alias("DatosPersona", Person.class);
        
        //quitar etiqueta lista (atributo de la clase ListaAlumnos
        xstream.addImplicitCollection(ListaPersonas.class, "lista");
        ListaPersonas listadoTodas = (ListaPersonas) xstream.fromXML(new FileInputStream("Personas.xml"));
        System.out.println("Número de personas: "+listadoTodas.getListaPersona().size());
        
        List<Person> listaPersonas = new ArrayList<Person>();
        listaPersonas = (List<Person>) listadoTodas.getListaPersona();
        
        Iterator iterator = listaPersonas.listIterator(); //recorrer los elementos
        while(iterator.hasNext()){
            Person p = (Person) iterator.next(); //obtenemos el elemento
            System.out.println(p.getFirstname()+" "+p.getLastname());
          
        }// fin del while
        System.out.println("\n\nFin del listado... ");
    }// fin main
}//fin clase
    
    
    

