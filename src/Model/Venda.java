/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Model;

import java.math.BigDecimal;
import java.time.LocalDateTime;
import java.util.Date;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;

/**
 *
 * @author leide tila
 */
@Entity
public class Venda {
    @Id
    @GeneratedValue
    private long id;
    @ManyToOne
    private Cliente cliente;
    @ManyToOne
    private Produto produto;
     @ManyToOne
    private Usuario usuario;
    private Double totalDavenda;
    private Double valorpago;
    private Double desconto;
    private Double troco;
    private int quantidade;
    private Date dataHoraCriacao;
    private Date ultimaActualizacao;

    public Venda(long id, Cliente cliente, Produto produto, Usuario usuario, Double totalDavenda, Double valorpago, Double desconto, Double troco, int quantidade, Date dataHoraCriacao, Date ultimaActualizacao) {
        this.id = id;
        this.cliente = cliente;
        this.produto = produto;
        this.usuario = usuario;
        this.totalDavenda = totalDavenda;
        this.valorpago = valorpago;
        this.desconto = desconto;
        this.troco = troco;
        this.quantidade = quantidade;
        this.dataHoraCriacao = dataHoraCriacao;
        this.ultimaActualizacao = ultimaActualizacao;
    }

    public Venda() {
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    public Produto getProduto() {
        return produto;
    }

    public void setProduto(Produto produto) {
        this.produto = produto;
    }

    public Usuario getUsuario() {
        return usuario;
    }

    public void setUsuario(Usuario usuario) {
        this.usuario = usuario;
    }

    public Double getTotalDavenda() {
        return totalDavenda;
    }

    public void setTotalDavenda(Double totalDavenda) {
        this.totalDavenda = totalDavenda;
    }

    public Double getValorpago() {
        return valorpago;
    }

    public void setValorpago(Double valorpago) {
        this.valorpago = valorpago;
    }

    public Double getDesconto() {
        return desconto;
    }

    public void setDesconto(Double desconto) {
        this.desconto = desconto;
    }

    public Double getTroco() {
        return troco;
    }

    public void setTroco(Double troco) {
        this.troco = troco;
    }

    public int getQuantidade() {
        return quantidade;
    }

    public void setQuantidade(int quantidade) {
        this.quantidade = quantidade;
    }

    public Date getDataHoraCriacao() {
        return dataHoraCriacao;
    }

    public void setDataHoraCriacao(Date dataHoraCriacao) {
        this.dataHoraCriacao = dataHoraCriacao;
    }

    public Date getUltimaActualizacao() {
        return ultimaActualizacao;
    }

    public void setUltimaActualizacao(Date ultimaActualizacao) {
        this.ultimaActualizacao = ultimaActualizacao;
    }
 
}
