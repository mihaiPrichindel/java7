package com.sda.model;

public class Client {
    private String nume;
    private String prenume;
    private int cnp;

    public void setNume(String nume) {
        this.nume = nume;
    }

    public void setPrenume(String prenume) {
        this.prenume = prenume;
    }

    public void setCnp(int cnp) {
        this.cnp = cnp;
    }

    public String getNume() {
        return nume;
    }

    public String getPrenume() {
        return prenume;
    }

    public int getCnp() {
        return cnp;
    }

    public Client(String nume, String prenume, int cnp) {
        this.nume = nume;
        this.prenume = prenume;
        this.cnp = cnp;
    }

    @Override
    public String toString() {
        return "Client{" +
                "nume='" + nume + '\'' +
                ", prenume='" + prenume + '\'' +
                ", cnp=" + cnp +
                '}';
    }
}
