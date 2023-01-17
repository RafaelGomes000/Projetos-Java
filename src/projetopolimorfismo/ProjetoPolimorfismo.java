package projetopolimorfismo;

public class ProjetoPolimorfismo {

    public static void main(String[] args) {
        
        Canguru c = new Canguru();
        Cachorro k = new Cachorro();
        Goldfish p = new Goldfish();
        Cobra cobra = new Cobra();
        
        c.locomover();
        k.locomover();
        p.alimentar();
        cobra.alimentar();
    }
    
}
