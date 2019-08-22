package com.sda.helloServlet;

import javax.servlet.ServletException;
import javax.servlet.http.*;
import javax.servlet.annotation.WebServlet;
import java.io.IOException;

import com.sda.service.ClientServiceDAO;
import com.sda.service.ClientServiceInterface;

import javax.servlet.*;
/* java TODO: care este treaba de la punctul 2?

1. facem un serviciu pe care il instantam in servlet
2. serviciul se  va ocupa de treaba pe care o avem de facut.
    serviciul va fi facut din doua bucati: o interfata si  o implementare.
3. in implementare o sa facem conexiunea la baza de date si o sa rulam queri-urile pe care le avem de rulat
4. Raspunsul va fi trimis pe response ca si obiect)
    in front end apelam: obiect.atribut => cu obligatia de a-l importa

// facem impreuna CRUD complet pe cate pagini ne tin capacele ;) ce ramane va fi tema
*/

@WebServlet("/HelloServlet") // este apelat pentru a verifica datele de intrare pentru LOGIN
public class HelloServlet extends HttpServlet{

//   aici variabila care sa imi spuna daca sunt autentificat;;;

    private void processRequest(HttpServletRequest request, HttpServletResponse response) //TODO de clarificat ce face aceasta metoda
            throws ServletException, IOException
    {
        System.out.println("Hello from HelloServlet.processRequest()");
//        ExampleModel exampleModel = new ExampleModel(); //TODO - nu inteleg ce rost au aceste linii de cod (3 la numar). In home.jsp ducem date pe care nu le regasesc aici (nume, prenume etc.
//        exampleModel.javaProperty = "Hello from servlet"; // Linii folosite in alt context
//        request.setAttribute("key",exampleModel);

        // Creating a RequestDispatcher object to dispatch the request to another resourcee
        // Creem un obiect rd de tip RequestDispatcher
        RequestDispatcher rd = request.getRequestDispatcher("/home/home.jsp"); // public interface RequestDispatcher

        // The request will be forwarded to the resource
        // specified, here the resource is a JSP named,
        // "stdlist.jsp"
        rd.forward(request, response); // transmitem raspunsul care va genera deschiderea paginii home.jsp

    }
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException,IOException{

        System.out.println("Hello from HelloServlet.doGet()");
        String introducedUsername = request.getParameter("username"); // solicita de la form username
        String introducedPassword = request.getParameter("password"); // solicita de la form password

        if(hasRight(introducedUsername, introducedPassword)) { // raspunsul hasTrue == true solicita executarea procesului

            System.out.println(clientService.getClient().toString() + "     suntem tot in HelloServlet.doGet()"); // afiseaza in consola clienttii
            request.setAttribute("Clients",clientService.getClientList()); // setam atributele request
                        // cu valorile returnate de clientService

            System.out.println("     doGet() apeleaza processRequest(request, response)");
            processRequest(request, response);
        } else {
            System.out.println("User si/sau parola incorecte");
            // TODO: trimite mesaj: Logon Denied
            //In pagina index.jsp trebuie sa cauti un output si trebuie sa iei informatia de pe request
            // trebuie sa fii aici sa setezi un atribut pe req "request.setAtribute("LoginResult", false);
            request.setAttribute("Mesaj eroare", "Logon Denied - User si/sau Password incorecte!");
            RequestDispatcher rd = request.getRequestDispatcher("/index.jsp");
            rd.forward(request, response);
        }

    }


    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException,IOException{

        System.out.println("Hello from HelloServlet.doPost()");
        String introducedUsername = request.getParameter("username"); // solicita de la form username
        String introducedPassword = request.getParameter("password"); // solicita de la form password

        if(hasRight(introducedUsername, introducedPassword)) { // raspunsul hasTrue == true solicita executarea procesului

            System.out.println(clientService.getClient().toString() + "     suntem tot in HelloServlet.doPost()"); // afiseaza in consola clienttii
            request.setAttribute("Clients",clientService.getClientList()); // setam atributele request
            // cu valorile returnate de clientService

            System.out.println("     doGet() apeleaza processRequest(request, response)");
            processRequest(request, response);
        } else {
            System.out.println("User si/sau parola incorecte");
            // TODO: trimite mesaj: Logon Denied
            //In pagina index.jsp trebuie sa cauti un output si trebuie sa iei informatia de pe request
            // trebuie sa fii aici sa setezi un atribut pe req "request.setAtribute("LoginResult", false);
            request.setAttribute("Mesaj eroare", "Logon Denied - User si/sau Password incorecte!");
            RequestDispatcher rd = request.getRequestDispatcher("/index.jsp");
            rd.forward(request, response);
        }

    }

    // Valori introduse manual pentru a putea verifica functionatii acceptarii accesului
    private static String username = "AAAA"; //TODO: de gasit solutia de postare in alta parte, pentru mai multe combinatii USER / PASSWORD
    private static String password = "1111";


    private ClientServiceInterface clientService = new ClientServiceDAO(); // stie sa faca serviciipentru mine

    private boolean hasRight(String introducedUsername, String introducedPaswword) {
        //verificare concordanta username - parola. Din ratiuni didactice, valorile de control sunt prestabilite mai sus

        boolean hasRight = false;
        System.out.println("Hello from hasRight");
        if(introducedUsername.equals(username) && introducedPaswword.equals(password)) {
            hasRight = true;
        }
        // System.out.println(hasRight); // Verificarea in consola a valorii hasRight

        return hasRight;
    }
}
