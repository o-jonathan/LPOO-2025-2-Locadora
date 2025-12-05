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
@Table(name="funcionarios")
public class Funcionario extends Pessoa {
    /* Attributes */
    @Id
    @Column(name="f_id")
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    private Long id;
    
    @Column(name="f_salario")
    private double salario;
    
    @OneToMany(mappedBy = "vendedor")
    private List<Locacao> locacoes;
    
    
    
    /* Constructor */
    public Funcionario() {
        locacoes = new ArrayList<>();
    }

    

    /* Getter and Setter */
    /* ID */
    public Long getId() {
        return id;
    }
    public void setId(Long id) {
        this.id = id;
    }

    /* Salário */
    public double getSalario() {
        return salario;
    }
    public void setSalario(double salario) {
        this.salario = salario;
    }
    
    /* Locacões */
    public List<Locacao> getLocacoes() {
        return locacoes;
    }
    public void setLocacoes(List<Locacao> locacoes) {
        this.locacoes = locacoes;
    }
    
    
    
    /* Methods */
    @Override
    public String showData() {
        String aux = super.showData();
        aux += "\nSalário: R$" + Util.formatDouble(salario);
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
        Funcionario other = (Funcionario) obj;
        return this.getId() == other.getId();
    }

    @Override
    public int hashCode() {
        return Objects.hash(id);
    }
}
