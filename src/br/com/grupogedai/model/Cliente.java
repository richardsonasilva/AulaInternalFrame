/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.grupogedai.model;

/**
 *
 * @author suporte.richardson
 */
public class Cliente {

    private String nome;
    private String sobrenome;
    private String sexo;
    private Integer idade;

    public Cliente() {
        this.nome = "";
        this.sobrenome = "";
        this.sexo = "";
        this.idade = 0;
    }

    public Cliente(String nome, String sobrenome, String sexo, Integer idade) {
        this.nome = nome;
        this.sobrenome = sobrenome;
        this.sexo = sexo;
        this.idade = idade;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getSobrenome() {
        return sobrenome;
    }

    public void setSobrenome(String sobrenome) {
        this.sobrenome = sobrenome;
    }

    public String getSexo() {
        return sexo;
    }

    public void setSexo(String sexo) {
        this.sexo = sexo;
    }

    public Integer getIdade() {
        return idade;
    }

    public void setIdade(Integer idade) {
        this.idade = idade;
    }

}
