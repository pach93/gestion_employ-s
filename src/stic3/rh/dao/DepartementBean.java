/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package stic3.rh.dao;

import com.sun.org.apache.regexp.internal.RESyntaxException;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;
import java.util.Vector;
import stic3.rh.mapping.Departement;

/**
 *
 * @author AHMADOU
 */
public class DepartementBean {

    public static int nbDept() throws Exception {
        int i = 0;
        try {
            String sql = "select * from departement";
            ResultSet rs = DB.getInstance().my_executeQuery(sql);
            while (rs.next()) {
                i++;
            }
        } catch (Exception e) {
            throw e;
        }
        return i;

    }
     /*public static int nbDept() throws Exception {
        int i = 0;
        try {
            String sql = "select * from dept";
            ResultSet rs = DB.getInstance().my_executeQuery(sql);
            while (rs.next()) {
                i++;
            }
        } catch (Exception e) {
            throw e;
        }
        return i;

    }*/

    public static int addDept(Departement dept) throws Exception {
        int i = 0;
        try {

            dept.setDeptno("DEPT-" + (nbDept() + 1));
            String sql = "insert into departement values ( '" +dept.getDeptno()+  "' ,'" +dept.getDname()+ "' , ' " +dept.getDloc()+ "' )" ;
           
            /*DB.getInstance().initPreparedQuery(sql);
            DB.getInstance().getPstmt().setString(1, "DEPT-" + (nbDept()+1));
            DB.getInstance().getPstmt().setString(2, dept.getDname());
            DB.getInstance().getPstmt().setString(3, dept.getDloc());*/
            i = DB.getInstance().my_executeUpdate(sql);
        } catch (Exception e) {
            throw e;
        }
        return i;
    }
        public static ArrayList findAll() throws Exception {
       
        ArrayList listdept=null;
        Departement dept=null;
        try {
            String sql = "select * from departement";
            ResultSet rs = DB.getInstance().my_executeQuery(sql);
            listdept= new ArrayList() ;
            while (rs.next()) {
               dept = new Departement();
                dept.setDeptno(rs.getString(1));
                dept.setDname(rs.getString(2));
                dept.setDloc(rs.getString(3));
                listdept.add(dept);
                
            }
        } catch (Exception e) {
            throw e;
        }
        return listdept;

    }

}
