public class Curso {
    
    String nome;
    String descricao;
    double preco;
    int cargaHoraria;
    Professor professor;

    void exibirDetalhes (){

        String mensagem = "Detalhes do Curso";
        System.out.println(mensagem);
        System.out.println("Nome do Curso" + nome);
        System.out.println("Descrição do Curso "+ descricao);
        System.out.println("Valor do Curso " + preco);
        System.out.println("Carga Horária: " + cargaHoraria);
        professor.exibirDetalhes();
        System.out.println("-------------");


    }

    double aplicarDesconto(double porcetagem){
        
        preco -= preco * porcetagem;

        return preco;
    }

    

}
