/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Classe;
import Control.Usuario_control;
import java.sql.SQLException;
import Control.Conexao;
import java.sql.PreparedStatement;

/**

/**
 *
 * @author genev
 */
public class Usuario {
    public void cadastrarUsuario(Usuario_control usuario) throws SQLException{
        String sql ="INSERT INTO USUARIO (NOME,SENHA,EMAIL,ENDEREÇO)VALUES (?,?,?,?)";
        PreparedStatement ps = null;
        try{
        ps = Conexao.getConexao().prepareStatement(sql);
        ps.setString(1,usuario.getNome());
        ps.setString(2,usuario.getEnderenço());
        ps.setString(3,usuario.getEmail());
        ps.setString(4,usuario.getSenha());
        
        ps.execute();
        ps.close();
      
        }catch(SQLException e){
        // 
        e.printStackTrace();
        }
        
    }
    }

