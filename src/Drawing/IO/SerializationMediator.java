/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Drawing.IO;

import Drawing.Domain.Drawing;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.Properties;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Thomas
 */
public class SerializationMediator implements PersistencyMediator{

    private Properties props;
    
    @Override
    public Drawing load(String name) {
        try {
            // Load the file in a stream
            FileInputStream fileIn = new FileInputStream(name);
            ObjectInputStream objIn = new ObjectInputStream(fileIn);

            // Retrieve the drawing object
            Drawing d = (Drawing) objIn.readObject();

            // Close streams
            objIn.close();
            fileIn.close();

            return d;

        } catch (IOException | ClassNotFoundException ex) {
            Logger.getLogger(SerializationMediator.class.getName()).log(Level.SEVERE, null, ex);
        }

        return null;
    }

    @Override
    public boolean save(Drawing drawing) {
        try {
            // Write object to file
            FileOutputStream fileOut = new FileOutputStream(drawing.getName());
            ObjectOutputStream objOut = new ObjectOutputStream(fileOut);
            objOut.writeObject(drawing);

            // Close streams
            objOut.close();
            fileOut.close();

            return true;

        } catch (IOException ex) {
            System.out.println(ex);
        }

        return false;
    }

    @Override
    public boolean init(Properties props) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
