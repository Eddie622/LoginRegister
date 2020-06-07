/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package group_id.loginregister;

import java.sql.Connection;
import java.sql.SQLException;
import com.mysql.jdbc.jdbc2.optional.MysqlDataSource;

/**
 *
 * @author Admin
 */
public class Connector {
    
    private String dbUrl, dbName, dbUser, dbPass, dbHost, dbPort, dbDriver;
    
    public static Connection getConnection(){
        Connection conn = null;
        
        MysqlDataSource datasource = new MysqlDataSource();
        
        datasource.setServerName("localhost");
        datasource.setUser("root");
        datasource.setPassword("password");
        datasource.setDatabaseName("TicketSystem");
        datasource.setPortNumber(3306);
        
        try {
            conn = datasource.getConnection();
        } catch (SQLException e) {
            System.out.println("Connection Error");
            e.printStackTrace();
        }
        
        return conn;
    }
    
}
