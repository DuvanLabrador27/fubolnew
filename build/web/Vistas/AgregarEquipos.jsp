<%-- 
    Document   : AgregarEquipos
    Created on : 21/11/2021, 05:12:38 PM
    Author     : duvan
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <link rel="stylesheet" href="https://cdn.jsdelivr.net/npm/bootstrap@4.5.3/dist/css/bootstrap.min.css" integrity="sha384-TX8t27EcRE3e/ihU7zmQxVncDAy5uIKz4rEkgIXeMed4M0jlfIDPvg6uqKI2xXr2" crossorigin="anonymous">
        <title>Crear Equipo</title>
    </head>
    <body>
       <div class="container">
            <h1 style="text-align: center;">Registro de equipos</h1>
           
            <form class="form-group" action="./GestionEquipos" method="POST">
             <!-- <label><b>Id</b></label>
                <input class="form-control" type="text" name="txt_id"  placeholder="Ejemplo: 1" required><br> -->

              <label><b>Nombre</b></label>
                <input class="form-control" type="text" name="txt_nombre"  placeholder="Ejemplo: Barcelona" required><br>
                
                <label><b>Tecnico</b></label>
                <input class="form-control" type="text" name="txt_tecnico"  placeholder="Ejemplo: Duvan" required><br>
                
              
               
              
               <input type="submit" name="accion" value="Agregar" class="btn btn-primary"/>
                <input class="btn btn-primary" type="submit" name="accion" value="Volver" onClick="window.location.href = './GestionEquipos?accion=volver'">
            </form>
        </div> 

        <script src="https://code.jquery.com/jquery-3.5.1.slim.min.js" integrity="sha384-DfXdz2htPH0lsSSs5nCTpuj/zy4C+OGpamoFVy38MVBnE+IbbVYUew+OrCXaRkfj" crossorigin="anonymous"></script>
        <script src="https://cdn.jsdelivr.net/npm/popper.js@1.16.1/dist/umd/popper.min.js" integrity="sha384-9/reFTGAW83EW2RDu2S0VKaIzap3H66lZH81PoYlFhbGU+6BZp6G7niu735Sk7lN" crossorigin="anonymous"></script>
        <script src="https://cdn.jsdelivr.net/npm/bootstrap@4.5.3/dist/js/bootstrap.min.js" integrity="sha384-w1Q4orYjBQndcko6MimVbzY0tgp4pWB4lZ7lr30WKz0vr/aWKhXdBNmNb5D92v7s" crossorigin="anonymous"></script>
    </body>
</html>
