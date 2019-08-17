package com.sda.service;


import com.sda.model.Client;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class ClientServiceDAO implements ClientServiceInterface {

    private static final String FIND_ALL_CLIENTS_QUERY="SELECT * FROM CLIENTS";
    Connection conn;
    Statement stmt;
    ResultSet resultSet;
    public Client getClient() {

        return new Client("Ionescu", "Gigi", 9);
    }

    public List<Client> getClientList() {
        return populateClientList();
    }

    private List<Client> populateClientList() {
        List<Client> clientList = new ArrayList<Client>();
        //   clientList.add(new Client("Vasilescu", "Diana", 232324322));
        //  clientList.add(new Client("Mihailescu", "Andrei", 92333211));

        //DESCHIDEM CONEXIUNEA
        try {

             conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/exercitiigrupa7", "Prichindel", "08071992");
             stmt = conn.createStatement();
             resultSet = stmt.executeQuery(FIND_ALL_CLIENTS_QUERY);

             while(resultSet.next()){



             }
            //metoda prin care sa luam resultatele din resultSet si sa ne creeem obiecte  si sa ne returneze o lista de
            //clienti

        } catch (SQLException ex) {
            ex.printStackTrace();
        }



        return clientList;
    }


}