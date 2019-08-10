<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <title>My First HTML Page</title>

</head>
<body>

<div align="center">
    <h1>Login page</h1>
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

    <!--aici tb sa faceti output si sa luati atributul(loginResult) de pe req,
    stiti ca in jsp poti scrie cod java. deci:poti sa evaluezi ce req ai.
    if(loginResult==false){trebuie sa construiesti un mesaj:pass wrong}
    -->

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