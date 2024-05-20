package py.una.pol.par.servlet01.servlets;

import py.una.pol.par.servlet01.DTOs.UsuarioDTO;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.List;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet(name = "SvUsuarios", urlPatterns = {"/SvUsuarios"})
public class SvUsuarios extends HttpServlet {

    private static List<UsuarioDTO> usuarios = new ArrayList<>();

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        try (PrintWriter out = response.getWriter()) {
            out.println("<html><body>");
            out.println("<h1>Lista de Usuarios</h1>");
            out.println("<ul>");
            for (UsuarioDTO usuario : usuarios) {
                out.println("<li>" + usuario.getCi() + " - " + usuario.getNombre() + " - " + usuario.getApellido() + " - " + usuario.getTelefono() + "</li>");
            }
            out.println("</ul>");
            out.println("</body></html>");
        }
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        String ci = request.getParameter("ci");
        String nombre = request.getParameter("nombre");
        String apellido = request.getParameter("apellido");
        String telefono = request.getParameter("telefono");

        // Esto para validar que estamos recibiendo, para probar paso a paso el proceso
        System.out.println("CI es: " + ci);
        System.out.println("Nombre es: " + nombre);
        System.out.println("Apellido es: " + apellido);
        System.out.println("Teléfono es: " + telefono);

        // Crear un objeto de tipo UsuarioDTO y agregarlo a la lista
        UsuarioDTO usuario = new UsuarioDTO(ci, nombre, apellido, telefono);
        usuarios.add(usuario);

        // Redirigir de vuelta a la página del formulario
        response.sendRedirect("index.jsp");
    }

    @Override
    public String getServletInfo() {
        return "Short description";
    }
}
