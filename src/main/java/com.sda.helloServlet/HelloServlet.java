package com.sda.helloServlet;

import javax.servlet.ServletException;
import javax.servlet.http.*;
import javax.servlet.annotation.WebServlet;
import java.io.IOException;

import com.sda.model.ExampleModel;
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
public class HelloServlet extends HttpServlet {

//   aici variabila care sa imi spuna daca sunt autentificat;;;

    private static final String user="123";
    private static final String pass="123";
    public ClientService clientService = new ClientServiceDAO();



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

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        String id= request.getParameter("username");
        String pass=request.getParameter("password");
        if(hasRights(id,pass)){
            System.out.println(clientService.getClient().toString());
            request.setAttribute("Client", clientService.getClientList());
            processRequest(request,response);
        }else {

            //setam pe request ca si atribut clientii
            // System.out.println(clientService.getClients().toString());
            processRequest(request, response);
        }
    }

    private boolean hasRights
            (String introducedUser, String introducedPassword){
        boolean result=true;
        if(introducedUser.equals(user)&&introducedPassword.equals(pass)){
            result=true;
            System.out.println(result);
            return result;
        }

        System.out.println(result);
        return result;
        //tema: trimite mesaj: Logon Denied
        //in aceeasi pagina trebuie sa cauti un output
        // trebuei sa iei informatia de pe request, trebuie fix aici sa setezi
        //un atribut pe request,"result.setAtribute("LoginResult", false)"

    }
}