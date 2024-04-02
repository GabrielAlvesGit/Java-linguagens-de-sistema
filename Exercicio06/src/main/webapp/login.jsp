<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Login</title>
</head>
<body>

<%@page import="javax.servlet.http.*" %>
<%
	HttpSession sessao = request.getSession();
	sessao.setMaxInactiveInterval(300);
	
	if (sessao.getAttribute("usuarioLogado") == null)
		sessao.setAttribute("usuarioLogado", false);
	
	if (sessao.isNew() || sessao.getAttribute("usuarioLogado").equals(false)){
		out.println("<form action='VerificaLogin' method='post'>");
		out.println("<p>Usuário <input type='text' name='txUsuario' size='20'></p>");
		out.println("<p>Senha <input type='password' name='txSenha' size='20'></p>");
		out.println("<p><input type='submit' name='btEntrar' value='Entrar' size='20'></p>");
		out.println("<p>ID sessão: " + sessao.getId() + "</p>");
		out.print("</form>");
	} else {
		RequestDispatcher destino = getServletContext().getRequestDispatcher("/index.html");
		destino.forward(request, response);
	}
%>

</body>
</html>