package projetovideo;

import java.awt.BorderLayout;

public class ProjetoVideo {

    public static void main(String[] args) {
        Video v[] = new Video [3];
        
        v[0] = new Video("Aula 1 de PHP");
        v[1] = new Video("Aula 12 de Java");
        v[2] = new Video("Aula 5 de HTML");
        
        Usuario u[] = new Usuario[2];
        u[0] = new Usuario("Nome", 22, "M", "Login");
        
        System.out.println(v[0].toString());
        System.out.println(u[0].toString());
    }
    
}
