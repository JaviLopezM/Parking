package classes;

import static classes.Principal.arrayParking;
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
        File arxiu= new File("vehicles.dat");
        if (arxiu.exists()){
            ObjectInputStream entrada = new ObjectInputStream(new FileInputStream(arxiu));
            int i=0;
            while(true)
            {
                try{
                    Principal.arrayParking.add((Vehicle)entrada.readObject());
                    i++;
                }
                catch(Exception ex){
                    break;
                }
            }
            entrada.close();
        }
       }
       catch(Exception e){
           System.out.println(e);
               
       }
       
}
public static void escriure(String s){
    File arxiu= new File("vehicles.dat");
    ObjectOutputStream surtida=null;
        try {
            surtida = new ObjectOutputStream(new FileOutputStream("vehicles.dat"));
        } catch (IOException ex) {
            JOptionPane.showInputDialog("Error al crear l'arxiu d'emmagatzematge.");
           //JOptionPane.showMessageDialog(this, "Vehicle afegit correctament.");
            //Logger.getLogger(InOut.class.getName()).log(Level.SEVERE, null, ex);
        } 
    for(int i=0;i<Principal.arrayParking.size();i++)
    {
        try {
            surtida.writeObject(Principal.arrayParking.get(i));
        }
        catch(Exception ex){
            //JOptionPane.showMessageDialog(Error al guardar l'arxiu");
            break;
        }
    }
    if(surtida!=null) try {
        surtida.close();
    } catch (IOException ex) {
        //JOptionPane.showInputDialog("Error al guardar l'arxiu");
        //Logger.getLogger(InOut.class.getName()).log(Level.SEVERE, null, ex);
    }
    
}

    

    
}