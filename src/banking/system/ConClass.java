package banking.system;

import java.sql.*;

public class Con {
    Connection connection;
    Statement statement;
    public Con(){
        try{
            connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/bankSystem","root","Vicky@8954");
            statement  = connection.createStatement();
        }
        catch (Exception e){
            e.printStackTrace();
        }
    }
}
