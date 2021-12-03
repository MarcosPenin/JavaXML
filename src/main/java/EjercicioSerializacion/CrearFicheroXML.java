/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package EjercicioSerializacion;
import Serializacion.AltasObj;
import Serializacion.ListaAlumnos;
import java.io.EOFException;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import com.thoughtworks.xstream.*;
/**
 *
 * @author a20marcosgp
 */
public class CrearFicheroXML {
   
    
      public static void main(final String[] args) throws IOException, ClassNotFoundException {
              
        File fichero = new File("Personas.DAT");
        fichero.createNewFile();
        
        AltasPersonas.altas(fichero);
        
        FileInputStream lectura = new FileInputStream(fichero); //flujo de entrada
        // conecta el flujo de bytes al flujo de datos
        ObjectInputStream datos = new ObjectInputStream(lectura);
        System.out.println("Comienza el proceso de creación del fichero XML....");
        // Creamos un objeto Lista de personas

             
        ListaPersonas lista = new ListaPersonas();
        try{
            while(true){ // lectura del fichero
                Person persona = (Person)datos.readObject(); // leer un alumno
                lista.add(persona); //añadir un alumno a la lista
            }// fin while
        }catch(EOFException eo){}
        datos.close();
        try{
            XStream xstream = new XStream();
            //cambiar de nombrasce a las etiquetas XML
            xstream.alias("ListadoPersonas", ListaPersonas.class);
            xstream.alias("DatosPersona", Person.class);
            
            xstream.addImplicitCollection(ListaPersonas.class,
            "lista");
            //Insertar los objetos en el XML
            xstream.toXML(lista, new
            FileOutputStream("Personas.xml"));
            System.out.println("Creado el fichero xml");
        }catch(Exception e){
            e.printStackTrace();
        }
    }// fin main
}// fin clase
    

