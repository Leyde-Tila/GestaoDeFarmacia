/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package telas;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Leide
 */
class FicheiroLinguas {
   
    private static String nomeFicheiro="DefinicoesIdioma";
    private static String idioma="portugues";
    

    public FicheiroLinguas() {
    }
    
    
    public static boolean adicionar(String s){
        System.out.println(s);
        try{
            FileOutputStream meuFicheiro=new FileOutputStream(nomeFicheiro);
            ObjectOutputStream os=new ObjectOutputStream(meuFicheiro);
            os.writeObject(s);
            meuFicheiro.flush();
            meuFicheiro.close();
            os.close();
return true;
        } catch (Exception ex) {
            Logger.getLogger(FicheiroLinguas.class.getName()).log(Level.SEVERE, null, ex);
        }
       return false; 
    }
    
    public static String ler(){
        try{
            FileInputStream meuFicheiro=new FileInputStream(nomeFicheiro);
            ObjectInputStream in=new ObjectInputStream(meuFicheiro);
            idioma=(String)in.readObject();
            meuFicheiro.close();
            in.close();
            
        } catch (Exception ex) {
            Logger.getLogger(FicheiroLinguas.class.getName()).log(Level.SEVERE, null, ex);
        }
        return idioma;
    }
//    public static void main(String[] args) {
////        adicionar("portugues");
//        adicionar("ingles");
//        
//    }
  
}


