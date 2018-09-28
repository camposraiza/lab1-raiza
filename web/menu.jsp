<%@include file='cabecalho.jsp'%>

  <body>
        <h1>Página Inicial</h1>
        <form action="ListaUsers" method="post">              
            <button>Lista</button>               
        </form>
        <form action="EncerraSessao" method="post">
            <button>Sair</button>
        </form>
       <div>
        <%=request.getRemoteAddr()%>
    </div>
</body>

<%@include file='rodape.jsp'%>