/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package stic3.rh.mapping;

import java.sql.Date;

/**
 *
 * @author AHMADOU
 */
public class Employe {

    private String empno, empname, job, mgr, deptno,hiredate;
    private int sal, comm;
   

    public Employe() {
    }

    public Employe(String empno, String empname, String job, String mgr, String deptno, int sal, int comm, String hiredate) {
        this.empno = empno;
        this.empname = empname;
        this.job = job;
        this.mgr = mgr;
        this.deptno = deptno;
        this.sal = sal;
        this.comm = comm;
        this.hiredate = hiredate;
    }

    public String getEmpno() {
        return empno;
    }

    public void setEmpno(String empno) {
        this.empno = empno;
    }

    public String getEmpname() {
        return empname;
    }

    public void setEmpname(String empname) {
        this.empname = empname;
    }

    public String getJob() {
        return job;
    }

    public void setJob(String job) {
        this.job = job;
    }

    public String getMgr() {
        return mgr;
    }

    public void setMgr(String mgr) {
        this.mgr = mgr;
    }

    public String getDeptno() {
        return deptno;
    }

    public void setDeptno(String deptno) {
        this.deptno = deptno;
    }

    public int getSal() {
        return sal;
    }

    public void setSal(int sal) {
        this.sal = sal;
    }

    public int getComm() {
        return comm;
    }

    public void setComm(int comm) {
        this.comm = comm;
    }

    public String getHiredate() {
        return hiredate;
    }

    public void setHiredate(String hiredate) {
        this.hiredate = hiredate;
    }

}
