package br.com.treina.recife;

import br.com.treina.recife.model.CursoOnline;
import br.com.treina.recife.model.CursoPresencial;
import br.com.treina.recife.model.Professor;

/**
 * App
 */
public class App {

    public static void main(String[] args) {
        
        Professor professor1 = new Professor();

        professor1.setNome("Rogério Aguiar");
        professor1.setEmail("rogerio.aguiar@treinarecife.com.br");
        professor1.setTelefone("(81) 98765-4321");

        Professor professor2 = new Professor();

        professor2.setNome("Alexandre de Souza Jr.");
        professor2.setEmail("alexandre.junior@treinarecife.com.br");
        professor2.setTelefone("(81) 98765-1234");

        CursoPresencial logicaComPython = new CursoPresencial("Lógica de Programação com Python");

        logicaComPython.setDescricao("Curso de lógica para iniciantes");
        logicaComPython.setPreco(59.59);
        logicaComPython.setCargaHoraria(30);
        logicaComPython.setProfessor(professor1);

        
        logicaComPython.exibirDetalhes();
        double novoPreco = logicaComPython.aplicarDesconto(0.1);
        System.out.println("Novo preço: " + novoPreco);


        CursoPresencial javaWeb = new CursoPresencial("Java Web com Spring Boot");

        javaWeb.setDescricao("Curso de java com Spring");
        javaWeb.setPreco(69.90);
        javaWeb.setCargaHoraria(30);
        javaWeb.setProfessor(professor2);

        javaWeb.exibirDetalhes();
        System.out.println("Novo preço: " + novoPreco);

        CursoOnline cursogit = new CursoOnline("Curso de Git e GitHub");

        cursogit.setDescricao("Curso online para aprender Git e GitHub");
        cursogit.setPreco(100);
        cursogit.setCargaHoraria(0);
        cursogit.setProfessor(professor2);
        cursogit.setPlatafomra("Hotmart");
        cursogit.aplicarDesconto(100);

        cursogit.exibirDetalhes();
        novoPreco = cursogit.aplicarDesconto(0.1);
        
        System.out.println("Novo preço: " + novoPreco);




    }
}