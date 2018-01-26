/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package stic3.rh.dao;

import java.sql.*;
import stic3.rh.mapping.*;

/**
 *
 * @author AHMADOU
 */
public class UtilisateurBean {

    public static Utilisateur Logon(String login, String pwd) throws Exception {
        Utilisateur user = null;
        try {
            String sql = "select * from user where Login = ? and password = ?";
            DB.getInstance().initPreparedQuery(sql);
            DB.getInstance().getPstmt().setString(1, login);
            DB.getInstance().getPstmt().setString(2, pwd);
            ResultSet rs = DB.getInstance().my_executePreparedQuery();
            if(rs.next())
            {
            user=new Utilisateur();
            user.setId(rs.getInt(1));
            user.setLog(rs.getString(2));
            user.setPw(rs.getString(3));
            user.setNom(rs.getString(4));
            user.setPost(rs.getString(5));
            
            }

        } catch (Exception e) {
            throw e;
        }
        return user;
    }
}
