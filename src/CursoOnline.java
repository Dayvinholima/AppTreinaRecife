public class CursoOnline extends Curso{

    private String plataforma;
    
    public CursoOnline(String nome){
        super(nome);
    }
    public String getPlataforma() {
        return plataforma;
    }

    public void setPlataforma(String plataforma) {
        this.plataforma = plataforma;
    }


    public void exibirDetalhes(){
        super.exibirDetalhes();
        System.out.println("Plataforma " + this.plataforma);
    }


    @Override
    public double aplicarDesconto(double porcetagem){
        if (porcetagem > 0.10){
            System.out.println("Desconto acima do limite!!");
            
            return this.getPreco();
        }

        return super.aplicarDesconto(porcetagem);
    }



}
