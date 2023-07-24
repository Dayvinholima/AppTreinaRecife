public class Terrestre extends MeioDeTransporte {
    private int qtdeRoda;
    private double potencia;

    // Construtor padrão
    public Terrestre() {
        super(); // Chama o construtor padrão da superclasse
    }

    // Construtor que recebe todos os parâmetros para inicializar os dados do meio de transporte terrestre
    public Terrestre(int id, short ano, String modelo, double cargaMaxima, int qtdeRoda, double potencia) {
        super(id, ano, modelo, cargaMaxima); // Chama o construtor da superclasse com os parâmetros correspondentes
        this.qtdeRoda = qtdeRoda;
        this.potencia = potencia;
    }

    // Getters e Setters para os atributos da subclasse
    public int getQtdeRoda() {
        return qtdeRoda;
    }

    public void setQtdeRoda(int qtdeRoda) {
        this.qtdeRoda = qtdeRoda;
    }

    public double getPotencia() {
        return potencia;
    }

    public void setPotencia(double potencia) {
        this.potencia = potencia;
    }

    // Sobrescrita do método consumo específico para o meio de transporte terrestre
    @Override
    public double consumo() {// Implementação do consumo para o meio de transporte terrestre (não especificado na questão

        return 0.0; // Necessário implementar o cálculo real do consumo
    }
}