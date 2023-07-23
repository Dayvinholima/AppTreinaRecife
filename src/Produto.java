import java.util.Date;

public class Produto {
    private Integer id;
    private String nome;
    private String descricao;
    private Date validade;

    // Construtor padrão
    public Produto() {
    }

    // Construtor que recebe todos os parâmetros para inicializar os dados de um produto
    public Produto(Integer id, String nome, String descricao, Date validade) {
        this.id = id;
        this.nome = nome;
        this.descricao = descricao;
        this.validade = validade;
    }

    public Integer getCod() {
        // Retorna o identificador da classe instanciada, ou seja, o "id"
        return id;
    }

    // Getters e Setters para os atributos da classe
    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
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

    public Date getValidade() {
        return validade;
    }

    public void setValidade(Date validade) {
        this.validade = validade;
    }
}