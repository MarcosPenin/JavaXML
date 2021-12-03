/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Conversion;

import org.w3c.dom.*;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import javax.xml.transform.Result;
import javax.xml.transform.Source;
import javax.xml.transform.Transformer;
import javax.xml.transform.TransformerFactory;
import javax.xml.transform.stream.StreamResult;
import javax.xml.transform.stream.StreamSource;

public class Ej1Conversion {

    public static void main(String[] args) {

        String origen = "clientes.xml";
        String estilo1 = "clientes_HTML.xsl";
        String estilo2 = "clientes_CSV.xsl";

        String salida1 = "clientes_new.html";
        String salida2 = "clientes_new.csv";
//
//        String hojaEstilo = "librosPlantilla.xsl";
//        String datosLibros = "Libros.xml";
//        File paginaHTML = new File("mipagina_new.html");

        FileOutputStream foi = null;
        // fuentes XSL "librosPlantilla.xsl";
        Source estilos = null;

        // fuente XML "Libros.xml";
        Source datos = null;
        //resultado de la transformacion
        Result resultado = null;
        // hacer la transformacion
        Transformer transformer = null;
        try {
            //crea el fichero HTML "mipagina.html"
            foi = new FileOutputStream(salida1);
            // fuentes XSL "librosPlantilla.xsl";
            estilos = new StreamSource(estilo1);

            // fuente XML "Libros.xml";
            datos = new StreamSource(origen);
            //resultado de la transformacion
            resultado = new StreamResult(foi);

            //Transformamos el resultado
            transformer = TransformerFactory.newInstance().newTransformer(estilos);
            //obtiene el HTML
            transformer.transform(datos, resultado);
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (Exception e) {
            e.printStackTrace();
        }

        try {
            //crea el fichero HTML "mipagina.html"
            foi = new FileOutputStream(salida2);

            // fuentes XSL "librosPlantilla.xsl";
            estilos = new StreamSource(estilo2);

            // fuente XML "Libros.xml";
            datos = new StreamSource(origen);
            //resultado de la transformacion
            resultado = new StreamResult(foi);

            //Transformamos el resultado
            transformer = TransformerFactory.newInstance().newTransformer(estilos);
            //obtiene el HTML
            transformer.transform(datos, resultado);
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (Exception e) {
            e.printStackTrace();
        }

        try {
            foi.close();
        } catch (IOException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
    }
}
