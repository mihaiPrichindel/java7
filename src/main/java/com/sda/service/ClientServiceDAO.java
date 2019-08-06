package com.sda.service;

import com.sda.model.Client;

public class ClientServiceDAO  implements ClientServiceInterface{

    @Override
    public Client getClients() {
        return new Client("Ionescu", "Gigi", 9); // TODO fac cu List (arrayList)
    }
    // Override
    //getClient


}
