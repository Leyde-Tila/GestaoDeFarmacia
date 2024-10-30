/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package telas;

//import com.sun.glass.events.KeyEvent;
import java.awt.Color;
import java.awt.Font;
import java.awt.TextField;
import java.awt.event.FocusAdapter;
import java.awt.event.FocusEvent;
import java.awt.event.KeyEvent;
import javax.swing.JButton;
import javax.swing.JFormattedTextField;
import javax.swing.JLabel;
import javax.swing.JSeparator;
import javax.swing.JTextField;

/**
 *
 * @author Ernesto Argentina
 */
public class Validacao {
        public static String idioma="portugues";
        public static int idFuncionario=1;
        public static Font fonte=new Font("Serif", Font.ITALIC, 11);
        public static Font fonteNormal=new Font("Monospaced", Font.BOLD, 15);
        public static String frameAlerta="false";
        public static String frameError="false";
        public static String frameSucess="false";
        public static String frameDadosCliente="false";
        public static String mensagem="";

    static boolean verificarEmail(JFormattedTextField tf, JLabel lbEmail) {
         if (tf.getText().toString().contains("@") && tf.getText().toString().contains(".")
                  && !tf.getText().toString().contains(".@")
                  && !tf.getText().toString().contains("@.")
                  && !tf.getText().toString().endsWith(".")
                  && !tf.getText().toString().endsWith("@")) {
           lbEmail.setForeground(Color.BLUE);
          return false;
        }else{
          lbEmail.setForeground(Color.RED);
           return true;
        }
    }
    static boolean verificarNomeCompleto(JFormattedTextField tf, JLabel nomeC) {
         if (tf.getText().toString().trim().contains(" ")) {
           nomeC.setForeground(Color.BLUE);
          return false;
        }else{
          nomeC.setForeground(Color.RED);
           return true;
        }
    }


    public Validacao() {
       
        
    }
        
        
	
        
        
	  /**  * 
     * @param evt
     * @param tf 
     */
    public static void naoAceitarNumeros(java.awt.event.KeyEvent evt, JTextField tf) {
        //To change body of generated methods, choose Tools | Templates.
        if(evt.getKeyCode()==KeyEvent.VK_0 ||
                evt.getKeyCode()==KeyEvent.VK_1 ||
                evt.getKeyCode()==KeyEvent.VK_2 ||
                evt.getKeyCode()==KeyEvent.VK_3 ||
                evt.getKeyCode()==KeyEvent.VK_4 ||
                evt.getKeyCode()==KeyEvent.VK_5 ||
                evt.getKeyCode()==KeyEvent.VK_6 ||
                evt.getKeyCode()==KeyEvent.VK_7 ||
                evt.getKeyCode()==KeyEvent.VK_8 ||
                evt.getKeyCode()==KeyEvent.VK_9 ){
            tf.setEditable(false);
            tf.setBackground(Color.red);
            
        }else{
              tf.setEditable(true);
            tf.setBackground(Color.white);  
        }
    }
	
    
    
    
	
    public static void normaFont(JTextField tf,String s) {
        
        tf.setFont(fonteNormal);
        tf.setForeground(Color.BLACK);
     
    }
    
    
    public static void validarBI(JTextField tf,java.awt.event.KeyEvent evt) {
         if(tf.getText().toString().trim().length()<13){
           Validacao.permitirApenasNumero(evt, tf);
        }else{
            if((tf.getText().toString().trim().length()>13)){ 
         if(evt.getKeyCode()==KeyEvent.VK_BACK_SPACE){
             
              tf.setEditable(true);
          }else
              tf.setEditable(false);
            }else
           Validacao.naoAceitarNumeros(evt, tf);                
        } 
    }
    public static void limiteCaracteresInt(JTextField tf,java.awt.event.KeyEvent evt, int tamanho) {
         if(tf.getText().toString().trim().length()<tamanho-1){
           Validacao.permitirApenasNumero(evt, tf);
        }else{
            if((tf.getText().toString().trim().length()>tamanho-1)){ 
         if(evt.getKeyCode()==KeyEvent.VK_BACK_SPACE){
             
              tf.setEditable(true);
          }
         else
              tf.setEditable(false);
            }else
           Validacao.permitirApenasNumero(evt, tf);                
        } 
    }
    
    
    public static void validarAno(JTextField tfAno,java.awt.event.KeyEvent evt) {
        if((tfAno.getText().toString().trim().length()>3)){ 
         if(evt.getKeyCode()==KeyEvent.VK_BACK_SPACE){
             
              tfAno.setEditable(true);
          }else
              tfAno.setEditable(false);
            }else{
            tfAno.setEditable(true);
        }
    }
    
    
    public static void limitarTamanho(JTextField tfAno,java.awt.event.KeyEvent evt,int quantidade) {
        if((tfAno.getText().toString().trim().length()>quantidade-1)){ 
         if(evt.getKeyCode()==KeyEvent.VK_BACK_SPACE){
             
              tfAno.setEditable(true);
          }else
              tfAno.setEditable(false);
            }else{
            tfAno.setEditable(true);
        }
    }
    
    public static void limitarTamanhoString(JTextField tfAno,java.awt.event.KeyEvent evt,int quantidade) {
        if((tfAno.getText().toString().trim().length()>quantidade)){ 
         if(evt.getKeyCode()==KeyEvent.VK_BACK_SPACE){
             naoAceitarNumeros(evt, tfAno);
              //tfAno.setEditable(true);
          }else
             naoAceitarNumeros(evt, tfAno);
              tfAno.setEditable(false);
            }else{
             if(evt.getKeyCode()==KeyEvent.VK_BACK_SPACE){
             naoAceitarNumeros(evt, tfAno);
             }
           // tfAno.setEditable(true);
        }
    }
    
    public static boolean verificarEmail(JTextField tf,JSeparator sp) {
        if (!tf.getText().toString().contains("@") && !tf.getText().toString().contains(".")) {
          sp.setForeground(Color.RED);
          return false;
        }else{
           sp.setForeground(Color.RED);
           return true;
        }
    }
    
    
    
    
    
    
    
	/**
 * ao ganhar o focu a textFiel tem que verificar se o texto 
 * que estiver nela e' a do hint("o texto na como exemplo") ou nao
 * caso seja ela e' limpada para que se possa introduzir o texo desejado
 * @param tf
 * @param s 
 */
    public static void ganharFocus(JTextField tf,String s) {
        if(tf.getText().equals(s)){
        tf.setText("");
        tf.setFont(fonteNormal);
        tf.setForeground(Color.BLACK);
      } else 
        tf.setFont(fonte);
        tf.setForeground(Color.GRAY);
        
    }
	
	
	/**
 * ao perder o focu a textFiel tem que verificar se o texto 
 * que estiver nela e' a do hint("o texto na como exemplo") ou nao(pendente.......
 * @param tf
 * @param s 
 */
    public static void perderFoco(JTextField tf, String s) {
     if(tf.getText().equals("")){
        tf.setFont(fonte);
        tf.setForeground(Color.GRAY);
        tf.setText(s);
        }else
        tf.setFont(fonteNormal);
        tf.setForeground(Color.BLACK);
    }
    
    
    public static void setarHint(JTextField tf, String s){
        tf.setFont(fonte);    
        tf.setForeground(Color.gray);
        tf.setText(s);
        
        tf.addFocusListener(new FocusAdapter() {
            @Override
            public void focusLost(FocusEvent fe) {
                  if(tf.getText().equals("")){
        tf.setFont(fonte);
        tf.setForeground(Color.gray);
        tf.setText(s);
        }else
        tf.setForeground(Color.black);
        tf.setFont(fonteNormal);
            }

            @Override
            public void focusGained(FocusEvent fe) {
              if(tf.getText().equals(s)){
        tf.setForeground(Color.black);
        tf.setFont(fonteNormal);
        tf.setText("");
      } 
//              else 
//        tf.setForeground(Color.gray);
//        tf.setFont(fonte);   
            }
            
});
//       tf.setFont(fonte);    
//        tf.setForeground(Color.gray);     
    }
    
	
	
	/**
     * metodo que permite com que a textField passada por parametro
	 * aceite apenas os numeros
     * @param evt
     * @param tf 
     */
    public static void permitirApenasNumero(java.awt.event.KeyEvent evt, JTextField tf) {
          if(evt.getKeyCode()==KeyEvent.VK_0 ||
                evt.getKeyCode()==KeyEvent.VK_1 ||
                evt.getKeyCode()==KeyEvent.VK_2 ||
                evt.getKeyCode()==KeyEvent.VK_3 ||
                evt.getKeyCode()==KeyEvent.VK_4 ||
                evt.getKeyCode()==KeyEvent.VK_5 ||
                evt.getKeyCode()==KeyEvent.VK_6 ||
                evt.getKeyCode()==KeyEvent.VK_7 ||
                evt.getKeyCode()==KeyEvent.VK_8 ||
                evt.getKeyCode()==KeyEvent.VK_9 ||
                evt.getKeyCode()==KeyEvent.VK_ENTER ||
                evt.getKeyCode()==KeyEvent.VK_BACK_SPACE){
            
              tf.setEditable(true);
            tf.setBackground(Color.white);  
        }else{
            tf.setEditable(false);
            tf.setBackground(Color.red);
        }
     
    }
	
	
	/**
 * este metodo permite que ao clicar na tecla inter estando numa
 * textField a textField seguinte ganhe foco
 * a mesma e' passado por parametro(tFP)"proxima textField"
 * @param evt
 * @param tfP 
 */
    public  static void proximoFocu(java.awt.event.KeyEvent evt, JTextField tfP) {
          if(evt.getKeyCode()==KeyEvent.VK_ENTER){
              tfP.requestFocus(); 
          }
        }
	
	/**
	 * 
	 * @param tf
	 * @param s 
	 */
	public static void verificarPreechimento(JTextField tf,String s){
		if(tf.getText().equals(s)){
              tf.requestFocus(); 
              tf.setBackground(Color.red);
          }else  tf.setBackground(Color.white);
	}
	/**
	 * 
	 * @param tf
	 * @param s 
	 */
	public static void verificarPreechimento(JFormattedTextField tf,String s){
		if(tf.getText().equals(s)){
              tf.requestFocus(); 
              tf.setBackground(Color.red);
          }else  tf.setBackground(Color.white);
	}
	
     
}
