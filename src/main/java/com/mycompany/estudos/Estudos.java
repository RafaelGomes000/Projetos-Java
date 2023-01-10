package com.mycompany.estudos;
public class Estudos {
    public static void main(String[] args) {
        
        ControleRemoto c1 = new ControleRemoto(50, true, false);
        
        c1.abrirMenu();
        c1.fecharMenu();
        c1.ligarMudo();
        c1.play();
        c1.abrirMenu();
        c1.fecharMenu();
        c1.desligar();
        c1.play();
        c1.maisVolume();
        c1.ligar();             
    }
}
