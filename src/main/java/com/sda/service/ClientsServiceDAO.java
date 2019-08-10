package com.sda.service;
import com.sda.model.Client;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class ClientsServiceDAO implements ClientServiceInterface {

    private Connection conn;
    private Statement stmt;
    private ResultSet rs;

    private final static String FIND_ALL_CLIENTS_QUERRY = "Select * from exercitiigrupa7.clients";

    private List<Client> clientList = new ArrayList<Client>();

    @Override
    public Client getClient() {
        // TODO fac cu List
        return new Client(1,"Gigi", "Ionescu", "912312312");
    }

    @Override
    public List<Client> getClientList() {
            return populateClientList();
    }

    private List<Client> populateClientList() {
//        clientList.add(new Client(1, "Gigi", "Ionescu", "912312312"));
//        clientList.add(new Client(2, "Marcel", "Popescu", "954822312"));
//        clientList.add(new Client(3, "Alex", "Grigorescu", "902312312"));

        // Deschidem Conexiunea

        try {
            // Foarte important!!!
            Class.forName("com.mysql.jdbc.Driver");
            conn = DriverManager.getConnection("jdbc:mysql://localhost:3306", "root", "root");
            stmt = conn.createStatement();
            rs = stmt.executeQuery(FIND_ALL_CLIENTS_QUERRY);

            // Metoda prin care sa luam rezultatele din resultSet si sa ne creem obiecte si sa ne returneze o lista de clienti

            getClientListFromDatabase(rs);

            conn.close();
        } catch (SQLException e) {
            e.printStackTrace();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }

        return clientList;
    }

    private void getClientListFromDatabase(ResultSet rs) throws SQLException {
        while(rs.next()) {
            clientList.add(new Client(rs.getInt("id"),
                    rs.getString("Nume"),
                    rs.getString("Prenume"),
                    rs.getString("CNP")));
        }
    }
}
