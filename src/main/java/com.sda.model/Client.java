package com.sda.model;

public class Client {

    private int id;
    private String nume;
    private String prenume;
    private String CNP;


    public Client(int id,String nume, String prenume, String CNP){
        this.id = id;
        this.nume=nume;
        this.prenume=prenume;
        this.CNP=CNP;

    }

    public Client(int id){

        this.id = id;
    }

    public String getNume() {
        return nume;
    }

    public void setNume(String nume) {
        this.nume = nume;
    }

    public  String getPrenume() {
        return prenume;
    }

    public void setPrenume(String prenume) {
        this.prenume = prenume;
    }

    public  String getCNP() {
        return CNP;
    }

    public void setCNP(String CNP) {
        this.CNP = CNP;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    @Override
    public String toString() {
        return "Client{" +
                "nume='" + nume + '\'' +
                ", prenume='" + prenume + '\'' +
                ", CNP=" + CNP +
                '}';
    }
}
