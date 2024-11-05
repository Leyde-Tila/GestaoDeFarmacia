/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Model;

import java.util.Date;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

/**
 *
 * @author Leide Tila
 */
@Entity
public class Cliente {
  @Id
  @GeneratedValue  
  private long id;
  private String nome;
  private String telefone;
  private String morada;
  private Date anoNascimento;
  private String alergia;
  private String descricao;

    public Cliente() {
    }

  
    public Cliente(long id, String nome, String telefone, String morada, Date anoNascimento, String alergia, String descricao) {
        this.id = id;
        this.nome = nome;
        this.telefone = telefone;
        this.morada = morada;
        this.anoNascimento = anoNascimento;
        this.alergia = alergia;
        this.descricao = descricao;
    }

   
    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    public String getMorada() {
        return morada;
    }

    public void setMorada(String morada) {
        this.morada = morada;
    }

    public Date getAnoNascimento() {
        return anoNascimento;
    }

    public void setAnoNascimento(Date anoNascimento) {
        this.anoNascimento = anoNascimento;
    }

    public String getAlergia() {
        return alergia;
    }

    public void setAlergia(String alergia) {
        this.alergia = alergia;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }
  
  
  
}
