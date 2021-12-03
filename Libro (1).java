/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package JAXB.ejemplo;

/**
 *
 * @author mrnov
 */
/*
Java JAXB  o Java XML API Binding nos permite trabajar con XML y JSON 
de una forma cómoda usando Java.  
Vamos a ver una introducción a este estándar y sus anotaciones. Para ello nos  
apoyaremos en la clase Libro y  las anotaciones de JAXB:

*/
import java.time.LocalDate;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;

@XmlRootElement

@XmlAccessorType(XmlAccessType.FIELD)

public class Libro {
 
    private String titulo; 
    private int paginas;
     
    public Libro(String titulo, int paginas) {
        super();
        this.titulo = titulo;
        this.paginas = paginas;
    }
    public Libro() {
        super();
    }
    
    public String getTitulo() {
        return titulo;
    } 
        
    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }
    
    public int getPaginas() {
        return paginas;
    }
    public void setPaginas(int paginas) {
        this.paginas = paginas;
    }

}
