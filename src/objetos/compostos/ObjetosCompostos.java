/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package objetos.compostos;

/**
 *
 * @author Rafael Almeida
 */
public class ObjetosCompostos {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Lutador l[] = new Lutador [4]; 
                
        l[0] = new Lutador ("Boy", "França", 31, 1.75f, 68.9f, 11, 2, 1);
        l[1] = new Lutador("Putscript", "Brasil", 29, 1.68f, 81.8f, 14, 2, 3);
        l[2] = new Lutador("Snapshadow", "EUA", 35, 1.65f, 85.2f, 12, 2, 1);
        l[3] = new Lutador("Dead Code", "Inglaterra", 27, 1.50f, 51.2f, 0, 0, 0);
        
        l[0].status();
        System.out.println("-----------------------------");
        l[1].status();
        System.out.println("-----------------------------");
        l[2].status();
        System.out.println("-----------------------------");
        l[3].status();
        
    }
    
}
