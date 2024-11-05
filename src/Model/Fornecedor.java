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
    private int nuit;
    private int nib;
    private String email;
    private int telefone;

    public Fornecedor() {
    }

    public Fornecedor(int id, String nome, String endereço, int nuit, int nib, String email, int telefone) {
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

    public int getNuit() {
        return nuit;
    }

    public void setNuit(int nuit) {
        this.nuit = nuit;
    }

    public int getNib() {
        return nib;
    }

    public void setNib(int nib) {
        this.nib = nib;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public int getTelefone() {
        return telefone;
    }

    public void setTelefone(int telefone) {
        this.telefone = telefone;
    }
    
    
}
