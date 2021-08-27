package com.company;

public class ProdutoPerecivel extends Produto {

    String descricao;
    String dataValidade; // Por enquanto, até refatorar com a classe Date.

    @Override
    public void imprimirDescricao() {
        // Digitar a lógica....
        System.out.println("Descrição: " + getDescricao() + ". Vencendo em: " +dataValidade);
    }
}
