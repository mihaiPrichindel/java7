package com.sda.model;

public class Client {
    private String nume;
    private String prenume;
    private String CNP;
    private int ID;

    public Client(String nume, String prenume, String CNP) {
        this.nume = nume;
        this.prenume = prenume;
        this.CNP = CNP;
    }

    public Client(int ID, String nume, String prenume, String CNP) {
        this.ID = ID;
        this.nume = nume;
        this.prenume = prenume;
        this.CNP = CNP;

    }

    public Client() { // constructor fara parametru, pentru just in case

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

    @Override
    public String toString() {
        return "Client{" +
                "nume='" + nume + '\'' +
                ", prenume='" + prenume + '\'' +
                ", CNP=" + CNP +
                '}';
    }
}
