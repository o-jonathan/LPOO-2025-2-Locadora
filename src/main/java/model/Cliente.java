/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

import java.util.ArrayList;
import java.util.List;
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
@Table(name="clientes")
public class Cliente extends Pessoa {
    /* Attributes */
    @Id
    @Column(name="c_id")
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    private Long id;
    
    @OneToMany(mappedBy = "cliente")
    private List<Locacao> locacoes;
    
    
    
    /* Constructor */
    public Cliente() {
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
    
    /* Locacões */
    public List<Locacao> getLocacoes() {
        return locacoes;
    }
    public void setLocacoes(List<Locacao> locacoes) {    
        this.locacoes = locacoes;
    }
}
