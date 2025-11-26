/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

import java.time.LocalDateTime;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

/**
 *
 * @author Jonathan
 */
@Entity
@Table(name="locacoes")
public class Locacao {
    /* Attributes */
    @Id
    @Column(name="l_id")
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    private Long id;
    
    @Column(name="l_data", nullable = false)
    private LocalDateTime dataLocacao;
    
    @Column(name="l_devolucao", nullable = false)
    private LocalDateTime dataDevolucao;
    
    @Column(name="l_prazo")
    private int prazo;
    
    @Column(name="l_valor", columnDefinition = "numeric(12,2)")
    private double valor;
    
    @Enumerated(EnumType.STRING)
    @Column(name="l_pgto")
    private FormaPGTO pgto;
    
    @ManyToOne
    @JoinColumn(name="l_produto")
    private Jogo produto;
    
    @ManyToOne
    @JoinColumn(name="l_cliente")
    private Cliente cliente;
    
    @ManyToOne
    @JoinColumn(name="l_vendedor")
    private Funcionario vendedor;
    
    
    
    /* Getters and Setters */
    /* ID */
    public Long getId() {
        return id;
    }
    public void setId(Long id) {
        this.id = id;
    }
    
    /* Data de Locação */
    public LocalDateTime getDataLocacao() {
        return dataLocacao;
    }
    public void setDataLocacao(LocalDateTime dataLocacao) {
        this.dataLocacao = dataLocacao;
    }
    
    /* Data de Devolução */
    public LocalDateTime getDataDevolucao() {
        return dataDevolucao;
    }
    public void setDataDevolucao(LocalDateTime dataDevolucao) {
        this.dataDevolucao = dataDevolucao;
    }
    
    /* Prazo */
    public int getPrazo() {
        return prazo;
    }
    public void setPrazo(int prazo) {
        this.prazo = prazo;
    }
    
    /* Valor */
    public double getValor() {
        return valor;
    }
    public void setValor(double valor) {
        this.valor = valor;
    }
    
    /* Forma de Pagamento */
    public FormaPGTO getPgto() {
        return pgto;
    }
    public void setPgto(FormaPGTO pgto) {
        this.pgto = pgto;
    }

    /* Produto */
    public Jogo getProduto() {
        return produto;
    }
    public void setProduto(Jogo produto) {
        this.produto = produto;
    }

    /* Cliente */
    public Cliente getCliente() {
        return cliente;
    }
    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    /* Funcionário */
    public Funcionario getVendedor() {
        return vendedor;
    }
    public void setVendedor(Funcionario vendedor) {
        this.vendedor = vendedor;
    }
    
    
    
    /* Methods */
    @Override
    public String toString() {
        return produto.toString();
    }
    
    public String showData() {
        String aux = "";
        aux += "Cliente: " + cliente.toString();
        aux += "\nVendedor: " + vendedor.toString();
        aux += "\nProduto: " + produto.toString();
        aux += "\nValor: R$" + Util.formatDouble(valor);
        aux += "\nPrazo: " + prazo;
        aux += "\nData Compra: " + Util.formatDateTime(dataLocacao);
        aux += "\nData Devolução: " + Util.formatDateTime(dataDevolucao);
        return aux;
    }
}
