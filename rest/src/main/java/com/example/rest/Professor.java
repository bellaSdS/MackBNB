package com.example.rest;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="professores")

public class Professor {
    @Id @GeneratedValue
    private long id;
    private String nome;
    private int matricula;
    private String area;

    public Professor(){}

    public Professor(long id, String n, int m, String a){
        this.id = id;
        this.nome = n;
        this.matricula = m;
        this.area = a;
    }

    //Sets
    public void setID(long id){
        this.id = id;
    }
    public void setNome(String n){
        nome = n;
    }
    public void setMatricula(int m){
        matricula = m;
    }
    public void setArea(String a){
        area = a;
    }

    //Gets
    public long getID(){
        return id;
    }
    public String getNome(){
        return nome;
    }
    public int getMatricula(){
        return matricula;
    }
    public String getArea(){
        return area;
    }
}
