/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DOM;

import java.io.BufferedReader;
import java.io.File;
import java.io.IOException;
import java.io.RandomAccessFile;

/**
 *
 * @author a20marcosgp
 */
public class Fichero {
     public static void borrar(BufferedReader br, File fichero)throws IOException{
        
        if(fichero.exists()){
            
                fichero.delete();
                System.out.println("-- Fichero eliminado --");
            
        }else System.out.println("El fichero no existe");
    }
    
    public static void crear(File fichero)throws IOException{
        
        if(!fichero.exists()){
        
            RandomAccessFile fas = new RandomAccessFile(fichero, "rw");
            fas.close();
            System.out.println("-- Fichero creado --");
            
        }else System.out.println("El fichero ya existe");
    }
    
    public static int numeroRegistros(File fichero)throws IOException{
        
        int nRegs = 0;
        if(fichero.exists()){
            
            RandomAccessFile raf = new RandomAccessFile(fichero, "r");
            nRegs = (int)Math.ceil((float)raf.length()/140);
            raf.close();
            
        }
        return nRegs;
    }
}


