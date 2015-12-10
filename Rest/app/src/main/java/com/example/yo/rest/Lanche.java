package com.example.yo.rest;

/**
 * Created by yo on 26/11/2015.
 */
public class Lanche {
    private String nome;
    private String ingredientes;
    private double valor;


    public Lanche(){

    }

    public Lanche(String nome, String ingredientes, double valor){
        this.nome = nome;
        this.ingredientes = ingredientes;
        this.valor = valor;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getIngredientes() {
        return ingredientes;
    }

    public void setIngredientes(String ingredientes) {
        this.ingredientes = ingredientes;
    }

    public double getValor() {
        return valor;
    }

    public void setValor(double valor) {
        this.valor = valor;
    }

    @Override
    public String toString(){
        return nome;
    }
}
