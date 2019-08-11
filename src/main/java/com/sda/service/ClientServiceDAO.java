package com.sda.service;

import com.sda.model.Client;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class ClientServiceDAO implements ClientService {
    private static final String FIND_ALL_CLIENTS_QUERRY = "SELECT * FROM CLIENTS";

    Connection conn;
    Statement stat;
    ResultSet resultSet;


    public Client getClient() {
        //TODO fac cu list(ist=new arraylist)
        return new Client("Ionescu", "Gigi", "9", 1);


    }


    private List<Client> populateClientList() {

        List<Client> clientList = new ArrayList<Client>();
        //clientList.add(new Client("Vasilescu", "Gigi", "183012275876"));
        //clientList.add(new Client("Mihaescu", "Andrei", "92333211876"));

        //DESCHIDEM CONEXIUNEA
        try {
            Class.forName("com.mysql.jdbc.Driver");
            conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/client",
                    "root", "root");
            stat = conn.createStatement();
            ResultSet resultSet = stat.executeQuery(FIND_ALL_CLIENTS_QUERRY);

            while (resultSet.next()) {
                //creez variabile
                int id = resultSet.getInt(1);
                String nume = resultSet.getString(2);
                String prenume = resultSet.getString(3);
                String cnp = resultSet.getString(4);

                //creez clientul
                Client client = new Client(nume, prenume, cnp, id);

                //adaug clientul in lista

                clientList.add(client);

                System.out.println(resultSet.getInt(1) +
                        " " + resultSet.getString(2) + " "
                        + resultSet.getString(3) + " "
                        + resultSet.getString(4));

            }
        } catch (SQLException ex) {
            ex.printStackTrace();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();

        }

        //returneaza in front-end
        return clientList;

    }


    public Object getClientList() {
        return populateClientList();
    }

}
