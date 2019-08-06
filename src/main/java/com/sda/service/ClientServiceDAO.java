package com.sda.service;

import com.sda.model.Client;

public class ClientServiceDAO implements ClientService {

    public Client getClients() {
        //TODO
        //fac List;
        return new Client("Ionescu","Gigi",9);//aici clientul e hardcodat
    }
}
