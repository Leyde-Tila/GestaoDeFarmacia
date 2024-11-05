/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package projecthib;

import DAO.GenericController;
import Model.Pessoa;
import java.util.List;
import telas.Login;

/**
 *
 * @author edilt
 */
public class ProjectHib {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        new Login().setVisible(true);
        return;

        //Pessoa objPessoa = new Pessoa("P001","Leyd", "Matola", "872778288");
        // Para grvaer na base de dados:
        //new GenericController().add(objPessoa);
        // Para buscar todos numa dada table:
        //List<Pessoa> listaPessoa = (List<Pessoa>) new GenericController().listar(Pessoa.class);
//        System.out.println("Todos na tabela pessoa:");
//        for(Pessoa obj: listaPessoa){
//            System.out.println(obj.toString());
//        }
//        
//        // Para actualizar alguem
//        Pessoa objAchado = null;
//        for(Pessoa obj: listaPessoa){
//            if(obj.getCodigo().equals("P001")){
//                objAchado = obj;
//                break;
//            }
//        }
//        
//        if(objAchado == null){
//            System.out.println("Nao encontrado!!!");
//        }else{
//        
//        objAchado.setTelefone("841111111");
//        objAchado.setMorada("Tangara");
//        new GenericController().atualizarPorCodigo(Pessoa.class, "P001", objAchado);
//        }
//        
////        // Para buscar todos numa dada table:
//        List<Pessoa> listaPessoas = (List<Pessoa>) new GenericController().listar(Pessoa.class);
//        System.out.println("Todos na tabela pessoa:");
//        for(Pessoa obj: listaPessoas){
//            System.out.println(obj.toString());
//        }
        // Se fosse para apagar era so actualizar o estado dele para false, e true para recuperar
    }

}
