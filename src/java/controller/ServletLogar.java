package controller;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import model.Usuarios;

public class ServletLogar extends HttpServlet {


    
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        
    String usuario = request.getParameter("usuario");
    String senha = request.getParameter("senha");
    String status="";
    Usuarios usuarios = new Usuarios();
    usuarios.setUsuario(usuario);
    usuarios.setSenha(senha);
    RequestDispatcher rd = null;
    
    if (usuarios.verficaUsuario()){
        rd = request.getRequestDispatcher("/menu.jsp");
        rd.forward(request, response);
    } else {
        request.setAttribute("erro", "Usuário ou senha inválidos");
        rd = request.getRequestDispatcher("/index.jsp");
        rd.forward(request, response);
    }
    
    
        try (PrintWriter out = response.getWriter()) {
            /* TODO output your page here. You may use following sample code. */
            out.println("<!DOCTYPE html>");
            out.println("<html>");
            out.println("<head>");
            out.println("<title>Servlet ServletLogar</title>");            
            out.println("</head>");
            out.println("<body>");
            out.println("<h1>Usuário " + usuario + "</h1>");
            out.println("<h1>Senha " + senha + "</h1>");
            out.println("<h1>Status " + status + "</h1>");
            out.println("</body>");
            out.println("</html>");
        }
    }

    // <editor-fold defaultstate="collapsed" desc="HttpServlet methods. Click on the + sign on the left to edit the code.">
    /**
     * Handles the HTTP <code>GET</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    /**
     * Handles the HTTP <code>POST</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    /**
     * Returns a short description of the servlet.
     *
     * @return a String containing servlet description
     */
    @Override
    public String getServletInfo() {
        return "Short description";
    }// </editor-fold>

}
