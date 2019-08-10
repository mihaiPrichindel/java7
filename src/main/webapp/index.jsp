<?xml version="1.0" encoding="ISO-8859-1" ?>
<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Strict//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-strict.dtd">
<html xmlns="http://www.w3.org/1999/xhtml"
      xmlns:h="http://java.sun.com/jsf/html"
      xmlns:ui="http://java.sun.com/jsf/facelets"
      xmlns:f="http://java.sun.com/jsf/core">

<h:body>


    <h:form>

        <h:outputText value="Username:"/>
        <h:inputText id="username" value="#{controllerLogin.introducedUser}"></h:inputText>

        <br/>
        <br/>

        <h:outputText value="Password"/>
        <h:inputSecret id="password" value="#{controllerLogin.introducedPass}"></h:inputSecret>

        <h:commandButton
                action="#{controllerLogin.login()}"
                value="Login"></h:commandButton>

        <!--n
        aici trebui sa: faceti output si sa luati atributul(loginResult) de pe req.
        stiti ca in jsp poti sa scrii cod java.
        deci: poti sa evaluezi ce request ai:
        if(loginResult==false){
        trebuie sa construiesti un mesj de eroare, de Exempu:  pass wrong}
        -->

    </h:form>
</h:body>
</html>