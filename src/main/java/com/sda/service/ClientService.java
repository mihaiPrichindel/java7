package com.sda.service;

import com.sda.model.*;

public interface ClientService {

    Client getClient();

    Object getClientList();

    void addClient (Client clientNou);

}
