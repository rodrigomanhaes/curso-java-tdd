<html>
<%@ taglib uri="http://java.sun.com/jsf/core" prefix="f" %>
<%@ taglib uri="http://java.sun.com/jsf/html" prefix="h" %>
<f:view>
<head>
  <title>A Simple JavaServer Faces Application</title>
</head>
<body>
<h:form>
  <h3>Please enter your name and password.</h3>
  <p>
  	<h:outputLabel for="name" value="Name"/>
  	<h:inputText id="name" value="#{user.name}"/>
  </p>
  <p>
   <h:commandButton value="Login" action="login"/>
  </p>
</h:form>
</body>
</f:view>
</html>