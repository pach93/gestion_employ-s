/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package stic3.rh.mapping;

/**
 *
 * @author Ray-G
 */
public class Utilisateur {
    private int id;
    private String nom,post,log,pw;

    public int getId() {
        return id;
    }
    public void setId(int id) {
        this.id = id;
    }
    
    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public String getPost() {
        return post;
    }

    public void setPost(String post) {
        this.post = post;
    }

    public String getLog() {
        return log;
    }

    public void setLog(String log) {
        this.log = log;
    }

    public String getPw() {
        return pw;
    }

    public void setPw(String pw) {
        this.pw = pw;
    }

    public Utilisateur(int id, String nom, String post, String log, String pw) {
        this.id = id;
        this.nom = nom;
        this.post = post;
        this.log = log;
        this.pw = pw;
    }

    public Utilisateur() {
    }

   
    
}
