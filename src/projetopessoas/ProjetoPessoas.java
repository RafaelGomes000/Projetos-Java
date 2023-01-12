package projetopessoas;

public class ProjetoPessoas {

    public static void main(String[] args) {
      
       Visitante v1 = new Visitante();
       Aluno a1 = new Aluno();
       Bolsista b1 = new Bolsista();
       
       v1.setNome("Ronaldo");
       v1.setIdade(25);
       v1.setSexo("M");
       
       a1.setNome("Rafael");
       a1.setIdade(23);
       a1.setCurso("Informática");
       a1.setMatricula(1111);
       a1.setSexo("M");
       a1.pagarMensalidade();
       
       b1.setNome("Robert");
       b1.setIdade(23);
       b1.setCurso("Direito");
       b1.setMatricula(1222);
       b1.setSexo("M");
       b1.pagarMensalidade();
       
       
       
       System.out.println(v1.toString());
        System.out.println(a1.toString());
    }
    
}
