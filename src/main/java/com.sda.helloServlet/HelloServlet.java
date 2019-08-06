package com.sda.helloServlet;

import javax.servlet.ServletException;
import javax.servlet.http.*;
import javax.servlet.annotation.WebServlet;
import javax.servlet.ServletException;
import java.io.IOException;
import java.io.PrintWriter;
import com.sda.model.*;
import com.sda.service.ClientServiceDAO;
import com.sda.service.ClientServiceInterface;

import javax.servlet.*;
/* java TODO:

1. facem un serviciu pe care il instantam in servlet
2. serviciul se  va ocupa de treaba pe care o avem de facut.
serviciul va fi facut din doua bucati: o interfata si  o implementare.

3. in implementare o sa facem conexiunea la baza de date si o sa rulam queri-urile pe care le avem de rulat
4. Raspunsul va fi trimis pe response ca si obiect)
in front end apelam: obiect.atribut => cu obligatia de a-l importa


// facem impreuna crud complet pe cate pagini ne tin capacele ;) ce ramane va fi tema
*/

@WebServlet("/HelloServlet")
public class HelloServlet extends HttpServlet{

//   aici variabila care sa imi spuna daca sunt autentificat;;;

    protected void processRequest(HttpServletRequest request, HttpServletResponse response) //TODO de clarificat ce face aceasta metoda
            throws ServletException, IOException
    {
        ExampleModel exampleModel = new ExampleModel();
        exampleModel.javaProperty = "Hello from servlet";
        request.setAttribute("key",exampleModel);

        // Creating a RequestDispatcher object to dispatch
        // the request the request to another resourceeliko
        RequestDispatcher rd = request.getRequestDispatcher("/home/home.jsp");

        // The request will be forwarded to the resource
        // specified, here the resource is a JSP named,
        // "stdlist.jsp"
        rd.forward(request, response);

    }
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException,IOException{


        String introducedUsername = request.getParameter("username"); // solicita de la form username
        String introducedPassword = request.getParameter("password"); // solicita de la form password
        if(hasRight(introducedUsername, introducedPassword)) { // raspunsul hasTrue == true solicita executarea procesului

            System.out.println(clientService.getClients().toString()); // afiseaza in consola clienttii
            request.setAttribute("Clients",clientService.getClients()); //

            processRequest(request, response);
        } else {
            System.out.println("User si/sau parola incorecte");
            // TODO: trimite mesaj: Logon Denied
            //In pagina index.jsp trebuie sa cauti un output si trebuie sa iei informatia de pe request
            // trebuie sa fii aici sa setezi un atribut pe req "request.setAtribute("LoginResult", false);

        }

    }

    // Valori introduse manual pentru a putea verifica functionatii acceptarii accesului
    private static String user = "AAAA";
    private static String password = "AAAA1111";

    public ClientServiceInterface clientService = new ClientServiceDAO();

    private boolean hasRight(String introducedUsername, String introducedPaswword) {
        //verificare concordanta username - parola. Din ratiuni didactice, valorile de control sunt prestabilite mai sus

        boolean hasRight = false;
        System.out.println("Hello from hasRight");
        if(introducedUsername.equals(user) && introducedPaswword.equals(password)) {
            hasRight = true;
        }
        // System.out.println(hasRight); // Verificarea in consola a valorii hasRight

        return hasRight;
    }
}
