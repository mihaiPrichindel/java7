package com.sda.service;
import com.sda.model.Client;

public class ClientsServiceDAO implements ClientServiceInterface {

    @Override
    public Client getClients() {
        // TODO fac cu List
        return new Client("Gigi", "Ionescu", 912312312);
    }


}
