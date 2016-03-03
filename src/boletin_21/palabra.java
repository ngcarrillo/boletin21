/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package boletin_21;

import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

/**
 *
 * @author Nuria
 */
public class palabra {

    private int num;
    ArrayList<String> palabras = new ArrayList();

    public void numPalabras() {
        num = Integer.parseInt(JOptionPane.showInputDialog("cuantas palabras vas a añadir?"));

    }
    public void crearArray(){
    
    for (int i = 0; i < num; i++) {
       palabras.add(JOptionPane.showInputDialog("Introduce una palabra"));
    }
    Collections.sort(palabras);
    System.out.println(palabras);
  
    }
    
    public void CrearFichero() {
        FileWriter fw = null;
        try {
           fw = new FileWriter("palabras.txt");
           for (int i = 0; i < palabras.size(); i++){
             fw.write(i + palabras.get(i)+"\n");
           //  fw.write("\n");
             fw.append('\n');   
                     }
           
        } catch (IOException e) {
            System.out.println("Error" + e);
            
        }finally{
            try {
                fw.close();
            } catch (IOException ex) {
                Logger.getLogger(palabra.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }
}
