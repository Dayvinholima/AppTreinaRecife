public class Curso {
    
    private String nome;
    private String descricao;
    private double preco;
    private int cargaHoraria;
    private Professor professor;

    
    
    public Curso(String nome) {
        this.nome = nome;
    }
    
    public Curso(String nome, String descricao) {
        this.nome = nome;
        this.descricao = descricao;
    }
    
    public Curso(String nome, String descricao, double preco) {
        this.nome = nome;
        this.descricao = descricao;
        this.preco = preco;
    }
    
    public Curso(String nome, String descricao, Professor professor) {
        this.nome = nome;
        this.descricao = descricao;
        this.professor = professor;
    }

    public Curso(String nome, String descricao, int cargaHoraria) {
        this.nome = nome;
        this.descricao = descricao;
        this.cargaHoraria = cargaHoraria;
    }

    public String getNome() {
        return nome;
    }


    public void setNome(String nome) {
        this.nome = nome;
    }


    public String getDescricao() {
        return descricao;
    }


    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }


    public double getPreco() {
        return preco;
    }


    public void setPreco(double preco) {
        this.preco = preco;
    }


    public int getCargaHoraria() {
        return cargaHoraria;
    }


    public void setCargaHoraria(int cargaHoraria) {
        this.cargaHoraria = cargaHoraria;
    }


    public Professor getProfessor() {
        return professor;
    }


    public void setProfessor(Professor professor) {
        this.professor = professor;
    }


    public void exibirDetalhes (){

        String mensagem = "Detalhes do Curso";
        System.out.println(mensagem);
        System.out.println("Nome do Curso" + nome);
        System.out.println("Descrição do Curso "+ descricao);
        System.out.println("Valor do Curso " + preco);
        System.out.println("Carga Horária: " + cargaHoraria);
        professor.exibirDetalhes();
        System.out.println("-------------");


    }

    public double aplicarDesconto(double porcetagem){
        
        preco -= preco * porcetagem;

        return preco;
    }

    

}
