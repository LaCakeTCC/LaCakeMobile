package br.com.itb.tcclacake2021.data.dao;


import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import br.com.itb.tcclacake2021.data.model.LoggedInUser;


public class LoggedInUserDao {

    public static LoggedInUser verificarUsuario(String usuario, String senha){
        LoggedInUser login = null;

        try{
            PreparedStatement pst;
            pst = Conexao.conectar().prepareStatement(""+
                    "Select ID_cliente, senha, nome_cliente, email_cliente from CLIENTE " +
                    "where email_cliente = ? and senha = ?");
            pst.setString(1, usuario);
            pst.setString(2, senha);
            ResultSet res = pst.executeQuery();

            if(res!=null){
                while (res.next()){
                    login = new LoggedInUser(
                            String.valueOf(res.getInt(1)),
                            res.getString(4)
                    );
                }

            }
        }catch (SQLException e){
            e.getMessage();
        }

        return login;

    }

}
