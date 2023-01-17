package projetovideo;

import java.awt.BorderLayout;

public class ProjetoVideo {

    public static void main(String[] args) {
        Video v[] = new Video [3];
        
        v[0] = new Video("Aula 1 de PHP");
        v[1] = new Video("Aula 12 de Java");
        v[2] = new Video("Aula 5 de HTML");
        
        Usuario u[] = new Usuario[2];
        u[0] = new Usuario("Jubileu", 22, "M", "juba");
        u[1] = new Usuario("Creuza", 15, "F", "cre");
        
        System.out.println("Vídeo-----------------------");
        System.out.println(v[0].toString());
        System.out.println(v[1].toString());
        System.out.println(v[2].toString());
        System.out.println("Usuário---------------------");
        System.out.println(u[0].toString());
        System.out.println(u[1].toString());
        
        System.out.println("----------------------------");
        Visualizacao vis = new Visualizacao(u[0], v[0]);
        vis.avaliar(67.0f);
        
        System.out.println(vis.toString());
    }
    
}
