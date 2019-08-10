package com.sda.model;

public class Client {

    private Integer id;
    private String nume;
    private String prenume;
    private String CNP;

    public Client(String nume, String prenume) {
        this.nume = nume;
        this.prenume = prenume;
    }

    public Client(Integer id, String nume, String prenume, String CNP) {
        this.id = id;
        this.nume = nume;
        this.prenume = prenume;
        this.CNP = CNP;
    }

    public Client() {

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

    public String getCNP() {
        return CNP;
    }

    public void setCNP(String CNP) {
        this.CNP = CNP;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    @Override
    public String toString() {
        return nume + " " + prenume + " " + CNP;
    }
}
