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
<!-- TODO:
aici trebuie facut un aoutput se sa luati atributul (loginResult) de pe req.
In JSP se oate scrie cod JAVA,dec se poate evalua ce request ai:
if(login Result==false){
tebuie sa construiesti un mesaj: name/password wrong }
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