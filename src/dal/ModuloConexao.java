package dal;

import java.sql.*;

public class ModuloConexao {
        //metodo responsavel por estabelecer conexao
    
    public static Connection conector(){
        java.sql.Connection conexao = null;
        // a linha abaixo chama o driver
        String driver = "com.mysql.jdbc.Driver";
        // armazenando informaçoes referente ao banco
        String url= "jdbc:mysql://localhost:3306/dbinfox";
        String user= "root";
        String password= "12345678";
        //Estabelecendo conexao com o banco
        try {
            Class.forName(driver);
            conexao = DriverManager.getConnection(url, user, password);
            return conexao;
        } catch (Exception e) {
        System.out.println(e);
        return null;
        }
    }
}
