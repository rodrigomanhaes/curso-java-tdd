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
  <table>
    <tr>
      <td>Name:</td>
      <td><h:inputText value="#{user.name}"/></td>
    </tr>
    <tr>
      <td>Password:</td>
      <td><h:inputSecret value="#{user.password}"/></td>
    </tr>
  </table>
  <p>
   <h:commandButton value="Login" action="login"/>
  </p>
</h:form>
</body>
</f:view>
</html>