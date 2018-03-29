<%@ page language="java" contentType="text/html; charset=UTF-8"
         pageEncoding="UTF-8"%>
<%@taglib prefix="form" uri="http://www.springframework.org/tags/form" %>

<!DOCTYPE html>
<html lang="es">
<head>
    <meta charset="utf-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1">
    <!-- The above 3 meta tags *must* come first in the head; any other head content must come *after* these tags -->
    <title>Nosotros-Spring</title>

    <link rel="stylesheet"
          href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css"
          integrity="sha384-BVYiiSIFeK1dGmJRAkycuHAHRg32OmUcww7on3RYdg4Va+PmSTsz/K68vbdEjh4u"
          crossorigin="anonymous">

</head>

<body>
<div class="container">
    <div class="row">
        <div class="col-md-4">
            <form:form modelAttribute="frmPersona">
                <form:errors path="*" element="div" cssClass="alert alert-danger"></form:errors>

                <p>
                    <form:label path="nombres">Nombre</form:label>
                    <form:input cssClass="form-control" path="nombres"/>
                    <form:errors path="nombres" cssClass="text-danger"></form:errors>
                </p>
                <p>
                    <form:label path="correo">Correo</form:label>
                    <form:input cssClass="form-control" path="correo"/>
                    <form:errors path="correo" cssClass="text-danger"></form:errors>
                </p>
                <p>
                    <form:label path="edad">Edad</form:label>
                    <form:input cssClass="form-control" path="edad"/>
                    <form:errors path="edad" cssClass="text-danger"></form:errors>
                </p>
                <p>
                    <form:label path="pais">Pais</form:label>
                    <form:select path="pais" cssClass="form-control">
                        <form:option value="0">Seleccione...</form:option>
                        <form:options items="${lstPaises}"/>
                    </form:select>
                </p>
                <button type="submit" class="btn btn-success">Enviar</button>
            </form:form>
        </div>
    </div>

    <hr>

    <footer>
        <p>&copy; 2018 Company, Inc.</p>
    </footer>
</div>
<!-- /container -->
</body>
</html>
