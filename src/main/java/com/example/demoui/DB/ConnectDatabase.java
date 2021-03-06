package com.example.demoui.DB;

import java.sql.Connection;
import java.sql.DriverManager;

public class ConnectDatabase {
    public static void main(String[] args) {
        Connection con = null;

        try {
            //Registering the HSQLDB JDBC driver
            Class.forName("org.hsqldb.jdbc.JDBCDriver");
            //Creating the connection with HSQLDB
            con = DriverManager.getConnection("jdbc:hsqldb:file:MyHSQLDB", "root", "root");
            if (con!= null){
                System.out.println("Connection created successfully");

            }else{
                System.out.println("Problem with creating connection");
            }

        }  catch (Exception e) {
            e.printStackTrace(System.out);
        }
    }
}