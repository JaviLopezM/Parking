package classes;

import static classes.Principal.arrayParking;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;



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
    ObjectOutputStream surtida = new ObjectOutputStream(new FileOutputStream("vehicles.dat"));
    
    
}

    private InOut(String arxiudat) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    
}