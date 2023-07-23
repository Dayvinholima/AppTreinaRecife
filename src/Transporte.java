public class Transporte {
    private Integer id;
    private Integer ano;
    private String modelo;
    private Double carga_maxima;
    private Double potencia;

    // Construtor padrão
    public Transporte() {
    }

    // Construtor que recebe todos os parâmetros para inicializar os dados de um transporte
    public Transporte(Integer id, Integer ano, String modelo, Double carga_maxima, Double potencia) {
        this.id = id;
        this.ano = ano;
        this.modelo = modelo;
        this.carga_maxima = carga_maxima;
        this.potencia = potencia;
    }

    public Double consumo() {
        // Retorna o consumo = potência do motor x carga máxima (kg) x 100
        return potencia * carga_maxima * 100;
    }

    public String leiaModelo() {
        // Lê o modelo do transporte
        return modelo;
    }

    public void gravaModelo(String modelo) {
        // Grava o modelo no atributo da classe
        this.modelo = modelo;
    }

    // Getters e Setters para os atributos da classe
    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getAno() {
        return ano;
    }

    public void setAno(Integer ano) {
        this.ano = ano;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public Double getCarga_maxima() {
        return carga_maxima;
    }

    public void setCarga_maxima(Double carga_maxima) {
        this.carga_maxima = carga_maxima;
    }

    public Double getPotencia() {
        return potencia;
    }

    public void setPotencia(Double potencia) {
        this.potencia = potencia;
    }
}