package br.edu.tds.Produtos;


public class Principal{
public static void main(String[] args){
    System.out.println("testando objetos de classe Produtos");
    //usando classe cliente
    
    Produto p1= new Produto ("Monster", 25, 9.0f);
    Produto p2= new Produto ("Doritos", 50, 12.0f);
    
    
    System.out.println(p1.getNome());
    System.out.println(p1.getQuantidade());
    System.out.println(p1.getValor());
    
    System.out.println(p2.getNome());
    System.out.println(p2.getQuantidade());
    System.out.println(p2.getValor());
    
    
    Produto p3=new Produto();
    Produto p4=new Produto();
    
    p3.setNome("Diamante negro");
    p3.setQuantidade(15);
    p3.setValor(4.5f);
    
    
    p4.setNome("Pão de queijo");
    p4.setQuantidade(55);
    p4.setValor(2.5f);
    
    System.out.println(p3.getNome());
    System.out.println(p3.getQuantidade());
    System.out.println(p3.getValor());
    
    System.out.println(p4.getNome());
    System.out.println(p4.getQuantidade());
    System.out.println(p4.getValor());
    
    p3.aumentarQuantidade(30);
    p4.diminuirQuantidade(25);
    p1.aplicarDesconto(25);
    
    
}
}