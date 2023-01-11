/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package objetos.compostos;

/**
 *
 * @author Rafael Almeida
 */
public class Lutador {
    //Atributos
    private String nome;
    private String nacionalidade;
    private int idade;
    private float altura;
    private float peso;
    private String categoria;
    private int vitoria, derrota, empate;
    
    //Métodos Públicos
    public void apresentar(){
        
    }
    public void status(){
        
    }
    public void ganharLuta(){
        
    }
    public void perderLuta(){
        
    }
    public void empatarLuta(){
        
    }
    //Métodos Especiais

    public Lutador(String nome, String nacionalidade, int idade, float altura, float peso, String categoria, int vitoria, int derrota, int empate) {
        this.nome = nome;
        this.nacionalidade = nacionalidade;
        this.idade = idade;
        this.altura = altura;
        this.peso = peso;
        this.categoria = categoria;
        this.vitoria = vitoria;
        this.derrota = derrota;
        this.empate = empate;
    }
    
}
