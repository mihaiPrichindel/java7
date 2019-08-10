package com.sda.model;

public class Client{

     private String nume;
     private String prenume;
     private int CNP;


     public Client(String nume, String prenume,int CNP){
        this.nume = nume;
        this.prenume = prenume;
        this.CNP = CNP;
    }

    public Client(){

    }

    public String getNume() {
        return nume;
    }

    public void setNume(String nume) {
        this.nume = nume;
    }

    public String getPrenume() {
        return prenume;
    }

    public void setPrenume(String prenume) {
        this.prenume = prenume;
    }

    public int getCNP() {
        return CNP;
    }

    public void setCNP(int CNP) {
        this.CNP = CNP;
    }

}