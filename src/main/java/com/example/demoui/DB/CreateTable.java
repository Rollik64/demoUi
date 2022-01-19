package com.example.demoui.DB;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

public class CreateTable {
    public static void main(String[] args) {

        Connection con = null;
        Statement stmt = null;

        try {
            Class.forName("org.hsqldb.jdbc.JDBCDriver");
            con = DriverManager.getConnection("jdbc:hsqldb:file:MyHSQLDB", "root", "root");
            stmt = con.createStatement();

            stmt.executeUpdate("CREATE TABLE tutorials_tbl (login VARCHAR(50) NOT NULL, password VARCHAR(20) NOT NULL, PRIMARY KEY (login))");

        }  catch (Exception e) {
            e.printStackTrace(System.out);
        }
        System.out.println("Table created successfully");
    }
}
