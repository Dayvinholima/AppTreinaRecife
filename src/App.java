public class App {
    public static void main(String[] args) throws Exception {
        
        Professor professor1 = new Professor();

        professor1.nome = "Rogerio Aguiar";
        professor1.email = "rogerioaguiar@treinarecife.com.br";
        professor1.telefone = "(81) 987654321";   
        
        Professor professor2 = new Professor();

        professor2.nome = "Alexandre de souza jr.";
        professor2.email = "alexandre.junior@treinarecife.com.br";
        professor2.telefone = "(81) 987651234";
        
        
        Curso logicaComPython = new Curso();
        
        logicaComPython.nome = "Logica de programação com Phyton";
        logicaComPython.descricao = "Curso de lógica para iniciantes";
        logicaComPython.preco = 59.90;
        logicaComPython.cargaHoraria = 30;
        logicaComPython.professor = professor1;

        // double novoPreco = logicaComPython.aplicarDesconto(0.1);

        
        logicaComPython.exibirDetalhes();
        
        Curso javaWeb = new Curso();

        javaWeb.nome = "java web com spring Boot";
        javaWeb.descricao = "Curso de Java Web com Spring ";
        javaWeb.preco = 69.90;
        javaWeb.cargaHoraria = 48;
        javaWeb.professor = professor2;

        javaWeb.exibirDetalhes();
        



    }
}
