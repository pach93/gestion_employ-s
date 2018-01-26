/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package stic3.rh.dao;

import java.util.Date;
import java.sql.ResultSet;
import java.util.ArrayList;
import stic3.rh.mapping.Employe;

/**
 *
 * @author AHMADOU
 */
public class EmployeBean {
    
    public static int nbEmp() throws Exception {
        int i = 0;
        try {
            String sql = "select * from employe";
            ResultSet rs = DB.getInstance().my_executeQuery(sql);
            while (rs.next()) {
                i++;
            }
        } catch (Exception e) {
            throw e;
        }
        return i;
        
    }

    public static Employe findEmp(String Deptno) throws Exception {
        int i = 0;
        Employe emp = null;
        //Departement dept=null;
        try {
            String sql = "select * from employe where Deptno = ? and Empno = Mgr";
            DB.getInstance().initPreparedQuery(sql);
            DB.getInstance().getPstmt().setString(1, Deptno);
            ResultSet rs = DB.getInstance().my_executePreparedQuery();
            
            while (rs.next()) {
                emp = new Employe();
                emp.setEmpno(rs.getString(1));
                emp.setEmpname(rs.getString(2));
                
            }
        } catch (Exception e) {
            throw e;
        }
        return emp;
        
    }
    
    public static int addEmp(Employe emp) throws Exception {
        int i = 0;
        emp.setEmpno("EMP-" + (nbEmp() + 1));
        try {
            String sql = "insert into employe values(?, ?, ?, ?, ?, ?, ?, ?) ";
            DB.getInstance().initPreparedQuery(sql);
            DB.getInstance().getPstmt().setString(1, emp.getEmpno());
            DB.getInstance().getPstmt().setString(2, emp.getEmpname());
            DB.getInstance().getPstmt().setString(3, emp.getJob());
            DB.getInstance().getPstmt().setString(4, emp.getMgr());
            DB.getInstance().getPstmt().setDate(5, java.sql.Date.valueOf( emp.getHiredate()));
            DB.getInstance().getPstmt().setInt(6, emp.getSal());
            DB.getInstance().getPstmt().setInt(7, emp.getComm());
            DB.getInstance().getPstmt().setString(8, emp.getDeptno());
            i = DB.getInstance().my_executePreparedUpdate();
            
        } catch (Exception e) {
            throw e;
        }
        return i;
    }
}
