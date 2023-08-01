public class CursoPresencial extends Curso {
    private String salaDeAula;

    public CursoPresencial(String nome){
        super(nome);
    }

    public String getSalaDeAula() {
        return salaDeAula;
    }

    public void setSalaDeAula(String salaDeAula) {
        this.salaDeAula = salaDeAula;
    }
    
}
