package com.sda.service;

import com.sda.model.Client;

public class ClientServiceDAO implements ClientService {

    public Client getClients() {
        //TODO fac cu list(ist=new arraylist)
        return new Client("Ionescu","Gigi",9);
    }
}
