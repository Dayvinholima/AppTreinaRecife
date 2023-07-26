public class Professor {
    
    private String nome;
    private String email;
    private String telefone;

    public Professor(){
        
    }
    
    

    public Professor(String nome) {
        this.nome = nome;
    }

    



    public Professor(String nome, String telefone) {
        this.nome = nome;
        this.telefone = telefone;
    }



    public String getNome() {
        return nome;
    }


    public void setNome(String nome) {
        this.nome = nome;
    }


    public String getEmail() {
        return email;
    }


    public void setEmail(String email) {
        this.email = email;
    }


    public String getTelefone() {
        return telefone;
    }


    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }



    public void exibirDetalhes(){
        
        System.out.println("Nome: " + nome);
        System.out.println("Email: " + email);
        System.out.println(telefone);
        
    }



    
}
