<%@ page language="java" contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1" import="java.util.List, usuario.entities.*, java.net.URLEncoder"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Listado de usuarios</title>
<link href="https://cdn.jsdelivr.net/npm/bootstrap@5.1.0/dist/css/bootstrap.min.css" rel="stylesheet">
<style>
body {
    background-color: #f8f9fa;
}

.btn-morado {
    background-color: purple !important;
    border-color: white !important;
    color: white !important;
}

.table {
    border-collapse: collapse;
    width: 100%;
    margin-top: 20px;
}

.table th {
    background-color: #d6d6d6; 
    color: purple; 
    text-align: left;
}

.table td {
    color: black; 
    background-color: #f8f9fa !important; 
    text-align: left;
    padding: 8px;
}

.container {
    padding: 20px;
}
</style>

</head>
<body>

<jsp:include page="/Proyecto/recursos/cabecera.jsp"></jsp:include>

<div class="container">
    <h2>Listado de usuarios</h2>
    <table class="table">
        <tr>
            <th>Nombre</th>
            <th>Apellidos</th>
            <th>Dni</th>
            <th>Sexo</th>
            <th>Fecha Nacimiento</th>
            <th>Email</th>
            <th>Teléfono</th>
            <th>Usuario</th>
            <th>Roles</th>
                        <th>Acciones</th>
        </tr>
        <%
        List<Usuario> usuarios = (List<Usuario>)request.getAttribute("listadoUsuarios");
        for (Usuario usuario : usuarios) {
        %>
            <tr>
                
                <td><%=usuario.getNombre()%></td>
                <td><%=usuario.getApellidos()%></td>
                <td><%=usuario.getDni()%></td>
                <td><%=usuario.getSexo()%></td>
                <td><%=usuario.getFechaNacimiento()%></td> 
                <td><%=usuario.getEmail()%></td>
                <td><%=usuario.getTelefono()%></td>
                <td><%=usuario.getNameUsuario()%></td>
                <td><%=usuario.getRoles()%></td>
                
                <td>
                    <a href="./Proyecto/signup.jsp?nombreUsuario=<%=usuario.getNombre()%>
                    &apellidosUsuario=<%=usuario.getApellidos()%>
                    &dniUsuario=<%=usuario.getDni()%>
                    &sexoUsuario=<%=usuario.getSexo()%>
                    &fechaNacimiento=<%=usuario.getFechaNacimiento()%> 
                    &emailUsuario=<%=usuario.getEmail()%>
                    &telefono=<%=usuario.getTelefono()%>
                    &nameUsuario=<%=usuario.getNameUsuario()%>
                    &contraseña=<%=usuario.getContrasena()%>
                    &accion=modificar" class="btn btn-sm btn-morado">Modificar</a><br/>
                    <a href="/Project/UsuarioServlet?dniUsuario=<%=usuario.getDni()%>&accion=eliminar" 
                    	class="btn btn-sm btn-danger">Eliminar</a>
                </td>
            </tr>
        <%
        }
        %>
    </table>
    <a href="./Proyecto/signup.jsp?accion=insertar" class="btn btn-morado">Nuevo Usuario</a>
</div>

<script src="https://cdn.jsdelivr.net/npm/bootstrap@5.1.0/dist/js/bootstrap.bundle.min.js"></script>

</body>
</html>
