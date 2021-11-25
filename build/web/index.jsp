<%-- 
    Document   : index.jsp
    Created on : 21/11/2021, 05:22:43 PM
    Author     : duvan
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <link rel="stylesheet" href="https://cdn.jsdelivr.net/npm/bootstrap@4.5.3/dist/css/bootstrap.min.css" integrity="sha384-TX8t27EcRE3e/ihU7zmQxVncDAy5uIKz4rEkgIXeMed4M0jlfIDPvg6uqKI2xXr2" crossorigin="anonymous">
        <title>Gestion de equipos</title>
    </head>
    <body>
        <main class="main col">
            <div class="row justify-content-center align-content-center text-center">
                <h1 class="title-1">Bienvenido a la app web gestión de equipos</h1>
            </div>
            <div class="columna col-lg-12">

                <div class="mx-auto mt-2">
                    <h2>Listado de acceso a las siguientes paginas: </h2>
                    <ol>
                        <li><a href="./GestionEquipos?accion=add">Agregar Equipos</a></li>
                        <li><a href="./GestionEquipos?accion=listar">Ver equipos registrados</a></li>

                    </ol>
                </div>



            </div>



        </main>
        <script src="https://code.jquery.com/jquery-3.5.1.slim.min.js" integrity="sha384-DfXdz2htPH0lsSSs5nCTpuj/zy4C+OGpamoFVy38MVBnE+IbbVYUew+OrCXaRkfj" crossorigin="anonymous"></script>
        <script src="https://cdn.jsdelivr.net/npm/popper.js@1.16.1/dist/umd/popper.min.js" integrity="sha384-9/reFTGAW83EW2RDu2S0VKaIzap3H66lZH81PoYlFhbGU+6BZp6G7niu735Sk7lN" crossorigin="anonymous"></script>
        <script src="https://cdn.jsdelivr.net/npm/bootstrap@4.5.3/dist/js/bootstrap.min.js" integrity="sha384-w1Q4orYjBQndcko6MimVbzY0tgp4pWB4lZ7lr30WKz0vr/aWKhXdBNmNb5D92v7s" crossorigin="anonymous"></script>
    </body>
</html>
