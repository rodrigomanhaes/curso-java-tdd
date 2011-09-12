<html>
<%@ taglib uri="http://java.sun.com/jsf/core" prefix="f" %>
<%@ taglib uri="http://java.sun.com/jsf/html" prefix="h" %>
<f:view>
<head>
  <title>JSF funcionando!</title>
</head>
<body>
<h:form>
  <p>Bem vindo, <h:outputText value="#{user.name}"/>!</p>
</h:form>
</body>
</f:view>
</html>