<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <title>My First HTML Page</title>

</head>
<body>

<div align="center">
    <h1>Adauga persoana</h1>
</div>
<form action="AddClientController" method="GET">
    <div align="center">
        <table>
            <tr>
                <td>
                    <label>Nume</label>
                </td>
                <td>
                    <input type="text" id="nume" name="nume"/>
                </td>
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
                    <input type="text" id="cnp" name="cnp"/>
                </td>
            </tr>
            <tr>
                <td colspan="2">
                    <input type="submit" onclick="submitForm()" value="AddClient">
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