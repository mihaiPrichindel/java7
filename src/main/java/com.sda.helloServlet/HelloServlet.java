package com.sda.helloServlet;

import javax.servlet.ServletException;
import javax.servlet.http.*;
import javax.servlet.annotation.WebServlet;
import java.io.IOException;

import com.sda.model.*;
import com.sda.service.ClientService;
import com.sda.service.ClientServiceDAO;

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
    public static final String user="alexandra";
    public static final String password="123";
    public ClientService clientService= new ClientServiceDAO();


//   aici variabila care sa imi spuna daca sunt autentificat;;;


    private boolean hasRights(String introducedUser, String introducedPassword) {

        if (introducedUser.equals(user)  && introducedPassword.equals(password) ) {
            System.out.println("user has right of identification");
            return true;
        }
        System.out.println("user does not has the right of authentification");
        return false;
    }


    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException
    {
        ExampleModel exampleModel = new ExampleModel();
        exampleModel.javaProperty = "Hello from servlet";
        request.setAttribute("key",exampleModel);

        // Creating a RequestDispatcher object to dispatch
        // the request the request to another resource
        RequestDispatcher rd = request.getRequestDispatcher("/home/home.jsp");

        // The request will be forwarded to the resource
        // specified, here the resource is a JSP named,
        // "stdlist.jsp"
        rd.forward(request, response);

    }

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException,IOException{
        String id= request.getParameter("username");
        String pass=request.getParameter("password");
        if(hasRights(id,pass)) {
            System.out.println(clientService.getClients().toString());
          request.setAttribute("Clients",clientService.getClients());
        processRequest(request,response);}
        else{

            request.setAttribute("errorMessage", "Invalid username or password.");
            RequestDispatcher rd = request.getRequestDispatcher("/index.jsp");
            rd.forward(request, response);
            //tema;
            //trimite mesaj: Logon Denied
            //in pagina de index.jsp (trebuie sa cauti un output si trebuie sa iei informatia de pe request
            //trebuie fix aici sa setezi un atribut pe request, see line 38 "request.setAttribute(LoginResult, false)
            //

        }
            }




}
