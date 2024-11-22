/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Control;

/**
 *
 * @author genev
 */
public class Usuario_control {
    private int id;
    private String email;
    private String nome;
    private String senha;
    private String enderenço;
    
    public Usuario_control (){
}
    public Usuario_control(String email, String nome, String senha, String enderenço){
        this.email = email;
        this.nome = nome;
        this.senha = senha;
        this.enderenço = enderenço;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getSenha() {
        return senha;
    }

    public void setSenha(String senha) {
        this.senha = senha;
    }

    public String getEnderenço() {
        return enderenço;
    }

    public void setEnderenço(String enderenço) {
        this.enderenço = enderenço;
    }
    
    }   
