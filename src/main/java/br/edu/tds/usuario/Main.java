/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.edu.tds.usuario;

/**
 *
 * @author aluno
 */
public class Main {
    
    public static void main(String[] args){
        
        UsuarioDAO dao = new UsuarioDAO();
        
        Usuario u1 =new Usuario ("Carlos", "carlos@gmail.com", "1234");
        dao.cadastrar(u1);
        
         Usuario u2 =new Usuario ("Rogerio", "rogerio@gmail.com", "4321");
        dao.cadastrar(u2);
        
         Usuario u3 =new Usuario ("Luis", "luis@gmail.com", "5678");
        dao.cadastrar(u3);
        
        Usuario u4 =new Usuario ("João", "joao@gmail.com", "8765");
        dao.cadastrar(u4);
        
        Usuario u5 =new Usuario ("Marcos", "marcos@gmail.com", "1357");
        dao.cadastrar(u5);
        
       // boolean acesso = dao.login("carlos@gmail.com","1234");
        boolean acesso = dao.login("rogerio@gmail.com","4321");
        //boolean acesso = dao.login("luis@gmail.com","5678");
        //boolean acesso = dao.login("joao@gmail.com","8765");
        //boolean acesso = dao.login("marcos@gmail.com","1357");
          
        if(acesso){
            System.out.println("Login realizado com sucesso!");
        } else {
            System.out.println("Email ou senha invalidos!"
            );
        }
}
}