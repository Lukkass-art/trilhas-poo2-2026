/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.edu.tds.projetopoo;

/**
 *
 * @author aluno
 */
public class Cliente {
    //Definição de atributos de classe
   
    public String nome;
    private int idade;
    private String cpf;
   
    //definir os meus contrutores
    public Cliente(){
} 
    public Cliente(String n, int i, String cpf){
        this.nome = n;
        this.idade = i;
        this.cpf = cpf;
    }
    //Metados get set
    
    //Metados Funcionais
    public void imprimeDadosCliente(){
    System.out.println("nome.:" +this.nome);
    System.out.println("idade.:" +this.idade);
    System.out.println("cpf.:" +this.cpf);
    }
    
    
    
}
