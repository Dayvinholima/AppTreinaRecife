public class App {
    public static void main(String[] args) throws Exception {
        
        Professor professor1 = new Professor();

        professor1.setNome("Rogerio Aguiar") ;
        professor1.setEmail("rogerioaguiar@treinarecife.com.br");
        professor1.setTelefone("(81) 987654321");   
        
        Professor professor2 = new Professor();

        professor2.setNome("Alexandre de souza jr.");
        professor2.setEmail("alexandre.junior@treinarecife.com.br");
        professor2.setTelefone("(81) 987651234");
        
        
        Curso logicaComPython = new Curso();
        
        logicaComPython.setNome("Logica de programação com Phyton") ;
        logicaComPython.setDescricao("Curso de lógica para iniciantes");
        logicaComPython.setPreco(59.90);
        logicaComPython.setCargaHoraria(30);
        logicaComPython.setProfessor(professor1);

        // double novoPreco = logicaComPython.aplicarDesconto(0.1);

        
        logicaComPython.exibirDetalhes();
        
        Curso javaWeb = new Curso();

        javaWeb.setNome("java web com spring Boot");
        javaWeb.setDescricao("Curso de Java Web com Spri");
        javaWeb.setPreco(69.90);
        javaWeb.setCargaHoraria(48);
        javaWeb.setProfessor(professor2);

        //javaWeb.exibirDetalhes();
        
        CursoOnline cursoGit = new CursoOnline();

        cursoGit.setNome("curso de Git e Github");
        cursoGit.setPlataforma("Hotmart");


    }
}
