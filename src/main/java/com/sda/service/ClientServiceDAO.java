package com.sda.service;

import com.sda.model.Client;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class ClientServiceDAO  implements ClientServiceInterface{


private static final String FIND_ALL_CLIENTS_QUERY = "SELECT * FROM CLIENTS";

    Connection conn;
    Statement stmt;
    ResultSet resultSet;

    @Override
    public Client getClient() {
        return new Client("Ionescu", "Gigi", "9"); // TODO fac cu List (arrayList)
    }

    @Override
    public List<Client> getClientList() {

        return populateClientList();
    }
    // Override
    //getClient

private List<Client> populateClientList() {
    List<Client> clientList = new ArrayList<Client>();
//    clientList.add(new Client("Vasilescu", "Diana", 123456789));
//    clientList.add(new Client("Mihailescu", "Andrei", 12345678));
//    clientList.add(new Client("Popescu", "ion", 1234567));

    //deschidem conexiunea

    try {
        Class.forName("com.mysql.jdbc.Driver");
        conn = DriverManager.getConnection(
                "jdbc:mysql://localhost:3306/clients",
                "root",
                "Veveveve11!!"); // se iau din conexiunea pentru baza de date
        stmt = conn.createStatement();
        resultSet = stmt.executeQuery(FIND_ALL_CLIENTS_QUERY);

        //metoda prin care luam rezultatele din resutSet si ne creem obiecte si sa ne returneze o lista de clienti - o creem in exterior
        //clientList = generareLista();
        clientList = generateList(resultSet);

    } catch (SQLException e) {
        e.printStackTrace();
    } catch (ClassNotFoundException e) {
        e.printStackTrace();
    }


    return clientList;
}

    private List<Client> generateList(ResultSet resultSet) throws SQLException{
        List<Client> generatedList = new ArrayList<Client>();
        while (resultSet.next()) {

            int ID = resultSet.getInt("ID");
            String nume = resultSet.getString("NUME");
            String prenume = resultSet.getString("PRENUME");
            String CNP = resultSet.getString("CNP");

            generatedList.add(new Client(ID, nume, prenume, CNP));
        }
        return generatedList;
    }

}
