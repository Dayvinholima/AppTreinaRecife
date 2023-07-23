public class MeioDeTransporte {
    private int id;
    private short ano;
    private String modelo;
    private double cargaMaxima;

    // Construtor padrão
    public MeioDeTransporte() {
    }

    // Construtor que recebe todos os parâmetros para inicializar os dados do meio de transporte
    public MeioDeTransporte(int id, short ano, String modelo, double cargaMaxima) {
        this.id = id;
        this.ano = ano;
        this.modelo = modelo;
        this.cargaMaxima = cargaMaxima;
    }

    public double consumo() {
        // Implementação do consumo para o meio de transporte (não especificado na questão)
        return 0.0; // Necessário implementar o cálculo real do consumo
    }

    // Getters e Setters para os atributos da classe
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public short getAno() {
        return ano;
    }

    public void setAno(short ano) {
        this.ano = ano;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public double getCargaMaxima() {
        return cargaMaxima;
    }

    public void setCargaMaxima(double cargaMaxima) {
        this.cargaMaxima = cargaMaxima;
    }
}