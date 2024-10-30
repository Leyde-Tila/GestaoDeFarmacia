/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Model;

import java.math.BigDecimal;
import java.time.LocalDateTime;
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
    private BigDecimal totalDavenda;
    private BigDecimal valorpago;
    private BigDecimal desconto;
    private BigDecimal troco;
    private LocalDateTime dataHoraCriacao;
    private LocalDateTime ultimaActualizacao;

    public Venda() {
    }

    public Produto getProduto() {
        return produto;
    }

    public void setProduto(Produto produto) {
        this.produto = produto;
    }

    public Venda(long id, Cliente cliente, Produto produto, Usuario usuario, BigDecimal totalDavenda, BigDecimal valorpago, BigDecimal desconto, BigDecimal troco, LocalDateTime dataHoraCriacao, LocalDateTime ultimaActualizacao) {
        this.id = id;
        this.cliente = cliente;
        this.produto = produto;
        this.usuario = usuario;
        this.totalDavenda = totalDavenda;
        this.valorpago = valorpago;
        this.desconto = desconto;
        this.troco = troco;
        this.dataHoraCriacao = dataHoraCriacao;
        this.ultimaActualizacao = ultimaActualizacao;
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

    public Usuario getUsuario() {
        return usuario;
    }

    public void setUsuario(Usuario usuario) {
        this.usuario = usuario;
    }

    public BigDecimal getTotalDavenda() {
        return totalDavenda;
    }

    public void setTotalDavenda(BigDecimal totalDavenda) {
        this.totalDavenda = totalDavenda;
    }

    public BigDecimal getValorpago() {
        return valorpago;
    }

    public void setValorpago(BigDecimal valorpago) {
        this.valorpago = valorpago;
    }

    public BigDecimal getDesconto() {
        return desconto;
    }

    public void setDesconto(BigDecimal desconto) {
        this.desconto = desconto;
    }

    public BigDecimal getTroco() {
        return troco;
    }

    public void setTroco(BigDecimal troco) {
        this.troco = troco;
    }

    public LocalDateTime getDataHoraCriacao() {
        return dataHoraCriacao;
    }

    public void setDataHoraCriacao(LocalDateTime dataHoraCriacao) {
        this.dataHoraCriacao = dataHoraCriacao;
    }

    public LocalDateTime getUltimaActualizacao() {
        return ultimaActualizacao;
    }

    public void setUltimaActualizacao(LocalDateTime ultimaActualizacao) {
        this.ultimaActualizacao = ultimaActualizacao;
    }
    
    
    
}
