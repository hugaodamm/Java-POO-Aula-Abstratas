package com.company;

public abstract class Produto {

    String descricao;

    public abstract void imprimirDescricao();

    public String getDescricao(){
        return descricao;
    }
}
