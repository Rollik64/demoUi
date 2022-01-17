package com.example.demoui.DB;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

public class InsertQuery {
    public static void main(String[] args) {
        Connection con = null;
        Statement stmt = null;
        int result = 0;
        try {
            Class.forName("org.hsqldb.jdbc.JDBCDriver");
            con = DriverManager.getConnection("jdbc:hsqldb:file:HSQLDB (Local)", "root", "root");
            stmt = con.createStatement();
            result = stmt.executeUpdate("INSERT INTO account VALUES (1,'vasya', '12345678')");
            con.commit();
        }catch (Exception e) {
            e.printStackTrace(System.out);
        }
        System.out.println(result+" rows effected");
        System.out.println("Rows inserted successfully");
    }
}
