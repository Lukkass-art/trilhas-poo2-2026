/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.edu.tds.projetoCliente;

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
    
    public String getNome(){
        return this.nome;
    }
    public void setNome(String n){
        this.nome = n;
    }
    public void setCPF(String c){
        this.cpf = c;    
    }
    public void setIdade(int i){
        this.idade = i;
    }
   
   
    
    
    //Metados Funcionais
    public void imprimeDadosCliente(){
    System.out.println("nome.:" +this.nome);
    System.out.println("idade.:" +this.idade);
    System.out.println("cpf.:" +this.cpf);
    }
    
    
    
    
}
