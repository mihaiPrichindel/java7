package com.sda.model;

public class Client {

    private int id;
    private String nume;
    private String prenume;
    private String cnp;

    public Client(String nume, String prenume, String cnp,int id) {
        this.nume = nume;
        this.prenume = prenume;
        this.cnp = cnp;
        this.id =id;
    }

    public Client(String nume, String prenume, String cnp) {
        this.nume=nume;
        this.prenume=prenume;
        this.cnp=cnp;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setNume(String nume) {
        this.nume = nume;
    }

    public void setPrenume(String prenume) {
        this.prenume = prenume;
    }

    public void setCnp(String cnp) {
        this.cnp = cnp;
    }

    public String getNume() {
        return nume;
    }

    public String getPrenume() {
        return prenume;
    }

    public String getCnp() {
        return cnp;
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
