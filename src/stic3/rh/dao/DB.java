/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package stic3.rh.dao;

import java.sql.*;

/**
 *
 * @author Pach
 */
public class DB {

     private Connection cnx;
    private Statement stmt;
    private PreparedStatement pstmt;
private static DB db;

    public PreparedStatement getPstmt() {
        return pstmt;
    }

public static DB getInstance()
{
if(db==null)
    db = new DB();
return db;
}
    public void getConnection() throws Exception {
        if (cnx == null || cnx.isClosed()) {
            try {
                Class.forName("com.mysql.jdbc.Driver"); //pour le lien avec la base de données
                String url = "jdbc:mysql://localhost:3306/basenetbeans2"; //pour définir le chemin avec la base de données
                cnx = DriverManager.getConnection(url, "root", ""); //définit la connection avec la base de données
                stmt = cnx.createStatement();
            } catch (Exception e) {
                throw e;
            }
        }

    }

    public void initPreparedQuery(String sql) throws Exception {
        try {
            getConnection();
            pstmt = cnx.prepareStatement(sql);
        } catch (Exception e) {
            throw e;
        }
    }

    public ResultSet my_executePreparedQuery() throws Exception {
        ResultSet rs = null;
        try {
            getConnection();
            rs = pstmt.executeQuery();
        } catch (Exception e) {
            throw e;
        }
        return rs;
    }

    public ResultSet my_executeQuery(String sql) throws Exception {
        ResultSet rs = null;
        try {
            getConnection();

            rs = stmt.executeQuery(sql);
        } catch (Exception e) {
            throw e;
        }
        return rs;
    }

    public int my_executePreparedUpdate() throws Exception {
        int n = 0;
        try {
            getConnection();
            n = pstmt.executeUpdate();
        } catch (Exception e) {
            throw e;
        }
        return n;
    }

    public int my_executeUpdate(String sql) throws Exception {
        int n = 0;
        try {
            getConnection();

            n = stmt.executeUpdate(sql);
        } catch (Exception e) {
            throw e;
        }
        return n;
    }

    public void fermerConnection() throws Exception {
        try {
            if (stmt != null || stmt.isClosed()) {
                stmt.close();
                stmt = null;
            }
            if (pstmt != null || pstmt.isClosed()) {
                pstmt.close();
                pstmt = null;
            }
            if (cnx != null || cnx.isClosed()) {
                cnx.close();
                cnx = null;
            }
        } catch (Exception e) {
            throw e;
        }
    }
}
