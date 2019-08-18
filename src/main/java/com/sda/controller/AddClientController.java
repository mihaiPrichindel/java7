package com.sda.controller;

import javax.servlet.ServletException;
import javax.servlet.http.*;
import javax.servlet.annotation.WebServlet;
import java.io.IOException;

import com.sda.model.*;
import com.sda.service.ClientServiceDAO;
import com.sda.service.ClientServiceInterface;

import javax.servlet.*;

@WebServlet("/home/AddClientController")
public class AddClientController extends HttpServlet {
    // client service este un serviciu ce stie sa faca chestii
    //sa aduca toti clientii, sa adauge

    @Override
    public void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException,IOException {

        System.out.println("Hello from AddClientController.doGet() - controller");
        String nume = request.getParameter("nume"); // solicita de la form username
        String prenume = request.getParameter("prenume"); // solicita de la form password
        String CNP = request.getParameter("CNP"); // solicita de la form password

        Client clientNou = new Client (nume, prenume, CNP);
        clientService.addClientNou(clientNou); // am adaugat un client nou
        processRequest(request, response);
    }


    public ClientServiceInterface clientService = new ClientServiceDAO(); // stie sa faca serviciipentru mine



    protected void processRequest(HttpServletRequest request, HttpServletResponse response) //TODO de clarificat ce face aceasta metoda
            throws ServletException, IOException
    {
        System.out.println("Hello from HelloServlet.processRequest() - controller");
//        ExampleModel exampleModel = new ExampleModel(); //TODO - nu inteleg ce rost au aceste linii de cod (3 la numar). In home.jsp ducem date pe care nu le regasesc aici (nume, prenume etc.
//        exampleModel.javaProperty = "Hello from servlet"; // Linii folosite in alt context
//        request.setAttribute("key",exampleModel);

        // Creating a RequestDispatcher object to dispatch the request to another resourcee
        // Creem un obiect rd de tip RequestDispatcher
//        RequestDispatcher rd = request.getRequestDispatcher("/home/addClient.jsp"); // public interface RequestDispatcher

        request.setAttribute("Clients",clientService.getClientList()); // setam atributele request
        // cu valorile returnate de clientService
        RequestDispatcher rd = request.getRequestDispatcher("/home/home.jsp"); // public interface RequestDispatcher

        // The request will be forwarded to the resource specified, here the resource is a JSP named, "stdlist.jsp"
        rd.forward(request, response); // transmitem raspunsul care va genera deschiderea paginii home.jsp

    }


}
