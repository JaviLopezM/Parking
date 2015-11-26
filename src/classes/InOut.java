package classes;

import static classes.Array.arrayParking;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;



public class InOut implements java.io.Serializable {

    public static void llegir(String s){
       try{
        File arxiu= new File(s);
        if (arxiu.exists()){
            ObjectInputStream entrada = new ObjectInputStream(new FileInputStream(arxiu));
            int i=0;
            Array.arrayParking.clear();
            while(true)
            {
                try{
                    Array.arrayParking.add((Vehicle)entrada.readObject());
                    
                }
                catch(Exception ex){
                     
                    break;
                }
            }
            entrada.close();
        }
       }
       catch(Exception e){
           JOptionPane.showMessageDialog(null, "Error al llegir l'arxiu d'origen");
               
       }
       
}
public static void escriure(String s){
    File arxiu= new File(s);
    ObjectOutputStream surtida=null;
        try {
            surtida = new ObjectOutputStream(new FileOutputStream(arxiu));
        } catch (IOException ex) {
            JOptionPane.showMessageDialog(null, "Error al guardar l'arxiu   1");
        } 
    for(int i=0;i<Array.arrayParking.size();i++)
    {
        try {
            surtida.writeObject(Array.arrayParking.get(i));
        } catch (IOException ex) {
            Logger.getLogger(InOut.class.getName()).log(Level.SEVERE, null, ex);
            break;
        }
       
    }
    if(surtida!=null) try {
        surtida.close();
    } catch (IOException ex) {
      JOptionPane.showMessageDialog(null, "Error al tancar l'arxiu.");

    }
    JOptionPane.showMessageDialog(null, "Dades guardades correctament.");
}

    

    
}