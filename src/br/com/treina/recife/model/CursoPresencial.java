package br.com.treina.recife.model;

import br.com.treina.recife.abstracts.Curso;

public class CursoPresencial extends Curso {
    
    private String salaDeAula;

    public CursoPresencial (String nome){
        super(nome);
    }

    public String getSalaDeAula() {
        return salaDeAula;
    }

    public void setSalaDeAula(String salaDeAula) {
        this.salaDeAula = salaDeAula;
    }

    @Override
    public double aplicarDesconto(double porcentagem){
        System.out.println("Curso presencial não tem desconto!");
        return getPreco();
    }
    
}