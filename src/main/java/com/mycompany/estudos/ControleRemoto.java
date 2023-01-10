package com.mycompany.estudos;
public class ControleRemoto implements Controlador {
    private int volume;
    private boolean ligado;
    private boolean tocando;

    public ControleRemoto(int volume, boolean ligado, boolean tocando) {
        this.volume = 50;
        this.ligado = true;
        this.tocando = false;
    }
    public ControleRemoto() {
    }

    private int getVolume() {
        return volume;
    }

    private void setVolume(int volume) {
        this.volume = volume;
    }

    private boolean isLigado() {
        return ligado;
    }

    private void setLigado(boolean ligado) {
        this.ligado = ligado;
    }

    private boolean isTocando() {
        return tocando;
    }

    private void setTocando(boolean tocando) {
        this.tocando = tocando;
    }
    
    //---------------------------------------------------
    
    @Override
    public void ligar() {
        if(!this.isLigado()){
            System.out.println("TV foi ligada!");
            this.setLigado(true);
        }
        else{
            System.out.println("A TV já esta ligada!");
        }
    }

    public void desligar() {
        if(this.isLigado()){
            System.out.println("TV foi desligada!");
            this.setLigado(false);
        }
        else{
            System.out.println("A TV já esta desligada!");
        }
    }

    @Override
    public void abrirMenu() {
        System.out.println("A TV está ligada? " + this.isLigado());
        System.out.println("A TV está tocando? " + this.isTocando());
        System.out.print("Volume: " + this.getVolume());
        for (int i = 0; i <= this.getVolume(); i += 10){
            System.out.print("|");
        }
        System.out.println("");
    }

    @Override
    public void fecharMenu() {
        System.out.println("Fechando menu...");
    }

    @Override
    public void maisVolume() {
        if (this.isLigado()){
            this.setVolume(this.getVolume() + 5);
        }
        else{
            System.out.println("A TV está desliaga, volume não foi aumentado.");
        }
    }

    @Override
    public void menosVolume() {
        if (this.isLigado()){
            this.setVolume(this.getVolume() - 5);
        }
        else{
            System.out.println("A TV está desliaga, volume não foi alterado.");
        }
    }

    @Override
    public void ligarMudo() {
        if (this.getVolume() == 0){
            System.out.println("Já está no mudo!");
    }
        else{
            this.setVolume(0);
        }
    }
    
    @Override
    public void desligarMudo() {
        if (this.getVolume() == 0){
            this.setVolume(50);
        }
        else{
            System.out.println("Mudo já está desligado!");
        }
    }
    @Override
    public void play() {
        if (this.isLigado()){
            if(this.getVolume() != 0){
                this.setTocando(true);
            }
            System.out.println("Volume está zerado! não foi possível dar play");
        }
        else{
            System.out.println("TV está desligada, não foi possível iniciar");
        }
    }

    @Override
    public void pause() {
        if (this.isLigado()){
            if(this.getVolume() != 0){
                this.setTocando(false);
            }
            System.out.println("Volume está zerado!");
        }
        else{
            System.out.println("TV está desligada, não foi possível pausar");
      
        
        }
    }   

    @Override
    public void desligarW() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
}
