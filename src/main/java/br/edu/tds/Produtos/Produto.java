/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.edu.tds.Produtos;

/**
 *
 * @author aluno
 */
public class Produto {
    

    public String nome;
    private int quantidade;
    private float valor;
    
public Produto(){
} 
    public Produto(String n, int q, float valor){
        this.nome = n;
        this.quantidade= q;
        this.valor = valor;
    }
    

    public void setNome(String n){
        this.nome = n;
    }
    public void setQuantidade(int q){
        this.quantidade= q;    
    }
    public void setValor(float valor){
        this.valor = valor;
    }

    public String getNome() {
        return nome;
    }

    public int getQuantidade() {
        return quantidade;
    }

    public float getValor() {
        return valor;
    }
   
 public void imprimeDadosProdutos(){
    System.out.println("nome.:" +this.nome);
    System.out.println("quantidade.:" +this.quantidade);
    System.out.println("valor.:" +this.valor);
    }
    
    public void aplicarDesconto(float percentual){
           float desconto= this.valor*percentual/100;
           System.out.println("valor com desconto"+(this.valor-desconto));
           
    }
    public void aumentarQuantidade(int valor){
        quantidade += valor;
      
    }
    public void diminuirQuantidade(int valor){  
        quantidade -= valor;
    }
    
    
}
   