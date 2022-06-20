<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
        <%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
            <!DOCTYPE html>

            <head>
                <meta charset="UTF-8">
                <meta http-equiv="X-UA-Compatible" content="IE=edge">
                <meta name="viewport" content="width=device-width, initial-scale=1.0">
                <title>ENCARGO DE MUEBLES</title>
            </head>

            <body>
                <div>
                    <c:if test="${mensajeError!= null }">
                        <!--Si testeamos que mensaje de error es diferente a nulo, entonces-->
                        <c:out value="${mensajeError }"></c:out>
                        <!--Mostramos en la vista el mensaje de error contenido en resultado.haserror-->
                    </c:if>

                    <form:form action="" method="post" modelAttribute="auto">
                        <form:label path="nombre">Nombre</form:label>
                        <form:input type="text" path="nombre" />
                        <br>
                        <form:label path="material">Material</form:label>
                        <form:input type="text" path="material" />
                        <br>
                        <form:label path="altura">Alto</form:label>
                        <form:input type="number" path="altura" />
                        <br>
                        <form:label path="anchura">Ancho</form:label>
                        <form:input type="number" path="anchura" />
                        <br>
                        <form:label path="fondo">Fondo</form:label>
                        <form:input type="number" path="fondo" />
                        <input type="submit" value="Guardar Mueble">
                    </form:form>

                </div>
            </body>

            </html>