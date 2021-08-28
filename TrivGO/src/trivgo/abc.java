/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package trivgo;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 *
 * @author USER
 */
class abc {
    public abc() throws SQLException{
        Connection conn=DriverManager.getConnection("jdbc:derby://Localhost:1527/TrivGO","riday","123");
        System.out.println("Connection Created");
    }
}
