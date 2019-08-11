package com.sda.controller;


import com.sda.model.Client;
import com.sda.service.ClientService;
import com.sda.service.ClientServiceDAO;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet("/AddClientController")
public class AddClientController extends HttpServlet {
    //client service e serviciu ce stie sa faca chestii
    //sa aduca toti clientii , sa adauge un client si sa aduca un singur client
public ClientService clientService = new ClientServiceDAO();

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        String nume= request.getParameter("nume");
        String prenume=request.getParameter("prenume");
        String cnp=request.getParameter("cnp");
        //creez client
        Client clientNou =new Client(nume, prenume, cnp);
        clientService.addClient(clientNou);//am adaugat un client nou
        processRequest(request, response);

    }

    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {

        // Creating a RequestDispatcher object to dispatch
        // the request the request to another resource
        RequestDispatcher rd = request.getRequestDispatcher("/home/home.jsp");

        // The request will be forwarded to the resource
        // specified, here the resource is a JSP named,
        // "stdlist.jsp"
        rd.forward(request,response);
    }

}
