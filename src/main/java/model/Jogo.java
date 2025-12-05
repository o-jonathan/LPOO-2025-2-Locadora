/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

/**
 *
 * @author Jonathan
 */
@Entity
@Table(name = "jogos")
public class Jogo {

    /* Attributes */
    @Id
    @Column(name = "j_id")
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    private Long id;

    @Column(name = "j_nome")
    private String nome;

    @Column(name = "j_valor")
    private double valor;

    @Column(name = "j_locado")
    private boolean locado;

    @OneToMany(mappedBy = "produto")
    private List<Locacao> locacoes;

    /* Constructor */
    public Jogo() {
        locacoes = new ArrayList<>();
    }

    /* Getters and Setters */
 /* ID */
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    /* Locacões */
    public List<Locacao> getLocacoes() {
        return locacoes;
    }

    public void setLocacoes(List<Locacao> locacoes) {
        this.locacoes = locacoes;
    }

    /* Nome */
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    /* Valor */
    public double getValor() {
        return valor;
    }

    public void setValor(double valor) {
        this.valor = valor;
    }

    /* Locado */
    public String getLocadoAsString() {
        return locado ? "Locado" : "Disponível";
    }

    public boolean isLocado() {
        return locado;
    }

    public void setLocado(boolean locado) {
        this.locado = locado;
    }

    /* Methods */
    @Override
    public String toString() {
        return nome;
    }

    public String showData() {
        String aux = "";
        aux += "Nome: " + nome;
        aux += "\nValor: R$" + Util.formatDouble(valor);
        aux += "\nEstado: " + (locado ? "Locado" : "Disponível");
        return aux;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        Jogo other = (Jogo) obj;
        return this.getId() == other.getId();
    }

    @Override
    public int hashCode() {
        return Objects.hash(id);
    }
}
