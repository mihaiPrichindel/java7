<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <title>Add Clients HTML Page</title>

</head>
<body>

<div align="center">
    <h2>Add Client</h2>
</div>
<form action="AddClientController" method="GET">
<div align="center">
   <table>
       <tr>
           <th>
               <label>Nume</label>
           </th>
           <th>
               <input type="text" id="nume" name="nume"/>
           </th>
       </tr>
       <tr>
           <td>
               <label>Prenume</label>
           </td>
           <td>
               <input type="text" id="prenume" name="prenume"/>
           </td>
       </tr>
       <tr>
           <td>
               <label>CNP</label>
           </td>
           <td>
               <input type="text" id="CNP" name="CNP"/>
           </td>
       </tr>
       <tr>
           <td colspan="2" align="center">
               <input type="submit" onclick="submitForm()" value="Adauga client">
           </td>
       </tr>
   </table>


</div>

</form>



</body>
</html>