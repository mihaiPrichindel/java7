package com.sda.service;

import com.sda.model.Client;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class ClientServiceDAO implements ClientService {

private static final String FIND_ALL_CLIENTS_QUERY="SELECT * FROM exercitiigrupa7.clients";
    private Connection conn;
    private Statement stm;
    private ResultSet rs;

    @Override
    public Client getClient() {
        return new Client(9,"Ionescu","Gigi", "222");
    }

    @Override
    public List<Client> getClientList() {
        return populateClientList();
    }

    private List<Client> populateClientList(){

        List<Client> clientList = new ArrayList<Client>();
       // clientList.add(new Client("Ionescu", "George", 123));
        //clientList.add(new Client("Popescu", "Alin", 1234));
        //clientList.add(new Client("Georgescu", "Mihai", 12345));

        // deschidem conexiunea
        try {
            Class.forName("com.mysql.jdbc.Driver");
            conn = DriverManager.getConnection("jdbc:mysql://localhost:3306", "root", "root");
             stm = conn.createStatement();
             rs = stm.executeQuery(FIND_ALL_CLIENTS_QUERY);

            // o metoda prin care sa luam rezultatele din resultSet si sa ne creem obiecte si sa ne returneze o lista de clienti
            clientList.addAll(clientDatabase(rs));
            conn.close();

        } catch (SQLException e) {
            e.printStackTrace();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }

        return clientList;
    }

        private List<Client> clientDatabase(ResultSet rs) throws SQLException{
            List<Client> clientList  = new ArrayList<Client>();
            while(rs.next()){
               clientList.add(new Client(rs.getInt("id"),
                       rs.getString("nume"),
                       rs.getString("prenume"),
                       rs.getString("CNP")));

            }
            return clientList;
}
}






    //return new Client("Ionescu","Gigi",9);//aici clientul e hardcodat




