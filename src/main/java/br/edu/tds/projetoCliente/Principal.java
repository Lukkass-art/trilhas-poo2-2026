/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.edu.tds.projetoCliente;

/**
 *
 * @author aluno
 */
public class Principal {
    public static void main(String[] args){
    System.out.println("testando objetos de classe cliente");
    //usando classe cliente
    
    Cliente c1= new Cliente ("Davi", 19, "123456789");
    c1.imprimeDadosCliente();
    
    Cliente c2= new Cliente ("João", 43, "132536459");
    c2.imprimeDadosCliente();
    
    Cliente c3= new Cliente ("Manuel", 35, "98717677");
    c3.imprimeDadosCliente();
    
    Cliente c4= new Cliente();
    c4.setNome("Amaral");
    c4.setCPF("999999999");
    c4.setIdade(88);
    c4.imprimeDadosCliente();
    
    String nome = c4.getNome();
    System.out.println("nome obitido pelo get: "+ nome);
}
    
}
