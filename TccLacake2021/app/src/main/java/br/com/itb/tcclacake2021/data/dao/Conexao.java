package br.com.itb.tcclacake2021.data.dao;

import android.os.StrictMode;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Conexao {
    public static Connection conectar(){

       Connection conexao = null;

        try{

            StrictMode.ThreadPolicy policy;
            policy = new StrictMode.ThreadPolicy.Builder()
                    .permitAll()
                    .build();
            StrictMode.setThreadPolicy(policy);

            Class.forName("net.sourceforge.jtds.jdbc.Driver");

            String strConn ="jdbc:jtds:sqlserver://192.168.1.104;" +
                    "databaseName=encomendabolos;user=mainserver;password=123456";

            conexao = DriverManager.getConnection(strConn);

        }catch (SQLException | ClassNotFoundException e){
            e.getMessage();

        }

        return conexao;

    }
}
