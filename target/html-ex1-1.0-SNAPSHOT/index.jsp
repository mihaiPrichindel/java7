<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <title>My First HTML Page</title>

</head>
<body>

<div align="center">
    <h2>Login page</h2>
</div>
<form action="HelloServlet" method="GET">
<div align="center">
   <table>
       <tr>
           <td>
               <label>Username</label>
           </td>
           <td>
               <input type="text" id="username" name="username"/>
           </td>
       </tr>
       <tr>
           <td>
               <label>Password</label>
           </td>
           <td>
               <input type="password" id="password" name="password"/>
           </td>
       </tr>
       <tr>
           <td colspan="2">
               <input type="submit" onclick="submitForm()" value="Login">
           </td>
       </tr>

   </table>
    <!--
    aici trebuie sa: faceti output si sa luati atributul de pe request (loginResult) de pe request
    stiti ca in jsp poti scrie cod java deci poti sa evaluezi ce request ai:
    if (loginResult == false) {
        trebuie sa construiesti un mesaj: de Ex. pass wrong
    }
    -->
    <%! String output(String input) {
        return input;
    }
    %>
    <%
        if(null!=request.getAttribute("errorMessage"))
        {
            out.println(request.getAttribute("errorMessage"));
        }
    %>

    <table>
        <tr>
            <td>
                <p>If you don't have an account - <a href="pages/register.html">Register here</a></p>
            </td>
        </tr>
    </table>

</div>

</form>

</body>
</html>