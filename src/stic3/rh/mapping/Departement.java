/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package stic3.rh.mapping;

/**
 *
 * @author AHMADOU
 */
public class Departement {

    private String deptno;
    private String dname;
    private String dloc;

    public Departement(String deptno, String dname, String dloc) {
        this.deptno = deptno;
        this.dname = dname;
        this.dloc = dloc;
    }

    public Departement() {
    }

    public String getDeptno() {
        return deptno;
    }

    public String getDname() {
        return dname;
    }

    public String getDloc() {
        return dloc;
    }

    public void setDeptno(String deptno) {
        this.deptno = deptno;
    }

    public void setDname(String dname) {
        this.dname = dname;
    }

    public void setDloc(String dloc) {
        this.dloc = dloc;
    }

}
