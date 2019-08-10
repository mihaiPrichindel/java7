package com.sda.service;


import com.sda.model.Client;

public class ClientServiceDAO implements ClientServiceInterface{


     public Client getClients(){
         // TODO fac cu List;;
        return new Client("Ionescu","Gigi",9);
     }
}