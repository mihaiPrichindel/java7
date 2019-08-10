package com.sda.helloServlet;

import javax.servlet.ServletException;
import javax.servlet.http.*;
import javax.servlet.annotation.WebServlet;
import java.io.IOException;
import java.sql.SQLException;

import com.sda.model.*;
import com.sda.service.ClientServiceInterface;
import com.sda.service.ClientsServiceDAO;

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
    public final String username = "Shadow";
    public final String password = "test";

    public ClientServiceInterface clientService = new ClientsServiceDAO();

    public boolean hasRights(String introducedUser, String introducedPassword) {
        boolean res = false;
        if (introducedUser.equals(username) && introducedPassword.equals(password)) {
            res = true;
        }
        return res;
    }

//   aici variabila care sa imi spuna daca sunt autentificat;;;

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
        String user = request.getParameter("username");
        String password = request.getParameter("password");
        if (hasRights(user, password)) {
            System.out.println(clientService.getClient().toString());
            request.setAttribute("Clients", clientService.getClientList());
            processRequest(request, response);
        } else {

//             do nothing
//             tema:
//             trimite mesaj: Logon Denied
//             in pagina de indes. jsp (tre sa cauti un output - si trebuie sa iei informatia de pe request
//             trebuie fix aici sa setezi un atribut pe request, see line 45: request.setAttribute("LoginResult", false);
//            PrintWriter out = response.getWriter();
//            response.setContentType("text/html");
//            out.println("<script type=\"text/javascript\">");
//            out.println("alert('Wrong login details!');");
//            out.println("</script>");

            request.setAttribute("errorMessage", "Invalid username or password.");
            RequestDispatcher rd = request.getRequestDispatcher("/index.jsp");
            rd.forward(request, response);
        }

    }
}
