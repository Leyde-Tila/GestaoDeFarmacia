/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

/**
 *
 * @author Leide
 */

@Entity
public class Fornecedor {
    @Id
    @GeneratedValue
    private int id;
    private String nome;
    private String endereço;
    private String nuit;
    private String nib;
    private String email;
    private String telefone;

    public Fornecedor() {
    }

    public Fornecedor(int id, String nome, String endereço, String nuit, String nib, String email, String telefone) {
        this.id = id;
        this.nome = nome;
        this.endereço = endereço;
        this.nuit = nuit;
        this.nib = nib;
        this.email = email;
        this.telefone = telefone;
    
}
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getEndereço() {
        return endereço;
    }

    public void setEndereço(String endereço) {
        this.endereço = endereço;
    }

    public String getNuit() {
        return nuit;
    }

    public void setNuit(String nuit) {
        this.nuit = nuit;
    }

    public String getNib() {
        return nib;
    }

    public void setNib(String nib) {
        this.nib = nib;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    @Override
    public String toString() {
        return nome + " // " + endereço;
    }

    
    
    
}
