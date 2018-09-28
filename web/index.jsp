<%@include file='cabecalho.jsp'%>

<head>
  <meta charset=request.setCharacterEncoding("UTF-8");> 
</head>    
<body>
       <%@page session = "false" %>
    
    <p>
      <%String erro = (String) request.getAttribute("erro");
      if (erro != null) {
    %>
    <p> <%= erro%>
    <p/>
    <%}%> </p>
            
            <form action="ServletLogar" method="post">
            <div>
                <h1>Login</h1>
                <label>Usuário</label>
                <input type="text" name="usuario"/>
            </div>
            <div>
                <label>Senha</label>
                <input type="password" name="senha"/>
            </div>
             <input type="submit"/>
        </form>
    
    </body>
<%@include file='rodape.jsp'%>
