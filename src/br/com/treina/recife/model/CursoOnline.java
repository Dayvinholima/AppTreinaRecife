package br.com.treina.recife.model;

import br.com.treina.recife.abstracts.Curso;

public class CursoOnline extends Curso {
    
    private String plataforma;

    public CursoOnline (String nome){
        super(nome);
    }

    public String getPlataforma() {
        return plataforma;
    }

    public void setPlatafomra(String plataforma) {
        this.plataforma = plataforma;
    }


    public void exibirDetalhes(){
        super.exibirDetalhes();
        System.out.println("Plataforma: " + plataforma);
    }
    
    public double aplicarDesconto (double porcentagem){
        if (porcentagem > 0.15){
            System.out.println("Desconto acima do limite!");
        
        }
            double precoAtual = getPreco();
            double desconto = precoAtual * porcentagem;
            double novoPreco = precoAtual - desconto;

            setPreco(novoPreco);

            return novoPreco;

}

}