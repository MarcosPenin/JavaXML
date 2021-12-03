/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package EjercicioSerializacion;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import javax.swing.JOptionPane;

/**
 *
 * @author a20marcosgp
 */
public class AltasPersonas {

    public static void altas(File fichero) throws IOException {

        String nombre = JOptionPane.showInputDialog("Escribe el nombre de la persona");

        String apellido = JOptionPane.showInputDialog("Escribe el apellido de la persona");

        String telefono = JOptionPane.showInputDialog("Escribe el teléfono de la persona");

        String fax = JOptionPane.showInputDialog("Escribe el fax de la persona");

        PhoneNumber t = new PhoneNumber(986, telefono);
        PhoneNumber f = new PhoneNumber(123, fax);

        Person p = new Person(nombre, apellido, t, f);

        if (fichero.length() == 0) {
            ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream(fichero));
            oos.writeObject(p);
            oos.close();

        } else {
            MiObjectOutputStream mios = new MiObjectOutputStream(new FileOutputStream(fichero, true));
            mios.writeObject(p);
            mios.close();
        }
    }
}
