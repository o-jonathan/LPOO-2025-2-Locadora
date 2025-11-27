/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

import javax.persistence.MappedSuperclass;

/**
 *
 * @author Jonathan
 */
@MappedSuperclass
public abstract class Pessoa {
    /* Attributes */
    private String nome;
    private String cpf;
    
    
    
    /* Getters and Setters */
    /* Nome */
    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }

    /* CPF */
    public String getCpf() {
        return cpf;
    }
    public void setCpf(String cpf) {
        this.cpf = cpf;
    }
    
    
    
    /* Methods */
    @Override
    public String toString() {
        return nome;
    }
    
    public String showData() {
        String aux = "";
        aux += "Nome: " + nome;
        aux += "\nCPF: " + Util.formatCPF(cpf);
        return aux;
    }
}
