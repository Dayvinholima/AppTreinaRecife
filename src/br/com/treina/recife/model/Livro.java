package br.com.treina.recife.model;

import br.com.treina.recife.interfaces.Produto;

public class Livro implements Produto{
    
    private String nome;
    private double preco;
    private Editora editora;

    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }
    public double getPreco() {
        return preco;
    }
    public void setPreco(double preco) {
        this.preco = preco;
    }
    public Editora getEditora() {
        return editora;
    }
    public void setEditora(Editora editora) {
        this.editora = editora;
    }

    @Override
    public double aplicarDesconto (double porcentagem){
        if (porcentagem > 0.15){
            System.out.println("Desconto acima do limite!");
            
            return this.getPreco();
        }
            double precoAtual = getPreco();
            double desconto = precoAtual * porcentagem;
            double novoPreco = precoAtual - desconto;

            setPreco(novoPreco);

            return novoPreco;
        

    }
    
}