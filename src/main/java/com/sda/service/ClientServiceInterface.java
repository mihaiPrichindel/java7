package com.sda.service;
import com.sda.model.Client;

import java.sql.SQLException;
import java.util.List;

public interface ClientServiceInterface {
    Client getClient();
    List<Client> getClientList();
}
